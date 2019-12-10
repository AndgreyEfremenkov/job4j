package ru.job4j.tracker;

import java.util.Arrays;
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

    /**
     *
     * @param id идентификатор по которому нужно найти ячейку
     * @param item заявка на которую нужно заменить
     * @return булевоое значение о том что все сработало
     */
    public boolean replace(String id, Item item) {
        boolean replace = false;
        for (int i = 0; i<position; i++) {
            if (items[i].getId().equals(id)) {
                this.items[i] = item;
                item.setId(id);
                replace = true;
            }
        }
        return replace;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i<position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
             System.arraycopy(items, i+1, items, i, position--);
             result = true;
             break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов;
     * @return массив без null эллеменов
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items, сравнивая name с аргументом метода  key.
     * @param key имя заявки с которым сравниваем name
     * @return Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его
     */
    public Item[] findByName(String key) {
        Item[] temp = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                temp[count] = items[index];
                count++;
            }
        }
        Item[] result = Arrays.copyOf(temp,count);
        return result;
    }

    /**
     * Метод ищет item по id если не находит возвращает null
     * @param id
     * @return Item найденый по id
     */
    public Item findById(String id) {
        for (int index = 0; index <position; index++) {
            if (this.items[index].getId().equals(id)) {
            return items[index];
            }
        }
        return null;
    }



}
