package com.company;

public class MyArray {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int j = 0;
        int mas [];
        mas = new int[100];
            for(i = 0; i<=100; i++){
                for(j = 1; j <= 99; j++){
                    if(j % 2 == 1){
                        mas[i] = j;
                        System.out.print(mas[i] + " ");
                    }
                }
                break;

            }
            System.out.println();
                for(i = 0; i<=100; i++){
                    for(j = 99; j >=1; j--){
                        if(j % 2 == 1){
                         mas[i] = j;
                         System.out.print(mas[i] + " ");
                        }
                    }
                    break;

                }

    }
}
