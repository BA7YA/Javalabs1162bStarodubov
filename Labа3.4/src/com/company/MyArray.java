package com.company;

public class MyArray {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 0;
        int mas[][];
        mas = new int[8][5];
        for (i = 0; i < 8; i++){
            for (j = 0; j < 5; j++){
                mas[i][j] = (int) (Math.random()*90+10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }




    }
}
