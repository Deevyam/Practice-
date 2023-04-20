import javax.swing.*;
public class RadioButton {
    JFrame frame;
    RadioButton(){
        frame=new JFrame();
        JLabel label1 = new JLabel();
        label1.setText("<html><h1>COMPU HELP IS: </h1></html>");
        label1.setBounds(0, 0, 200, 50);
        JRadioButton r1=new JRadioButton("A) Best");
        JRadioButton r2=new JRadioButton("B) Bestest ");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        frame.add(label1);
        frame.add(r1);frame.add(r2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButton();
    }
}