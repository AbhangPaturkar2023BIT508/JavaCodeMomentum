import java.io.*;

import javax.swing.JOptionPane;

class Abhang {
    public static void main(String[] args) {
        Abhang obj = new Abhang();
        obj.exploreLocation("F:/SGGS/JavaCodeMomentum/ExamPrep");
        
    }

    void exploreLocation(String loc){
        File f = new File(loc);
        String s[] = f.list();
        int jc = 0, tc = 0;
        for(String s1: s){
            if(s1.endsWith(".java")){
                jc++;
            }else if(s1.endsWith(".txt")){
                tc++;
            }
        }

        String msg = "Java file"+jc+"\nTex File: "+tc;

        JOptionPane.showMessageDialog(null, msg, "file", JOptionPane.INFORMATION_MESSAGE);
    }
}
