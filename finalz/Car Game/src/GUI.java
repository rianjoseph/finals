
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Axzen
 */
public class GUI {

    JFrame frame;
    JPanel panel;
    control control;
    JLabel bg;
    int speed;

    public GUI() {
        speed = 10;
        control = new control(this);
        initGUI();
    }

    private void initGUI() {
        frame = new JFrame("2D CAR GAME");
        frame.setLayout((null));

        bg = new JLabel("", new ImageIcon("road.png"), JLabel.CENTER);
        bg.setBounds(0, 0, 600, 783);

        panel = new JPanel();
        panel.setSize(50, 150);
        JLabel car = new JLabel(new ImageIcon("car.png"));

        panel.add(car);
        panel.setLocation(270, 600);
        Color background = Color.decode("#000000");
        panel.setBackground(background);

        frame.add(bg);
        frame.add(panel);
        bg.add(panel);

        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(control);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
