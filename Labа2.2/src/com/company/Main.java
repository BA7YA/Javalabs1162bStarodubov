package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.print("Введите число столбцов: ");
            if (sc.hasNextInt()) {
                int j = sc.nextInt();
                for (int m = 0; m < i; m++) {
                    for (int n = 0; n < j; n++) {
                        System.out.print("8");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не целое число");
            }


        }
        else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
