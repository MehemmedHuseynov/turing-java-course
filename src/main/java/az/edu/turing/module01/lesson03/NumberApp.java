package az.edu.turing.module01.lesson03;

import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        System.out.println((num == 0) ? "hec biri deyil" : (num % 2 == 1) ? "Tekdir" : "cutdur");



        }
    }

