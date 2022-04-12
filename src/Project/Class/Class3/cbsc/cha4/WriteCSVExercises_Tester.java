package Project.Class.Class3.cbsc.cha4;

import Project.Class.Class3.cbsc.cha3.ExerciseType;
public class WriteCSVExercises_Tester {

	public static void main(String[] args) {

		int count = 60;

		ExerciseFiles creator = new ExerciseFiles();
		creator.saveCSVExercises(5, count, ExerciseType.SUB_ONLY);

	}

}
