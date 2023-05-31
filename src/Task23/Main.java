package Task23;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: длина ряда, первый делитель, второй делитель:");
        int n = sc.nextInt();
        int divisor1 = sc.nextInt();
        int divisor2 = sc.nextInt();

        System.out.println("Ряд чисел:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % divisor1 == 0 || i % divisor2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, которые делятся на один из делителей без остатка: " + sum);
    }
}
