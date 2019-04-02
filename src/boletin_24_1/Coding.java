/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package boletin_24_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coding extends JFrame implements ActionListener{
    JPanel jPanel1, jPanel2, jPanel3;
    JLabel jLabel1, jLabel2;
    JTextField jTextField1;
    JPasswordField jPasswordField1;
    JButton jButton1, jButton2, jButton3;
    JTextArea jTextArea1;
    JList jList1;
    String[] list = {"DAM1", "DAM2", "ASIR1", "ASIR2"};

    void mostrar(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel("NOMBRE");
        jLabel2 = new JLabel("PASSWORD");
        jTextField1 = new JTextField(10);
        jPasswordField1 = new JPasswordField(10);
        jTextArea1 = new JTextArea("", 5, 10);
        jList1 = new JList(list);
        jButton1 = new JButton("ENTRAR");
        jButton2 = new JButton("LIMPIAR");
        jButton3 = new JButton("BOTON");
        jPanel1.setSize(650, 750);
        jPanel2.setSize(250, 300);
        jPanel3.setSize(250, 300);
        jPanel1.setBackground(Color.GREEN);
        jPanel2.setBackground(Color.RED);
        jPanel3.setBackground(Color.BLUE);
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        jTextArea1.setEditable(false);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jPanel1.add(jPanel2);
        jPanel1.add(jPanel3);
        jPanel2.add(jLabel1);
        jPanel2.add(jTextField1);
        jPanel2.add(jLabel2);
        jPanel2.add(jPasswordField1);
        jPanel2.add(jButton1);
        jPanel2.add(jButton2);
        jPanel3.add(jList1);
        jPanel3.add(jButton3);
        jPanel3.add(jTextArea1);
        this.setSize(650, 750);
        this.setTitle("Coding");
        this.setResizable(false);
        this.add(jPanel1);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == jButton1){
            if(!jTextField1.getText().isEmpty() && !jPasswordField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Has entrado correctamente", "Login", 1);
                }else{
                    JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos", "Login", 2);
                }
        }else if(e.getSource() == jButton2){
            jTextField1.setText("");
            jPasswordField1.setText("");
        }else if(e.getSource() == jButton3){
            if(!jList1.isSelectionEmpty()){
                jTextArea1.setText(jTextField1.getText() + "\n" + jList1.getSelectedValue());
            }
        }
    }
}