package ru.job4j.tracker.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        Student vasya = new Student();
        String song1 = "I believe I can fly";
        String song2 = "Yesterday";
        String song3 = "Выйду ночью в поле с конём...";
        petya.song(song1);
        petya.music();
        petya.song(song3);
        vasya.song(song2);
        vasya.song(song3);
    }
}