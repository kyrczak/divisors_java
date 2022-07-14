package korczak.patryk;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Divisors {
    private final TreeSet<Integer> divisors;

    public Divisors() {
        this.divisors = new TreeSet<>();
    }

    public Divisors(int number) {
        this.divisors = new TreeSet<>();
        this.findDivisors(number);
    }
    public void findDivisors(int number) {
        this.getDivisors().clear();
        this.getDivisors().add(number);
        int iterator = 2;
        while(iterator*iterator <= Math.abs(number)) {
            if(number % iterator == 0) {
                this.getDivisors().add(number/iterator);
                this.getDivisors().add(iterator);
            }
            iterator++;
        }
        if(number<0) {
            iterator = -2;
            this.getDivisors().add(Math.abs(number));
            while(-(iterator*iterator)>= number) {
                if(number % iterator == 0) {
                    this.getDivisors().add(number/iterator);
                    this.getDivisors().add(iterator);
                }
                iterator--;
            }
        }
    }

    public void printDivisors() {
        for(int divisor : this.getDivisors()) {
            System.out.println(divisor);
        }
    }

    public boolean isADivisor(int number) {
        return this.getDivisors().contains(number);
    }

    public boolean areDivisors(TreeSet<Integer> set) {
        boolean areDivisors = true;
        for(int number : set) {
            areDivisors = this.getDivisors().contains(number);
            if(!areDivisors) {
                return areDivisors;
            }
        }
        return areDivisors;
    }
    public TreeSet<Integer> getDivisors() {
        return divisors;
    }
}
