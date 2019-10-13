package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when13() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(13);
        assertThat(count, is(6));
    }

    @Test
    public void when8() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(8);
        assertThat(count, is(4));
    }

    @Test
    public void when1() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }
}