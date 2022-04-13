package Project.Class.Class3.cbsc.cha4;
/*
 * 重新构造第4章的构造任务4，实现：
 * 1. 多种exercises数据存入CSV文件，文件命名依据4.8.1， p.124
 * 2. 把CSV文件，内容是二元算式的练习，可能含无关符号，读入内存、识别和处理，构成exercises,或者ArrayList对象
 *    读入CSV的防御性编程，简单使用正则表达式处理，没有考虑是否是合规的二元算式
 * produce 10 set of addition exercises using Exercise_3_2_3
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import Project.Class.Class3.cbsc.cha3.AdditionOperation;
import Project.Class.Class3.cbsc.cha3.BinaryOperation_3_2;
import Project.Class.Class3.cbsc.cha3.ExerciseType;
import Project.Class.Class3.cbsc.cha3.Exercise_3_2_3;
import Project.Class.Class3.cbsc.cha3.SubstractOperation;

public class ExerciseFiles {

	// 写CSV格式的练习，一次性产生文件的个数、每个练习中算式的数量、算式类型
	public void saveCSVExercises(int fileNumber, int operationCounter, ExerciseType boType) {
		String dir = "E:\\data";
		// 防御性编程的例子：
		short opCounter = (operationCounter > 200 || operationCounter < 0) ? 50 : (short) operationCounter;
		short fileCounter = (fileNumber > 20 || fileNumber < 0) ? 10 : (short) fileNumber;

		Exercise_3_2_3 exercise = new Exercise_3_2_3();

		switch (boType) {
			case ADD_ONLY: {
				String fileNameStub = dir + "\\exercise_add_" + opCounter + "_";
				exercise.generateAdditionExercise(opCounter);
				writeCSVExercises(fileCounter, fileNameStub, exercise);
				break;
			}
			case SUB_ONLY: {
				String fileNameStub = dir + "\\exercise_sub_" + opCounter + "_";
				exercise.generateSubstractExercise(opCounter);
				writeCSVExercises(fileCounter, fileNameStub, exercise);
				break;
			}
			case ADD_AND_SUB: {
				String fileNameStub = dir + "\\exercise_mix_" + opCounter + "_";
				exercise.generateBinaryExercise(opCounter);
				writeCSVExercises(fileCounter, fileNameStub, exercise);
				break;
			}
			default:
				System.out.println("错误：不是定义的预期算式类型！建议：异常或者缺省为加法算式处理。");
		}
	}

	private void writeCSVExercises(short fileCounter, String fileNameStub, Exercise_3_2_3 exercise) {
		File wfile1;
		Writer out;
		for (int i = 1; i <= fileCounter; i++) {
			wfile1 = new File(fileNameStub + i + ".txt");
			try {
				//out = new FileWriter(wfile, true);
				//file：要写入数据的 File 对象。
				//append：如果 append 参数为 true，则将字节写入文件末尾处，相当于追加信息。如果 append 参数为 false, 则写入文件开始处。
				out = new FileWriter(fileNameStub + i + ".txt", true);
				for (BinaryOperation_3_2 op : exercise.getOperations()) {
					out.write(op.toString() + ",");
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println("ERROR: " + e);
			}
			System.out.println("Produce an exercise and saved in " + fileNameStub + i + ".txt");
		}
	}

	// 把练习中的每道算式结果存入csv文件
	public void saveExerciseAnswers(Exercise_3_2_3 exercise, String fileName) {
		Writer out;
		try {
			out = new FileWriter(new File(fileName + ".txt"), true);
			for (BinaryOperation_3_2 op : exercise.getOperations()) {
				out.write(op.getResult() + ",");
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR: " + e);
		}
	}

	// 从csv文件读取练习结果存入数组
	public ArrayList<Integer> readExerciseAnswers(File resultFile) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		String eqString;
		try {
			Scanner sc = new Scanner(resultFile);
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				// 处理任意的\t，\f， \n等
				eqString = sc.next().replaceAll("\\s", "");
				aList.add(Integer.parseInt(eqString.replaceAll("[\\s\\D\\p{Punct}]+", "")));
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("ERROR: " + e);
		}
		return aList;
	}

	// read in a file each as "3+5", "7A3 - 32？" as "73-32",convert to Operation add
	// in Exercise
	public Exercise_3_2_3 readCSVExercise(File aFile) {
		Exercise_3_2_3 exercise = new Exercise_3_2_3();
		String eqString, bop;
		BinaryOperation_3_2 operation;
		try {
			Scanner sc = new Scanner(aFile);
			sc.useDelimiter(",");

			while (sc.hasNext()) {
				// 处理任意的\t，\f， \n等
				eqString = sc.next().replaceAll("\\s", "");
				// for test: exists wrong operations System.out.println(eqString);
				bop = eqString.replaceAll("[\\s\\D\\p{Punct}&&[^\\,+-]]+", "");
				// for test: right operation System.out.println(bop);

				int opPos = 0;
				// try to locate the position of the operator either '+' or '-'
				opPos = eqString.indexOf("+");
				if (opPos > 0) {
					operation = new AdditionOperation();
				} else {
					opPos = eqString.indexOf("-");
					operation = new SubstractOperation();
				}
				operation.unsafeConstructor(bop);
				exercise.add(operation);
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("ERROR: " + e);
		}
		return exercise;
	}


}
	 
