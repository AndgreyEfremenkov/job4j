package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(),is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenFindByNameItem1ThenThreeElements() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item1");
        Item item3 = new Item("item3");
        Item item4 = new Item("item1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        assertThat(tracker.findByName("item1").length, is(3));
    }
    @Test
    public void whenFourItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item1");
        Item item3 = new Item("item3");
        Item item4 = new Item("item1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        assertThat(tracker.findAll().length, is(4));
    }
    @Test
    public void whenDeleteItem2ThenThreeElements() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        Item item4 = new Item("item4");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.delete(item2.getId());
        assertThat(tracker.findAll().length, is(3));


    }




    }
