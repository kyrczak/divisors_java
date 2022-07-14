package korczak.patryk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divisors divisors = new Divisors();
        try {
            System.out.println("Input number: ");
            int number = scanner.nextInt();
            divisors.findDivisors(number);
            divisors.printDivisors();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
