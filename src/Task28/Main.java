package Task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i * i - (i - 1) * (i - 1) == n) {
                System.out.println(n + " = " + i * i + "-" + (i - 1) * (i - 1));
                break;
            }
        }
    }
}
