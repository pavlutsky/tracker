package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static  int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int y, int a, int b, int c) {
        int sumAll = sum(y) + multiply(a) + minus(b) + divide(c);
        return sumAll;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int minus = minus(5);
        System.out.println(minus);
        int divide = calculator.divide(5);
        System.out.println(divide);
        int sumAll = calculator.sumAllOperation(10,5,5,5);
        System.out.println(sumAll);
    }
}