package ru.job4j.tracker.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(true, 4, "Xiaomi Redmi 9C NFC");
        error.printInfo();
    }

    public void printInfo() {
        System.out.println("Количество ошибок прошивки телефона " + message);
        System.out.println(status + " шт.");
        System.out.println(active);
    }

}
