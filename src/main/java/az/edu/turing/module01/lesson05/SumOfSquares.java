package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result =(a*a) + (b*b);
        System.out.println(result);
    }
}
