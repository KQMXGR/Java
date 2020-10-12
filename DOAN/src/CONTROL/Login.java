package CONTROL;

import javax.swing.*;

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
        this.setResizable(false);
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

}
