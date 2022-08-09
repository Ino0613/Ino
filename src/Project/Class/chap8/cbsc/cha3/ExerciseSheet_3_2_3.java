package Project.Class.chap8.cbsc.cha3;

/*
 * 设计二
 * 用于实际输出需要格式、数量的习题
 * 可以看做是设计二的Exercise的测试类
 */
public class ExerciseSheet_3_2_3 {

	public static void main(String[] args) {
		// int count=50;
		// int columns=5;
		Exercise_3_2_2 exercise = new Exercise_3_2_2();
		exercise.generateAdditionExercise(20);
		System.out.println("---- generate 20 additions and display  ----");
		exercise.formattedDisplay(-1);
		exercise.clear();
		System.out.println("---- generate 20 stustracts and display ----");
		exercise.generateSubstractExercise(20);
		exercise.formattedDisplay(7);	
		exercise.clear();
		System.out.println("---- generate 20 operations and display ----");
		exercise.generateBinaryExercise(20);
		exercise.formattedDisplay(4);	
	}
}