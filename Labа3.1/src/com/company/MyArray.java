package com.company;

public class MyArray {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 2;
        int mas [];
        mas = new int[10];
        for (i = 0; i <= 9; i++){
            for(j = 2; j <= 20; j++ ){
                if(j % 2 == 0){
                    mas[i] = j;
                    System.out.print(mas[i] + " ");

                }

            }
            break;

            }
            System.out.println("");
        for (i = 0; i <= 9; i++){
            for(j = 2; j <= 20; j++ ){
                if(j % 2 == 0){
                    mas[i] = j;
                    System.out.println(mas[i]);

                }

            }
            break;

        }

    }
}
