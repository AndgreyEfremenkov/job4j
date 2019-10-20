package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[] {12, 7, 1, 90, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 5, 7, 12, 90};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {3, 1, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 5};
        assertThat(result, is(expect));
    }
}