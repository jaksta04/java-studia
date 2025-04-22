import javax.swing.*;
import java.awt.*;


public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Aplikacja");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        JPanel panel = new JPanel();

        JButton draw = new JButton("Rysuj");

        JPanel drawArea = new JPanel();
        drawArea.setBackground(Color.MAGENTA);
        drawArea.setBounds(100,100,60,60);
        panel.add(draw,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }
}