package com.company;
import java.util.Scanner;


public class Main {

        public static double min (double i, double j){
            double min;
        if(i>j){
                min = j;
        }
            else{
                min = i;
            }
        return (min);
    }


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        if (sc.hasNextDouble()) {
            double i = sc.nextDouble();
            System.out.print("Введите второе число : ");
                if (sc.hasNextDouble()) {
                    double j = sc.nextDouble();
                    System.out.print("Минимальное число = "+(min( i,j)));
                } else {
                            System.out.println("Вы ввели не число");
                    }

        }
            else {
                System.out.println("Вы ввели не число");
            }

    }
}
