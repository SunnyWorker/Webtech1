package objects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>());
        basket.balls.add(new Ball(Color.BLACK,1));
        basket.balls.add(new Ball(Color.BLUE,2));
        basket.balls.add(new Ball(Color.RED,3));
        basket.balls.add(new Ball(Color.GREEN,4));
        basket.balls.add(new Ball(Color.ORANGE,5));
        basket.balls.add(new Ball(Color.PURPLE,6));
        basket.balls.add(new Ball(Color.WHITE,7));
        basket.balls.add(new Ball(Color.YELLOW,8));
        basket.balls.add(new Ball(Color.BLUE,9));
        System.out.println("Weight of balls = "+basket.getBallsWeight());
        System.out.println("Blue balls' count = "+basket.getBlueBallsCount());
    }
}