
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Axzen
 */
public class control implements KeyListener {

    GUI game;

    public control(GUI arrow) {
        this.game = arrow;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ar) {

        int pressed = ar.getKeyCode();

        if (pressed == 37) {
            System.out.println("Left Turn");
            int a = game.panel.getX();
            int b = game.panel.getY();

            if (a - game.speed >= 0) {
                game.panel.setLocation(a - game.speed, b);
            }

        } else if (pressed == 39) {
            System.out.println("Right Turn");
            int a = game.panel.getX();
            int b = game.panel.getY();
            

            int width = game.frame.getWidth();
            int carWidth = game.panel.getWidth();

            if (a + game.speed + carWidth <= width) {
                game.panel.setLocation(a + game.speed, b);

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
