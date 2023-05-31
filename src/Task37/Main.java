package Task37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число участников игры: ");
        int numPlayers = Integer.parseInt(sc.nextLine());
        System.out.print("Введите номер игрока, который начинает игру: ");
        int startPlayer = Integer.parseInt(sc.nextLine());

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(i);
        }

        List<Integer> eliminated = new ArrayList<>();
        int current = startPlayer - 1, count = 1;
        while (players.size() > 1) {
            if (count % 3 == 0) {
                eliminated.add(players.remove(current));
                System.out.printf("%s %d подсчитывается результат %s\n",
                        players.toString(), eliminated.get(eliminated.size() - 1), eliminated.toString());
                current--;
            }
            count++;
            current = (current + 1) % players.size();
        }

        System.out.printf("Выбывшие игроки: %s\n", eliminated.toString());
        System.out.printf("Победитель: %d\n", players.get(0));
    }
}
