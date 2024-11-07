package az.edu.turing;

import java.util.Scanner;

public class MonthAndSeasonConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reqem;

        do {
            System.out.print("Ay nömrəsini daxil edin (1-12): ");
            reqem = scanner.nextInt();


            if (reqem >= 1 && reqem <= 12) {
                String ayAdi, fesil;

                if (reqem == 1 || reqem == 2) {
                    ayAdi = (reqem == 1) ? "Yanvar\n" : "fevral\n";
                    fesil = "qis";
                } else if (reqem <= 5) {
                    ayAdi = (reqem == 3) ? "mart\n" : (reqem == 4) ? "aprel\n" : "May\n";
                    fesil = "Yaz";
                } else if (reqem <= 8) {
                    ayAdi = (reqem == 6) ? "Iyun\n" : (reqem == 7) ? "iyul\n" : "avqust\n";
                    fesil="yay";
                } else {
                    ayAdi = (reqem == 9) ? "Sentyabr\n" : (reqem == 10) ? "Oktiyabr\n" : "Noyabr\n";
                    fesil="yaz";

                }
                System.out.println(reqem + " ci ay " + ayAdi + "Fesil:" + fesil);
            }else{
                System.out.println("1 den 12 ye qeder reqem yaz");
            }
        }while (reqem < 1 || reqem > 12) ;
        scanner.close();
    }


}

