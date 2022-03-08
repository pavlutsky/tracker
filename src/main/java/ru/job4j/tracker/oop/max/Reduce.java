package ru.job4j.tracker.oop.max;

public class Reduce {
    private int[] array;

    public void to(int[] array1) {
        this.array = array1;
    }

    public void print() {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array1);
        reduce.print();
    }
}