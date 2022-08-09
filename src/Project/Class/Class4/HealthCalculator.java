package Project.Class.Class4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthCalculator extends JFrame implements ActionListener {
    //�����ı������
    JTextField height,weight;
    //�����ı������
    JTextArea result;
    //���尴ť���
    JButton calculate,clear;

    public HealthCalculator(){
        //���ò��ֹ�����
        setLayout(new FlowLayout());
        height = new JTextField(10);
        weight = new JTextField(10);
        //�����ı�����
        weight.setText("�������� (����)");
        height.setText("������� (cm)");
        add(height);
        add(weight);
        //���ð�ť����
        calculate = new JButton("����");
        clear = new JButton("����");
        add(calculate);
        add(clear);

        result = new JTextArea(6, 24);
        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);
    }
    //ע�ᶯ���¼�������
    @Override
    public void actionPerformed(ActionEvent e) {
        //���尴ť
        JButton button = (JButton) e.getSource();
        //�жϰ�ť���ı�������ڼ���
        if (button.getText() == "����") {
            //ʹ��try-catch����ֹ�����쳣
            try {
                double h = Double.parseDouble(height.getText());
                double w = Double.parseDouble(weight.getText());
                int r = 0;
                //String showTest;
                r = (int) (100 * 100 * w / h / h);
                if (r < 20) {
                    result.append("BMI=" + r + "\n" + "̫���ˣ�Ҫ����Ӫ����");
                } else if (r <= 25) {
                    result.append("BMI=" + r + "\n" + "��ϲ�㣬��׼���ͣ�");
                } else
                    result.append("BMI=" + r + "\n" + "���ڷ��֣�Ҫ���ʼ�ǿ����!");
                result.append("\n");
            } catch (Exception exception) {
                result.setText("��ߺ�����ֻ�������֣�");
            }
        }else{
            weight.setText("�������� (����)");
            height.setText("������� (cm)");
        }
    }
    //��main��������
    public static void main(String[] args) {
        HealthCalculator win = new HealthCalculator();
        //�����������
        win.setTitle("����������");
        //���������С
        win.setSize(500, 280);
        //��ʾ���
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}