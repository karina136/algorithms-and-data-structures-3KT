package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите числa (начало ряда, конец ряда, делители) в одну строку через пробел:");
        String userText = scanner1.nextLine();
        String [] mass = userText.split(" ");
        int sum = 0;
        int check = 0;

        for (int i = Integer.parseInt(mass[0]); i < Integer.parseInt(mass[1]); i++) {
            check = 0;
            for (int j = 2; j < mass.length; j++) {
                if (i % Integer.parseInt(mass[j]) == 0 ) check++;
            }
            if (check == mass.length - 2) sum+=i;
        }
        System.out.println("Сумма всех чисел которые делятся на все делители без остатка: " + sum);
    }
}
