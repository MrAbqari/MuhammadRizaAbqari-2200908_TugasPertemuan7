package tugas.pkg7.pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, and f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation linearequation = new LinearEquation(a, b, c, d, e, f);

        if (linearequation.isSolvable()) {
            System.out.println("x = " + linearequation.getX());
            System.out.println("y = " + linearequation.getY());
        } else {
            System.out.println("The system does not have a solution.");
        }

        scanner.close();
    }
}
