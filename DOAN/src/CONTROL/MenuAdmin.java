package CONTROL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdmin extends JFrame{
    private JButton buttonEditAdmin;
    private JButton buttonEditThuThu;
    private JButton buttonDeleteThuThu;
    private JButton buttonFindThuThu;
    private JButton buttonAddThuThu;
    private JButton buttonFogotPassword;
    private JButton buttonLogout;
    private JPanel panelAdmin;

    public MenuAdmin(){
        super("Dashboard Admin");
        this.setContentPane(this.panelAdmin);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        buttonLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                panelAdmin.setVisible(false);
            }
        });
    }

}
