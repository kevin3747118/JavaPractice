package com.alzk;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
    }

}
