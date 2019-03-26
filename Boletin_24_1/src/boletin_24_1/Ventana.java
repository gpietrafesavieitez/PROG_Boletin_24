/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package boletin_24_1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    JPanel panel;
    
    public void crear() {
        this.setSize(800,600);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        this.add(panel);
    }
}