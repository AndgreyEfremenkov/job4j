package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort7() {
        int[] input = new int[] {2, 7, 94, 23, 3, 11, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 2, 3, 7, 11, 23, 94};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[] {12, 7, 1, 92, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1,  5, 7, 12, 92};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {3, 1, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 5};
        assertThat(result, is(expect));
    }
}