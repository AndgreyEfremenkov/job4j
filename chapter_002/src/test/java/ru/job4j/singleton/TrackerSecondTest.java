package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSecondTest {
    @Test
    public void whenCreateTwoTracker() {
        Tracker tracker = TrackerSecond.getInstance();
        Tracker tracker1 = TrackerSecond.getInstance();
        boolean result = (tracker == tracker1);
        assertThat(result, is(true));
    }
}
