package pl.student;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;


public class DivisorsTest {
    @Test
    public void shouldSayThat2IsADivisor() {
        Divisors divisors = new Divisors(12);
        Assert.assertTrue(divisors.isADivisor(2));
    }

    @Test
    public void shouldSayThat5IsntADivisor() {
        Divisors divisors = new Divisors(13);
        Assert.assertFalse(divisors.isADivisor(5));
    }

    @Test
    public void shouldSayThat2and5AreDivisors() {
        Divisors divisors = new Divisors(50);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(5);
        Assert.assertTrue(divisors.areDivisors(treeSet));
    }

    @Test
    public void shouldSayThat3and5ArentDivisors() {
        Divisors divisors = new Divisors(50);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(5);
        Assert.assertFalse(divisors.areDivisors(treeSet));
    }
}