import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleDigitalClock extends JFrame {
    private JLabel timeLabel;
    private boolean is24HourFormat = true;
    private Calendar calendar;

    public SimpleDigitalClock() {
        calendar = Calendar.getInstance();
        timeLabel = new JLabel(getFormattedTime());
        timeLabel.setFont(new Font("Arial", Font.BOLD, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(timeLabel, BorderLayout.CENTER);

        JButton setTimeButton = new JButton("Set Time");
        setTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTime();
            }
        });

        JButton toggleFormatButton = new JButton("Toggle 12/24 Hour");
        toggleFormatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is24HourFormat = !is24HourFormat;
                updateTime();
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(setTimeButton);
        controlPanel.add(toggleFormatButton);

        panel.add(controlPanel, BorderLayout.SOUTH);

        add(panel);

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                calendar.add(Calendar.SECOND, 1);
                updateTime();
            }
        }, 0, 1000);

        setTitle("Digital Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private String getFormattedTime() {
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        String period = "";

        if (!is24HourFormat) {
            period = (hours < 12) ? " AM" : " PM";
            hours = hours % 12;
            if (hours == 0) {
                hours = 12;
            }
        }

        return String.format("%02d:%02d:%02d%s", hours, minutes, seconds, period);
    }

    private void setTime() {
        JTextField hoursField = new JTextField(2);
        JTextField minutesField = new JTextField(2);
        JTextField secondsField = new JTextField(2);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Hours:"));
        panel.add(hoursField);
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Minutes:"));
        panel.add(minutesField);
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Seconds:"));
        panel.add(secondsField);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Set Time", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int hours = Integer.parseInt(hoursField.getText());
                int minutes = Integer.parseInt(minutesField.getText());
                int seconds = Integer.parseInt(secondsField.getText());

                calendar.set(Calendar.HOUR_OF_DAY, hours);
                calendar.set(Calendar.MINUTE, minutes);
                calendar.set(Calendar.SECOND, seconds);
                updateTime();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
            }
        }
    }

    private void updateTime() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                timeLabel.setText(getFormattedTime());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleDigitalClock().setVisible(true);
            }
        });
    }
}
