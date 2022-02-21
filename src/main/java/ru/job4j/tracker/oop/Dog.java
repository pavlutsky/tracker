package ru.job4j.tracker.oop;

public class Dog {

    private String name;

    public void show() {
        System.out.println(this.name);
    }

    void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        polkan.giveNick("Полкан");
        polkan.show();
        Dog zhychka = new Dog();
        zhychka.giveNick("Жучка");
        zhychka.show();
        Dog sharik = new Dog();
        sharik.giveNick("Шарик");
        sharik.show();

    }
}