package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int temp;
        int lenght=array.length-1;
                for (int index=0; index!=array.length/2;index++) {
                        temp = array[index];
                        array[index] = array[lenght - index];
                        array[lenght - index] = temp;
                }
        return array;
    }
}