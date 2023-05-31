package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number  = sc.nextInt();
        System.out.println("Результат: " + fun(number));
    }
    public static int fun(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return fun(n / 2);
        } else {
            return fun((n - 1)/ 2) + fun(((n - 1) / 2) + 1 );
        }
    }
}
