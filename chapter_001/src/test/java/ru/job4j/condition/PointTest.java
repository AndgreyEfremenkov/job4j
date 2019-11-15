package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b =new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point x = new Point(0, 1, 3);
        Point y = new Point(2, 0, 1);
        double expected = 2.23;
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }
}
