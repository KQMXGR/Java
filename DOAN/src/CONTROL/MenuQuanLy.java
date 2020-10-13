package CONTROL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuQuanLy extends JFrame{
    private JButton buttonEditThuThu;
    private JButton buttonFindSach;
    private JButton buttonAddNguoiDoc;
    private JButton buttonDeleteNguoiDoc;
    private JButton buttonEditNguoiDoc;
    private JButton buttonAddSach;
    private JButton buttonEditSach;
    private JButton buttonFindNguoiDoc;
    private JButton buttonLocSach;
    private JButton buttonCheckTDG;
    private JButton buttonGiaHanTDG;
    private JButton buttonLogout;
    private JButton buttonEditTrangThaiSach;
    private JPanel panelThuThu;

    public MenuQuanLy(){
        super("Dashboard Admin");
        this.setContentPane(this.panelThuThu);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        buttonLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                setVisible(false);
            }
        });
    }
}
