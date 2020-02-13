package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFourthTest {
    @Test
    public void whenCreateTwoTracker() {
        TrackerFourth tracker = TrackerFourth.getInstance();
        TrackerFourth tracker1 = TrackerFourth.getInstance();
        boolean result = (tracker == tracker1);
        assertThat(result, is(true));
    }
}