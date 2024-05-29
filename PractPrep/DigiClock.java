import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;;

class Clock implements ActionListener {
    private JFrame jf;
    private JLabel jl;
    private JButton jb;
    private boolean is24HoursFormat = false;

    Clock() {
        jf = new JFrame("DigiClock");
        jl = new JLabel();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jl);
        jf.setVisible(true);
        jf.setSize(400, 200);
        jb = new JButton("12-24Hrs Format");
        jf.add(jb);
        jb.addActionListener(this);
        jf.setLayout(new FlowLayout());

        time();
    }

    public void actionPerformed(ActionEvent e) {
        if (is24HoursFormat == false) {
            is24HoursFormat = true;
        } else {
            is24HoursFormat = false;
        }
    }

    void time() {
        while (true) {

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentTimeMillis = System.currentTimeMillis();

            // Convert milliseconds to seconds
            long totalSeconds = currentTimeMillis / 1000;

            // Calculate seconds
            long seconds = totalSeconds % 60;

            // Calculate total minutes
            long totalMinutes = totalSeconds / 60;

            // Calculate minutes
            long minutes = (totalMinutes + 30) % 60;

            // Calculate total hours
            long totalHours = (totalMinutes + 30) / 60;
            String period = "";
            long hours;
            hours = (totalHours + 5) % 24;

            // Calculate hours (taking into account the time zone offset)
            if (!is24HoursFormat) {
                hours = (totalHours + 5) % 12; // Assuming your local time is 5 hours ahead of GMT

                if (hours == 0) {
                    hours = 12;
                }

                if (totalHours >= 12) {
                    period = "AM";
                } else {
                    period = "PM";
                }
            }

            // Print the current time in hours, minutes, and seconds format
            System.out.println("Current time: " + hours + " hours, " + minutes + "minutes, " + seconds + " seconds");
            String t = hours + ":" + minutes + ":" + seconds + " " + period;
            jl.setText(t);
        }

    }
}

class CurrentTimeWithoutBuiltInMethods extends Thread {
    public static void main(String[] args) {
        // Get the current time in milliseconds
        new Clock();

    }
}
