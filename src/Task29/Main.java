package Task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел число и начало ряда");
        String[] b = in.nextLine().split(" ");
        Row a = new Row(Integer.parseInt(b[1]), Integer.parseInt(b[0]));
        System.out.println(a.getResult());
    }
}
