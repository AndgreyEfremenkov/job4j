package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFourthTest {
    @Test
    public void whenCreateTwoTracker() {
        Tracker tracker = TrackerFourth.getInstance();
        Tracker tracker1 = TrackerFourth.getInstance();
        boolean result = (tracker == tracker1);
        assertThat(result, is(true));
    }
}