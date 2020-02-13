package ru.job4j.singleton;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFirstTest {
    @Test
    public void whenCreateTwoTracker() {
        TrackerFirst trackerFirst = TrackerFirst.INSTANCE;
        TrackerFirst trackerFirst1 = TrackerFirst.INSTANCE;
        boolean result = (trackerFirst == trackerFirst1);
        assertThat(result, is(true));
    }
}
