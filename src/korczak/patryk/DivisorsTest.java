package korczak.patryk;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;


public class DivisorsTest {
    @Test
    public void test2IsADivisor() {
        Divisors divisors = new Divisors(12);
        Assert.assertTrue(divisors.isADivisor(2));
    }

    @Test
    public void test5IsntADivisor() {
        Divisors divisors = new Divisors(13);
        Assert.assertFalse(divisors.isADivisor(5));
    }

    @Test
    public void test2And5AreDivisors() {
        Divisors divisors = new Divisors(50);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(5);
        Assert.assertTrue(divisors.areDivisors(treeSet));
    }

    @Test
    public void test3And5ArentDivisors() {
        Divisors divisors = new Divisors(50);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(5);
        Assert.assertFalse(divisors.areDivisors(treeSet));
    }

    @Test
    public void testNegativeNumberDivisors() {
        Divisors divisors = new Divisors(-20);
        Assert.assertTrue(divisors.isADivisor(-5));
    }

    @Test
    public void testPrimeNumber() {
        Divisors divisors = new Divisors(2137);
        Assert.assertTrue(divisors.getDivisors().size() == 1 && divisors.isADivisor(2137));
    }
}