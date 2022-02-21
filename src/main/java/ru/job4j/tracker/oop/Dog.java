package ru.job4j.tracker.oop;

public class Dog {
    public String sound() {
        String voice = "wou-wou";
        return voice;
    }
    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
        String say = sharik.sound();
        System.out.println("Sharik says " + say);
    }
}