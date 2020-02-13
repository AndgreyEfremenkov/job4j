package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerThirdTest {
    @Test
    public void whenCreateTwoTracker() {
        TrackerThird tracker = TrackerThird.getInstance();
        TrackerThird tracker1 = TrackerThird.getInstance();
        boolean result = (tracker == tracker1);
        assertThat(result, is(true));
    }
}
