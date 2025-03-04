package Arrays;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        double Y = scanner.nextDouble();
        scanner.close();

        if (X % 5 == 0 && X + 0.50 <= Y) {
            Y -= (X + 0.50);
        }

        System.out.printf("%.2f\n", Y);
    }

}
