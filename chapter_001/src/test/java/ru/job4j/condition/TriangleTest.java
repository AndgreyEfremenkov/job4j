package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenTrue() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        Point third = new Point(3, 0);
        Triangle abc = new Triangle(first,second,third);
        double out = abc.area();
        double expected = 4.49;
        Assert.assertEquals(expected, out, 0.01);
    }
}
