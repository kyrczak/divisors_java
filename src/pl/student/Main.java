package pl.student;

public class Main {

    public static void main(String[] args) {
        int number = 18;
        Divisors divisors = new Divisors();
        divisors.findDivisors(number);
        divisors.printDivisors();
    }
}
