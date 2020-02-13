package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSecondTest {
    @Test
    public void whenCreateTwoTracker() {
        TrackerSecond tracker = TrackerSecond.getInstance();
        TrackerSecond tracker1 = TrackerSecond.getInstance();
        boolean result = (tracker == tracker1);
        assertThat(result, is(true));
    }
}
