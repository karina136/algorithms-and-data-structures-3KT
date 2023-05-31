package Task36;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] code = {1, 2, 3, 4}; // загаданный код
        int attemptsLeft = 20; // количество попыток
        System.out.println("У вас есть 20 попыток, чтобы разгадать код из четырех символов.");

        while (attemptsLeft > 0) {
            int[] guess = new int[4];
            System.out.print("Введите 4 числа: ");
            for (int i = 0; i < 4; i++) {
                guess[i] = scanner.nextInt();
            }

            int correct = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == code[i]) {
                    correct++;
                }
            }

            if (correct == 4) {
                System.out.println("Вы разгадали код!");
                return;
            } else {
                System.out.println("Количество совпадений: " + correct);
                attemptsLeft--;
                System.out.println("У вас осталось " + attemptsLeft + " попыток");
            }
        }

        System.out.println("Игра окончена. Вы не разгадали код.");
    }
}
