 import javax.swing.*;

 public class JFrameExample {
    public static void main(String s[]) {
        JFrame a= new JFrame("JFrame Example");
     JButton b =new JButton("submit");
        b.setBounds(40,90,85,20);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);


    }  }