package ru.job4j.tracker;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
    */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public boolean replace(String id, Item item) {
        /* должен заменить ячейку в массиве this.items.
         Для этого необходимо найти ячейку в массиве по id.
          Метод должен вернуть boolean результат - удалось ли провести операцию.
         */
        return false;
    }

    public boolean delete(String id) {
        /*
        должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
          Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево
          с помощью System.arraycopy(). Метод должен вернуть boolean результат - удалось ли провести операцию.
         */
        return false;
    }

    public Item[] findAll() {
       /*
        возвращает копию массива this.items без null элементов;
        */
        return this.items;
    }
    public Item[] findByName(String key) {
        /*
        проверяет в цикле все элементы массива this.items, сравнивая name
        (используя метод getName класса Item) с аргументом метода String key.
        Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
         */
        return this.items;
    }

    public Item findById(String id) {
        /*проверяет в цикле все элементы массива this.items,
        сравнивая id с аргументом String id и возвращает найденный Item.
         Если Item не найден - возвращает null.

         */
        return this.items[0];
    }



}
