package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    @Test public void whenCheckOutputs() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        tracker.findByName(item.getName());
        FindByNameAction act = new FindByNameAction();
        act.execute(new StubInput(new String[] {item.getName()}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Name: " + item.getName() + " ID: " +item.getId())
                .toString();
        assertThat(new String(out.toByteArray()),is(expect));
        System.setOut(def);
    }
}
