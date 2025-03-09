import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in dollars: ");
        int dollars = scanner.nextInt();

        int twenties = dollars / 20;
        dollars %= 20;
        int tens = dollars / 10;
        dollars %= 10;
        int fives = dollars / 5;
        int ones = dollars % 5;

        System.out.println("Conversion:");
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);

        scanner.close();
}
}
