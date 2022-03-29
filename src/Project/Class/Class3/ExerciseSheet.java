package Project.Class.Class3;

import java.util.Iterator;

public class ExerciseSheet {
    private static final short COLUMN_NUMBER = 5;

    public void formattedDisplay(Exercise ex, int columns) {
        Iterator<BinaryOperation> it = ex.iterator();
        int column = 1;
        int count = 1;
        while (it.hasNext()) {
            if (column > columns) {
                print("\n");
                column = 1;
            }
            print("" + count + "." + " ");
            print((it.next()).asString() + "\t");
            count++;
            column++;
        }
        print("\n");
    }

    public void formattedDisplay2(Exercise ex, int columns) {
        int column = 1;
        int count = 1;
        while (ex.hasNext()) {
            if (column > columns) {
                print("\n");
                column = 1;
            }
            print("" + count + "." + " ");
            print((ex.next()).asString() + "\t");
            count++;
            column++;
        }
        print("\n");
    }

    public void formattedDisplay(Exercise ex) {
        formattedDisplay(ex,COLUMN_NUMBER);
    }

    private static void print(String s) {
        System.out.print(s);
    }

    public static void main(String[] args) {
        ExerciseSheet sheet = new ExerciseSheet();
        Exercise ex = new Exercise();
        ex.generateAdditionExercise(26);
        System.out.println("---- generate and display add exercises ----");
        sheet.formattedDisplay2(ex,4);

        System.out.println("---- generate and display substract exercises ----");
        ex.generateSubstractExercise(20);
        sheet.formattedDisplay2(ex, 3);

        System.out.println("---- generate and display binary exercises ----");
        ex.generateBinaryExercise(23);
        sheet.formattedDisplay2(ex, 7);
    }
}
