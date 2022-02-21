package ru.job4j.tracker.oop;

public class Story {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Pioneer petya = new Pioneer();
        Wolf wolf = new Wolf();
        girl.help(petya);
        petya.kill(wolf);
        wolf.eat(girl);
    }
}