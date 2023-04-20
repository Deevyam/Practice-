import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class DemoPic {
    DemoPic()
        {

        JFrame f = new JFrame("Add Image Icon to JButton");
        Icon icon = new ImageIcon("src=https://www.himgs.com/imagenes/hello/common/hello-logo-solo.svg");
        JButton btn = new JButton(icon);
        btn.setBounds(100,100,200,200);
        f.add(btn);
        f.setSize(400,550);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new DemoPic();
    }
}