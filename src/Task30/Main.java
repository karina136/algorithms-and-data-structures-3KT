package Task30;

public class Main {
    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60}; // расстояния между городами
        int n = distances.length; // количество городов
        int max_distance = 175; // максимальное расстояние на бензин

        // перебор всех возможных комбинаций городов
        int max_sum = 0; // максимальная сумма расстояний
        int city1 = 0, city2 = 0, city3 = 0; // индексы городов, которые можно посетить
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = distances[i] + distances[j] + distances[k]; // сумма расстояний
                    if (sum <= max_distance && sum > max_sum) { // проверка на максимальность суммы и на то, что можно проехать на одном баке
                        max_sum = sum;
                        city1 = i;
                        city2 = j;
                        city3 = k;
                    }
                }
            }
        }

// вывод результата
        System.out.println("Расстояния между городами: ");
        for(int i = 0; i < distances.length; i++){
            System.out.print(distances[i] + " ");
        }
        System.out.println("\nМаксимальная сумма расстояний, затратив как можно больше бензина: " + max_sum);
        System.out.println("Города, которые можно посетить(по индексу): " + city1 + ", " + city2 + ", " + city3);
    }
}
