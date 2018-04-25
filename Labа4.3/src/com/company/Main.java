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

    public static void sortirovka(int a[]){
        int i, j, g = 0;
        for(i = a.length - 1; i >= 0; i-- ){
            for (j = 0; j < i; j++){
                if(a[j] < a[j + 1]){
                g = a[j];
                a[j] = a[j+1];
                a[j+1] = g;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a,a1,a2,a3,a4;
        a = new int[10];
        a1 = new int[10];
        a2 = new int[10];
        a3 = new int[10];
        a4 = new int[10];
        int m = 0, n = 0, j = 0, i, d;
        int k, k1, k2, k3, k4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        m = sc.nextInt();
        System.out.print("Введите число b: ");
        n = sc.nextInt();
        System.out.println("Укажите номер массива для сортировки: ");
        d = sc.nextInt();
        while(j < 5) {
            for (i = 0; i < 10; i++) {
                a[i] = rand(m, n);
                k = a[i];
                a1[i] = rand(m, n);
                k1 = a1[i];
                a2[i] = rand(m, n);
                k2 = a2[i];
                a3[i] = rand(m, n);
                k3 = a3[i];
                a4[i] = rand(m, n);
                k4 = a4[i];
            }
            System.out.println();
            j++;
        }



    }
}
