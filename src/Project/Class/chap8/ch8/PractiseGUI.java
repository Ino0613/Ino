/*代码8.11*/
package Project.Class.chap8.ch8;

import Project.Class.chap8.cbsc.cha3.BinaryOperation_3_2;
import Project.Class.chap8.cbsc.cha3.Exercise_3_2_3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PractiseGUI extends JFrame {
	static final int WINDOW_WIDTH = 580;
	static final int WINDOW_HEIGHT = 300;
	static final int OP_AMOUNT = 20;
	static final int OP_COLUMN = 5;
	static final int OP_WIDTH = 65;
	static final int ANSWER_WIDTH = 35;
	static final int COMPONET_HEIGHT = 25;

	private JPanel contentPane;
	private JTextField[] tfOp;
	private JTextField[] tfAns;
	private JTextArea taStat;

	private Exercise_3_2_3 exercises;
	private int correctAmount;
	private int wrongAmount;
	private float correctRatio;
	private float wrongRatio;

	private void initExerciseComponets() {
		exercises = new Exercise_3_2_3();
		// exercises.generateAdditionExercise(OP_AMOUNT);
		exercises.generateBinaryExercise(OP_AMOUNT);
		tfOp = new JTextField[OP_AMOUNT];
		tfAns = new JTextField[OP_AMOUNT];
		for (int i = 0; i < OP_AMOUNT; i++) {
			tfOp[i] = new JTextField();
			tfOp[i].setBounds(20 + (i % OP_COLUMN) * (OP_WIDTH + ANSWER_WIDTH + 5),
					20 + (i / OP_COLUMN) * (COMPONET_HEIGHT + 10), OP_WIDTH, COMPONET_HEIGHT);
			tfOp[i].setHorizontalAlignment(JTextField.RIGHT);
			tfOp[i].setEditable(false);
			contentPane.add(tfOp[i]);

			tfAns[i] = new JTextField();
			tfAns[i].setBounds(20 + OP_WIDTH + (i % OP_COLUMN) * (OP_WIDTH + ANSWER_WIDTH + 5),
					20 + (i / OP_COLUMN) * (COMPONET_HEIGHT + 10), ANSWER_WIDTH, COMPONET_HEIGHT);
			contentPane.add(tfAns[i]);
		}
	}

	private void updateExerciseComponets() {
		BinaryOperation_3_2 op;
		for (int i = 0; i < OP_AMOUNT; i++) {
			op = exercises.getOperation(i);
			tfOp[i].setText(op.asString());
			tfAns[i].setBackground(Color.WHITE);
			tfAns[i].setText("");
		}
		taStat.setText("统计信息：\n总题数：" + OP_AMOUNT + "\t正确题数：\t错误题数：\n\t正确率：\t错误率：");
	}

	private void judge() {
		BinaryOperation_3_2 op;
		correctAmount = wrongAmount = 0;
		for (int i = 0; i < OP_AMOUNT; i++) {
			op = exercises.getOperation(i);
			String result = String.valueOf(op.getResult());
			String answer = tfAns[i].getText().trim();
			if (result.equals(answer)) {
				tfAns[i].setBackground(Color.GREEN);
				correctAmount++;
			} else {
				tfAns[i].setBackground(Color.RED);
				wrongAmount++;
			}
		}
		correctRatio = (float) correctAmount / OP_AMOUNT;
		wrongRatio = 1 - correctRatio;
		taStat.setText("统计信息：\n总题数：" + OP_AMOUNT + "\t正确题数：" + correctAmount + "\t错误题数：" + wrongAmount + "\n\t正确率："
				+ String.format("%.0f", correctRatio * 100) + "%\t错误率：" + String.format("%.0f", wrongRatio * 100)
				+ "%");
	}

	private void judgeFromDB() {
		correctAmount = wrongAmount = 0;
		// connect to database
		Connection dbConn;
		Statement stmt;
		ResultSet rs;
		String result;
		int i = 0;
		try {
			dbConn = (Connection) DBUtil.getConnection();
			stmt = (Statement) dbConn.createStatement();
			rs = stmt.executeQuery("select Result from Questions");
			
			while (rs.next()) {
				result = rs.getString(1);
				System.out.println(rs.getString(1));
				String answer = tfAns[i].getText().trim();
				if (result.equals(answer)) {
					tfAns[i].setBackground(Color.GREEN);
					correctAmount++;
				} else {
					tfAns[i].setBackground(Color.RED);
					wrongAmount++;
				}
				i++;
			}
			dbConn.close();

		} catch (SQLException e) {
			System.out.println("cannot get answers " + e);
		}
		// }
		correctRatio = (float) correctAmount / OP_AMOUNT;
		wrongRatio = 1 - correctRatio;
		taStat.setText("统计信息：\n总题数：" + OP_AMOUNT + "\t正确题数：" + correctAmount + "\t错误题数：" + wrongAmount + "\n\t正确率："
				+ String.format("%.0f", correctRatio * 100) + "%\t错误率：" + String.format("%.0f", wrongRatio * 100)
				+ "%");

	}

	public PractiseGUI() {

		setTitle("口算练习");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnGenrate = new JButton("重新生成题目");
		btnGenrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exercises.clear();
				exercises.generateBinaryExercise(OP_AMOUNT);
				updateExerciseComponets();
			}
		});
		btnGenrate.setBounds(32, 168, 123, 23);
		contentPane.add(btnGenrate);

		JButton btnSubmit = new JButton("提交答案");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//judge();
				 judgeFromDB();
			}
		});
		btnSubmit.setBounds(32, 208, 123, 23);
		contentPane.add(btnSubmit);

		taStat = new JTextArea();
		taStat.setEditable(false);
		taStat.setBounds(200, 168, 293, 63);
		taStat.setText("统计信息：\n总题数：" + OP_AMOUNT + "\t正确题数：\t错误题数：\n\t正确率：\t错误率：");
		contentPane.add(taStat);

		initExerciseComponets();
		updateExerciseComponets();
	}

	public static void main(String[] args) {
		PractiseGUI practise_1 = new PractiseGUI();

		practise_1.setVisible(true);
		practise_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
