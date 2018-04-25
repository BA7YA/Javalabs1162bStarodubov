package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое имя: ");
        String a = sc.nextLine();
        System.out.print("Введите второе имя: ");
        String c = sc.nextLine();
        boolean nul = a.isEmpty();
        boolean nul1 = c.isEmpty();

        if (nul== true || nul1 == true){
            System.out.print("Нужно ввести два имени");
        }
        else {
            String str1 = a.trim();
            String str2 = c.trim();
            String b = "Имена идентичны";
            String d = "Длинны имен равны";
            boolean tr;
            int m = str1.length();
            int n = str2.length();

            tr = str1.equals(str2);
            if (tr == true) {
                System.out.print(b);
            }
                else if (m == n) {
                    System.out.print(d);
                }
                    else if (tr == false || m != n ){
                    System.out.print("Имена не идентичны и их длины не равны");
                     }
        }
    }
}
