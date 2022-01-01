package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessZero() {
        Fact.calc(-2);
    }

    @Test
    public void when3then6() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
}