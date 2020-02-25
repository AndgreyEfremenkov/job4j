package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFirstTest {
    @Test
    public void whenCreateTwoTracker() {
        Tracker tracker1 = TrackerFirst.INSTANCE.getTracker();
        Tracker tracker2 = TrackerFirst.INSTANCE.getTracker();
        boolean result = (tracker1 == tracker2);
        assertThat(result, is(true));
    }
}
