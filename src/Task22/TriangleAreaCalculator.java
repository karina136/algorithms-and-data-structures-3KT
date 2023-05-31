package Task22;

public class TriangleAreaCalculator {
    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double area = calculateArea(a, b, c);

        System.out.println("Площадь треугольника со сторонами " + a + ", " + b + ", " + c + " равна " + area);
    }
}
