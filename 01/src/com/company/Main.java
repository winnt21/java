package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число n >= 0: ");
        int a = 0;
        int i = 0;
        int c = 0;
        int b = 1;
        // Чтобы получить введенное число, используется метод in.nextInt() класса Scanner
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0) {
            while (i < (n - 1)) {
                c = a + b;
                a = b;
                b = c;
                i++;
            }
        }
            else
                System.out.println("Ошибка, введите число n >= 0");
        System.out.printf("Число Фибоначчи: %d \n", c);
    }
}
