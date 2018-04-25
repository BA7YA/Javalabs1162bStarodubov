package com.company;

import java.util.Scanner;

    public class Main {



            public static double min (double a, double b){
                double min;
                if(a>b){
                    min = b;
                }
                else{
                    min = a;
                }
                return (min);
            }

        public static double min1(double a, double b,double c, double d){
            double min = 0 ;
            if (c <= min(a,b)&& c <= d){
                min = c ;
            }
            else  if(d <= min(a,b)&& d <= c) {
                    min = d;
                    }
                    else if (min(a,b) <= c && min(a,b) <= d){
                min = min(a,b);
            }
            return(min);
            }



            public static void main(String[] args) {
                // write your code here
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                if (sc.hasNextDouble()) {
                    double a = sc.nextDouble();
                    System.out.print("Введите второе число : ");
                    if (sc.hasNextDouble()) {
                        double b = sc.nextDouble();
                        System.out.print("Введите третье число: ");
                        if (sc.hasNextDouble()) {
                            double c = sc.nextDouble();
                            System.out.print("Введите четвертое число: ");
                            if (sc.hasNextDouble()) {
                                double d = sc.nextDouble();
                                System.out.print("Минимальное число = " + (min1(a, b, c, d)));
                            } else {
                                System.out.println("Вы ввели не число");
                            }
                        } else {
                            System.out.println("Вы ввели не число");
                        }
                    } else {
                        System.out.println("Вы ввели не число");
                    }
                }
                else {
                    System.out.println("Вы ввели не число");
                }
    }
}
