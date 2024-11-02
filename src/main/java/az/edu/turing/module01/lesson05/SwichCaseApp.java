package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class SwichCaseApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        String result = "";

        switch (value % 3) {
            case 0:
                result = "Eded 3  tam bolunur";
                break;
            case 1:
                result = "Eded 3 tam bolunmur ve qaliq 1 qalir";
                break;
            case 2:
                result = "Eded 3 tam bolunmur ve qaliq 2 qalir";
                break;
            default:
                result = "Eded 3 e tam bolunur ve qaliq" + value % 3 + "dir";
        }
    }
}
