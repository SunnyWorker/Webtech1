package objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    static Basket basket;

    @BeforeAll
    public static void initial() {
        basket = new Basket(new ArrayList<>());
        basket.balls.add(new Ball(Color.BLACK,1));
        basket.balls.add(new Ball(Color.BLUE,2));
        basket.balls.add(new Ball(Color.RED,3));
        basket.balls.add(new Ball(Color.GREEN,4));
        basket.balls.add(new Ball(Color.ORANGE,5));
        basket.balls.add(new Ball(Color.PURPLE,6));
        basket.balls.add(new Ball(Color.WHITE,7));
        basket.balls.add(new Ball(Color.YELLOW,8));
        basket.balls.add(new Ball(Color.BLUE,9));
    }

    @Test
    void getBallsWeight() {
        Assertions.assertTrue(basket.getBallsWeight()==45);
    }

    @Test
    void getBlueBallsCount() {
        Assertions.assertTrue(basket.getBlueBallsCount()==2);
    }
}


//javac -d bin .\src\main\java\objects\*
//java -classpath .\bin objects.Main
//jar -cmf manifest.mf webtech.jar -C bin .
//java -jar webtech.jar