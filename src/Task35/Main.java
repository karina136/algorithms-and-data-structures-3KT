package Task35;


import Task27.Caesar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String text = "";
        System.out.println("Введите шаг: ");
        int step = sc.nextInt();
        String separate = File.separator;
        File file = new File("Text35");
        Scanner sc1 = new Scanner(file);
        while (sc1.hasNextLine()){
            text += sc1.nextLine() + "\n";
        }
        Caesar caesar = new Caesar();
        String cipher = caesar.encryption(text, step);
        System.out.println(text);
        System.out.println("Зашифрованный текст: " + caesar.encryption(text, step));
        System.out.println("Расшифрованный: " + caesar.decipheringTheCaesarCipher(cipher, step));

    }
}
