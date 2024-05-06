package AlgoCrazzy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sWIP {
    private JPanel mainPanel;
    private JTextField texto;
    private JButton Aceptar;
    private JPasswordField contraeña;
    private JLabel Contrasena;
    private JLabel Usuario;

    public sWIP() {
        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
                contraeña.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SISAISMAEL");
        frame.setContentPane(new sWIP().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(500,200);
        frame.setVisible(true);
    }

}
