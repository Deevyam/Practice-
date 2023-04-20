import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckButton extends JFrame
{
    private JButton button1, button2;
    private JLabel label;

    public static void main(String[] args) {
        new CheckButton();
    }

    public CheckButton()
    {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Click event");
        this.setLayout(null);

        Clicklistener click = new Clicklistener();

        button1 = new JButton ("Button1");
        button1.setBounds(100,100,100,40);
        button1.setBackground(Color.red);
        button1.addActionListener(click);

        button2 = new JButton ("Button2");
        button2.setBounds(200,100,100,40);
        button2.setBackground(Color.blue);
        button2.addActionListener(click);

        label = new JLabel();
        label.setBounds(100,150,150,20);

        this.add(button1);
        this.add(button2);
        this.add(label);
        this.setVisible(true);
    }

    private class Clicklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == button1)
            {
                label.setText("Button 1 is clicked!");
            }

            if (e.getSource() == button2)
            {
                label.setText("Button2 is clicked!");
            }
        }
    }
}