package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 0.001));
    }

    @Test
    public void when00To00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(0, 0.001));
    }

    @Test
    public void when105To2119then178() {
        Point a = new Point(10, 5);
        Point b = new Point(21, 19);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(17.8, 0.01));
    }
}