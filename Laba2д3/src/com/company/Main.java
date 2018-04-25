package com.company;
import sun.security.util.Length;

import java.util.Scanner;



public class Main {

    public static String che(int x, int y ){
        String che = "";
        if (x > 0 && y > 0){
            che = "Точка лежит в первой четверти " + "(" + x + ":" + y +")";
        }
            else if (x < 0 && y > 0){
              che = "Точка лежит во второй четверти " + "(" + x + ":" + y +")";
            }
                else if (x < 0 && y < 0){
                 che = "Точка лежит в третьей четверти " + "(" + x + ":" + y +")";
                }
                    else if (x > 0 && y < 0){
                     che = "Точка лежит в четвертой четверти " + "(" + x + ":" + y +")";
                    }
        return (che);
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату по x: ");
        if(sc.hasNextInt()){
            int x = sc.nextInt();
            if (x == 0){
                System.out.println("Точка не должна лежать на координатной прямой");
                System.exit(0);
            }
            System.out.print("Введите координату по y: ");
                if (sc.hasNextInt()){
                    int y = sc.nextInt();
                    if (y == 0){
                        System.out.print("Точка не должна лежать на координатной прямой");
                        System.exit(0);
                    }
                    System.out.print(che(x,y));
                }
                else {
                    System.out.print("Вы ввели не число");
                }

        }
        else {
            System.out.print("Вы ввели не число");
        }
    }
}
