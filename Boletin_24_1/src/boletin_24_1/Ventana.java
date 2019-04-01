/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package boletin_24_1;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    JPanel pane1, pane2;
    JLabel labNombre, labClave;
    JTextField textNombre;
    JPasswordField textClave;
    JButton btnEntrar, btnLimpiar;
    
    void mostrar() {
        this.setSize(650, 750);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setResizable(false);
        pane1 = new JPanel();
        pane1.setSize(600, 350);
        pane1.setBackground(Color.red);
        this.add(pane1, BorderLayout.NORTH);

        btnEntrar = new JButton("ENTRAR");
        pane1.add(btnEntrar);
        

        pane2 = new JPanel();
        pane2.setSize(600, 350);
        pane2.setBackground(Color.yellow);
        this.add(pane2, BorderLayout.WEST);
        btnLimpiar = new JButton("LIMPIAR");
        pane2.add(btnLimpiar);
    }
}