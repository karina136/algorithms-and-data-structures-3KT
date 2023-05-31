package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало ряда M: ");
        int M = scanner.nextInt();

        System.out.print("Введите конец ряда N: ");
        int N = scanner.nextInt();


        System.out.print("Введите делитель: ");
        int[] divisors = new int[3];
        for (int i = 0; i < 3; i++) {
            divisors[i] = scanner.nextInt();
        }

        for (int divisor : divisors) {
            int sum = 0;
            for (int num = M; num <= N; num++) {
                if (num % divisor == 0) {
                    sum += num;
                }
            }
            System.out.println("Sum for divisor " + divisor + ": " + sum);
        }
    }
}
