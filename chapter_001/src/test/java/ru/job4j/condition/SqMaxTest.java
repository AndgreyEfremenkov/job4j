package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 1, 2, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 8, 2, 4);
        assertThat(result, is(8));
    }

    @Test
    public void whenThridMax() {
        SqMax check = new SqMax();
        int result = check.max(2, 1, 6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(2, 1, 4, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllMax() {
        SqMax check = new SqMax();
        int result = check.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }


}
