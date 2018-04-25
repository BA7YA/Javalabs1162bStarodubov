package com.company;

public class MyArray {

    public static void main(String[] args) {
	// write your code here
        int m = 1;
        int i = 0;
        int j = 0;
        int k = 1;
        int mas[];
        mas = new int[15];
        for(i = 0; i <= 14; i++){
            mas[i] = (int) (Math.random()*10);
            System.out.print(mas[i]+ " ");
            for (mas[i] = mas[i]; mas[i] % 2 == 0; mas[i]++){
                 k = m ;
                m++;

            }

        }
        System.out.println();
        System.out.print("Количество четных элементов равно: " + k);


    }
}
