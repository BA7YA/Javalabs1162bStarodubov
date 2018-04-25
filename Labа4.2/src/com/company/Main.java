package com.company;

import java.util.Scanner;

public class Main {
    public static int rand(int a, int b){
        if (a > b){
            int c = a;
            a = b;
            b = c;
        }
        return (int) (Math.random()* (( b + 1 ) - a) + a);

    }

    public static void rand (int a){
        System.out.print(a + " ");

    }


    public static void main(String[] args) {
	// write your code here
        int m = 0;
        int n = 0;
        int j = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        m = sc.nextInt();
        System.out.print("Введите число b: ");
        n = sc.nextInt();
        while (j < 5) {
            int arr[] = new int[10];
            for (i = 0; i < 10; i++) {
                arr[i] = rand(m, n);
                int k = arr[i];
                rand(k);
            }
            System.out.println();
            j++;
        }
    }
}
