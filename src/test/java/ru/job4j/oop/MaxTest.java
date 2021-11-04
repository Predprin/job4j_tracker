package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void when5to7then7() {
        int first = 5;
        int second = 7;
        int expected = 7;
        int maxNumber = Max.max(first, second);
        Assert.assertEquals(expected, maxNumber);
    }

    @Test
    public void when1to3to2then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        int expected = 3;
        int maxNumber = Max.max(first, second, third);
        Assert.assertEquals(expected, maxNumber);
    }

    @Test
    public void when8to3to2to1then8() {
        int first = 8;
        int second = 3;
        int third = 2;
        int fourth = 1;
        int expected = 8;
        int maxNumber = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, maxNumber);
    }

    @Test
    public void when1to1to1to1then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int expected = 1;
        int maxNumber = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, maxNumber);
    }
}