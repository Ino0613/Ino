package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Userservice extends JPanel implements ActionListener {

    private JButton[] button = new JButton[2];
    private JPanel p1,p2, p3;

    public Userservice() {
        p1 = new JPanel(new BorderLayout());
        p2 = new JPanel();
        p1.add(p2, "North");
        String[] st = {"修改个人信息", "账单查询"};

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(st[i]);
            button[i].addActionListener(this);
            p2.add(button[i]);
        }
        p3 = new JPanel();
        p1.add(p3, "Center");
        //p3.add(new Billsearch());
        this.add(p1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "修改个人信息") {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new Changeowninfo());
            p3.setVisible(true);
        }
        if (e.getActionCommand() == "账单查询") {
            p3.setVisible(false);
            p3.removeAll();
            //p3.add(new Billsearch());
            p3.setVisible(true);
        }
    }
}
