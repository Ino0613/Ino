package Project.Class.Class4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthCalculator extends JFrame implements ActionListener {
    //定义文本框组件
    JTextField height,weight;
    //定义文本域组件
    JTextArea result;
    //定义按钮组件
    JButton calculate,clear;

    public HealthCalculator(){
        //设置布局管理器
        setLayout(new FlowLayout());
        height = new JTextField(10);
        weight = new JTextField(10);
        //设置文本内容
        weight.setText("输入体重 (公斤)");
        height.setText("输入身高 (cm)");
        add(height);
        add(weight);
        //设置按钮内容
        calculate = new JButton("计算");
        clear = new JButton("清零");
        add(calculate);
        add(clear);

        result = new JTextArea(6, 24);
        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);
    }
    //注册动作事件监听器
    @Override
    public void actionPerformed(ActionEvent e) {
        //定义按钮
        JButton button = (JButton) e.getSource();
        //判断按钮的文本如果等于计算
        if (button.getText() == "计算") {
            //使用try-catch语句防止数据异常
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
    //用main方法运行
    public static void main(String[] args) {
        HealthCalculator win = new HealthCalculator();
        //设置组件标题
        win.setTitle("健康计算器");
        //设置组件大小
        win.setSize(500, 280);
        //显示组件
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}