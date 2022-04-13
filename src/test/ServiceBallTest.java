package test;

import com.company.task2.entity.Basket;
import com.company.task2.entity.Color;
import com.company.task2.sevice.ServiceBall;
import com.company.task2.util.DataReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceBallTest {
    ServiceBall serviceBall;
    DataReader dataReader;
    Basket basket;
    String filePath = "C:\\Users\\super\\Desktop\\GELO\\Computer Science\\text.txt";

    @BeforeEach
    void setUp() {
        serviceBall = new ServiceBall();
        dataReader = new DataReader();
        basket = new Basket(dataReader.readData(filePath));
    }

    @Test
    void calculateBasketWeight() {
        int res = serviceBall.calculateBasketWeight(basket);
        assertEquals(490, res);
    }

    @Test
    void nonExistedColorInBasket() {
        int res = serviceBall.calculateQuantityOfColoredBalls(Color.BROWN, basket);
        assertEquals(0, res);
    }

    @Test
    void validQuantityOfPinkBalls() {
        int i = serviceBall.calculateQuantityOfColoredBalls(Color.PINK, basket);
        assertEquals(2, i);
    }

    @Test
    void invalidQuantityOfGreenBalls() {
        int i = serviceBall.calculateQuantityOfColoredBalls(Color.PINK, basket);
        assertNotEquals(234, i);
    }


}