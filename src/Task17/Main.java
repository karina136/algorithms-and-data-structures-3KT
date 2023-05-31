package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку из скобок: ");
        String line = s.nextLine();
        System.out.println(bracketCheck(line));
    }
    private static boolean bracketCheck(String line){
        char[] counter = line.toCharArray();
        int open = 0;
        int close = 0;

        for (char c : counter) {
            if (c == '(') {
                open += 1;
            } else if (c == ')') {
                close += 1;
            }
        }

        return open == close;
    }
}
