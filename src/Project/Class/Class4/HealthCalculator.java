package Project.Class.Class4;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthCalculator extends JFrame implements ActionListener {

    JTextField height,weight;
    JTextArea result;
    JButton calculate,clear;
    BasicOptionPaneUI.ButtonActionListener listener;

    public HealthCalculator(){
        setLayout(new FlowLayout());
        height = new JTextField(10);
        weight = new JTextField(10);
        weight.setText("输入体重 (公斤)");
        height.setText("输入身高 (cm)");
        add(height);
        add(weight);
        calculate = new JButton("计算");
        clear = new JButton("清零");
        add(calculate);
        add(clear);

        result = new JTextArea(6, 24);
        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText() == "计算") {
            try {
                double h = Double.parseDouble(height.getText());
                double w = Double.parseDouble(weight.getText());
                int r = 0;
                //String showTest;
                r = (int) (100 * 100 * w / h / h);
                if (r < 20) {
                    result.append("BMI=" + r + "\n" + "太轻了，要补充营养。");
                } else if (r <= 25) {
                    result.append("BMI=" + r + "\n" + "恭喜你，标准体型！");
                } else
                    result.append("BMI=" + r + "\n" + "过于肥胖，要减肥加强锻炼!");
                result.append("\n");
            } catch (Exception exception) {
                result.setText("身高和体重只能是数字！");
            }
        }else{
            weight.setText("输入体重 (公斤)");
            height.setText("输入身高 (cm)");
        }
    }

    public static void main(String[] args) {
        HealthCalculator win = new HealthCalculator();
        win.setTitle("健康计算器");
        win.setSize(500, 280);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
