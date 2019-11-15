package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1To4Then4() {
        int result = Max.max(3, 1,4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To2To3To7Then7() {
        int result = Max.max(2, 2,3,7);
        assertThat(result, is(7));
    }

}
