package Project.Class.Class3.cbsc.cha4;

import java.io.File;

import Project.Class.Class3.cbsc.cha3.Exercise_3_2_3;
public class ReadCSVExercises_Tester {

	public static void main(String[] args) {

		File dir = new File("E:\\data\\exercise_sub_60_1.txt");
		ExerciseFiles efile = new ExerciseFiles();
		Exercise_3_2_3 exercise = new Exercise_3_2_3();
		exercise = efile.readCSVExercise(dir);
		exercise.formattedDisplay(5);

	}

}
