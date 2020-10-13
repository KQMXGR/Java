package CONTROL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Login extends JFrame {
    private JPanel panelLogin;
    private JButton buttonLogin;
    private JTextField textFieldUsername;
    private JPasswordField passwordFieldPassword;

    public Login(){
        super("Đăng Nhập");
        this.setContentPane(this.panelLogin);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuQuanLy menuQuanLy = new MenuQuanLy();
                setVisible(false);
            }
        });
    }

}
