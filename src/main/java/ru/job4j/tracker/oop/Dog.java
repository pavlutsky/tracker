package ru.job4j.tracker.oop;

public class Dog {

    private String name;

    public void show() {
        System.out.println(this.name);
    }

    void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "Гав-Гав";
        return voice;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        polkan.giveNick("Полкан");
        polkan.show();
        Dog sharik = new Dog();
        sharik.giveNick("Шарик");
        sharik.show();
        String say = sharik.sound();
        System.out.println("Шарик лает: " + say);
        Dog zhychka = new Dog();
        zhychka.giveNick("Жучка");
        zhychka.show();
    }
}