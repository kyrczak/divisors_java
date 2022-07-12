package pl.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Divisors {
    private TreeSet<Integer> divisors;

    public Divisors() {
        this.divisors = new TreeSet<>();
    }

    public void findDivisors(int number) {
        this.divisors.clear();
        int iterator = 1;
        while(iterator <= Math.sqrt(number)) {
            if(number % iterator == 0) {
                this.divisors.add(number/iterator);
                this.divisors.add(iterator);
            }
            iterator++;
        }
    }

    public void printDivisors() {
        for(int divisor : this.getDivisors()) {
            System.out.println(divisor);
        }
    }

    public TreeSet<Integer> getDivisors() {
        return divisors;
    }
}
