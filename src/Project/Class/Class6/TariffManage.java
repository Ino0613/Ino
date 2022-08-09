package Project.Class.Class6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TariffManage extends JPanel implements ActionListener {

    private JPanel p1,p2, p3;
    private JButton addtariff,tarifflist,tariffchange;

    public TariffManage(){
        p1 = new JPanel(new BorderLayout());
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(p2, "North");

        addtariff = new JButton("添加资费");
        addtariff.addActionListener(this);
        p2.add(addtariff);

        tarifflist = new JButton("资费列表");
        tarifflist.addActionListener(this);
        p2.add(tarifflist);

        tariffchange = new JButton("资费修改");
        tariffchange.addActionListener(this);
        p2.add(tariffchange);

        p3 = new JPanel();
        p1.add(p3);
        p3.add(new TariffList());
        this.add(p1);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tarifflist) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new TariffList());
            p3.setVisible(true);
        }
        if (e.getSource() == addtariff) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new AddTariff());
            p3.setVisible(true);
        }
        if (e.getSource() == tariffchange) {
            p3.setVisible(false);
            p3.removeAll();
            p3.add(new TariffManage_New());
            p3.setVisible(true);
        }
    }
}
