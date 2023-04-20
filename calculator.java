import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame implements ActionListener {
    JLabel lbl1, lbl2, lbl3,lbl4,lbl5,lbl6;
    JButton btn1,btn2,btn3,btn4;
    JTextField f1, f2, f3,f4,f5,f6;

    MyFrame3(){
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        btn1=new JButton("Sum");
        lbl1=new JLabel("Enter First Number:");
        lbl2=new JLabel("Enter Second Number:");
        lbl3=new JLabel("Sum Of Numbers:");
        lbl4=new JLabel("Sub Of Numbers:");
        lbl5=new JLabel("Division Of Numbers:");
        lbl6=new JLabel("multiplication Of Numbers:");
        f1=new JTextField();
        f2=new JTextField();
        f3=new JTextField();
        f4=new JTextField();
        f5=new JTextField();
        f6=new JTextField();

        add(btn1);
        add(btn3);
        add(btn3);
        add(btn4);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(f1);
        add(f2);
        add(f3);
        add(f4);
        add(f5);
        add(f6);

/*
        lbl1.setBounds(40,10,150,50);
        lbl2.setBounds(40,60,150,50);
        lbl3.setBounds(70,110,150,50);
        lbl4.setBounds(70,110,150,50);
        lbl5.setBounds(70,110,150,50);
        lbl6.setBounds(70,110,150,50);
        f1.setBounds(200,25,150,20);
        f2.setBounds(200,75,150,20);
        f3.setBounds(200,125,150,20);
        f4.setBounds(200,125,150,20);
        f5.setBounds(200,125,150,20);
        f6.setBounds(200,125,150,20);
        btn1.setBounds(180,175,80,20);
        btn2.setBounds(180,175,80,20);
        btn3.setBounds(180,175,80,20);
        btn4.setBounds(150,175,80,20);*/
        btn1.addActionListener(this);
        setTitle("Sum Of Two Numbers");
        btn2.addActionListener(this);
        setTitle("Sub Of Two Numbers");
        btn3.addActionListener(this);
        setTitle("Division Of Two Numbers");
        btn4.addActionListener(this);
        setTitle("MultiplicationOf Two Numbers");
    }
    @Override
    public void actionPerformed(ActionEvent AE) {
        String num1=f1.getText();
        String num2=f2.getText();
        int numb1=Integer.parseInt(num1);
        int numb2=Integer.parseInt(num2);
        if (AE.getSource()==btn1)
        {
            long res =numb1+numb2;
            f3.setText(""+ res);
        }
        else if (AE.getSource()==btn2)
        {
            long res =numb1-numb2;
            f4.setText(""+ res);
        }
        else if (AE.getSource()==btn3)
        {
            long res =numb1/numb2;
            f5.setText(""+ res);
        }
         else if (AE.getSource()==btn4)
        {
            long res =numb1*numb2;
            f6.setText(""+ res);
        }
    }
}
public class calculator{
    public static void main(String[] args) {
        MyFrame3 fm3= new MyFrame3();
    }
}
