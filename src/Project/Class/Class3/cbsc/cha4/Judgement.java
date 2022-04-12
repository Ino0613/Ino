package Project.Class.Class3.cbsc.cha4;


/*
 * 读取练习的分数，读取一套习题：逐一比较结果，统计：
 * right, wrong, total(取习题值)，%
 */
import java.io.File;
import java.util.ArrayList;

import Project.Class.Class3.cbsc.cha3.*;
public class Judgement {
	private int correct = 0;
	private int wrong = 0;

	public int getCorrect(){
		return correct;
	}
	public int getWrong(){
		return wrong;
	}
	public int getTotal(){
		return correct+wrong;
	}
	// 当心Integer数组，换成int，则由于其他地方使用了ArrayList<Integer>
	// 则处理起来很麻烦！
	// 各种不同参数的多态evaluate
	public void evaluate(Integer[] answers, Integer[] results ){
		// get the small length of both lists
		int length = answers.length < results.length?answers.length:results.length;

		for(int index=0; index < length; index++ ){
			if (answers[index] == results [index]){
				correct++;
			}else{
				wrong++;
			}
		}
		// if the two lists are not of the same length
		wrong += Math.abs(answers.length-results.length);
	}

	public void evaluate(File anExerciseFile, Integer[] results ){
		evaluate(getResultsFromExerciseFile (anExerciseFile), results);
	}
	public void evaluate(File anExerciseFile, File resultsFile){
		ArrayList<Integer> list = new ArrayList <Integer>();
		list = new ExerciseFiles().readExerciseAnswers(resultsFile);
		Integer[] a = new Integer[list.size()];
		evaluate(getResultsFromExerciseFile (anExerciseFile), list.toArray(a));
	}
	private Integer[] getResultsFromExerciseFile (File anExerciseFile){
		ExerciseFiles eFile = new ExerciseFiles();
		Exercise_3_2_3 exercise = new Exercise_3_2_3();
		exercise = eFile.readCSVExercise(anExerciseFile);
		ArrayList<Integer> opResults = new ArrayList <Integer>();
		for (BinaryOperation_3_2 op: exercise.getOperations()) {
			opResults.add(op.getResult());
		}

		Integer[] b = new Integer[opResults.size()];
		return opResults.toArray(b);
	}

	public void statisticsReport(){
		System.out.println("-----------------------------");
		System.out.println("Total Operations:\t"+getTotal());
		System.out.println("Corect answers: \t"+getCorrect());
		System.out.println("Wrong answers: \t\t"+getWrong());
		System.out.println("-----------------------------");
	}
}
