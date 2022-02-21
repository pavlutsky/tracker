package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        WolfBall wolfball = new WolfBall();
        Fox fox = new Fox();
        Ball ball = new Ball();
        ball.run();
        hare.tryEat(ball);
        ball.singSong();
        ball.run();
        wolfball.tryEat(ball);
        ball.singSong();
        ball.run();
        fox.tryEat(ball);
        ball.singSong();
        fox.deceive(ball);
        fox.eat(ball);
        ball.die();
    }
}