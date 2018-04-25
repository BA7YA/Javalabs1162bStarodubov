package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int m = 1;
        int n = -1;
        int d = 0;
        int i;
        int j;
        int mas[][];
        mas = new int[7][4];
        for(i = 0; i < 7; i++){
            for(j = 0; j < 4; j++){
                mas[i][j] = ((int) (Math.random()*11)-5);
                System.out.print(mas[i][j] + " ");
                m *= Math.abs(mas[i][j]);
            }
                if (m > n){
                n = m;
                d++;
                }
                m = 1;

            System.out.println();

        }
        System.out.println("Индекс строки с наибольшим по модулю произведением элеменнтов: " + d );




    }
}
