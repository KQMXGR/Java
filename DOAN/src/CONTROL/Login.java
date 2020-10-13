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
                String user = textFieldUsername.getText();
                String pass = passwordFieldPassword.getText();
                if(user.equals("admin")&&pass.equals("admin")){
                    JOptionPane.showMessageDialog(null,"Đăng Nhập Thành Công");
                    MenuAdmin menuAdmin = new MenuAdmin();
                    setVisible(false);
                }else if(user.equals("thuthu")&&pass.equals("thuthu")){
                    JOptionPane.showMessageDialog(null,"Đăng Nhập Thành Công");
                    MenuQuanLy menuQuanLy = new MenuQuanLy();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Đăng Nhập Thất Bại");
                }
            }
        });
    }

}
