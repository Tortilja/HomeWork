package io.codelex.PatstavigaisDarbs;

import io.codelex.PatstavigaisDarbs.ExerciseNr2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
    @Test
    void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();

        Apple apple = new Apple("Gala", 0.2);
        appleBasket.addToBasket(apple);

        Assertions.assertEquals(1, appleBasket.getCurrentItems());
        Assertions.assertEquals(apple, appleBasket.getItem());
    }

    @Test
    void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();

        Mushroom mushroom = new Mushroom("Shiitake", "Brown");
        mushroomBasket.addToBasket(mushroom);
        mushroomBasket.removeFromBasket();

        Assertions.assertEquals(0, mushroomBasket.getCurrentItems());
        Assertions.assertNull(mushroomBasket.getItem());
    }

    @Test
    void testBasketFullException() {
        Basket<Apple> appleBasket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple("Red Delicious", 0.2);
            appleBasket.addToBasket(apple);
        }

        Apple extraApple = new Apple("Gala", 0.3);
        Assertions.assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(extraApple));
    }

    @Test
    void testBasketEmptyException() {
        Basket<Mushroom> mushroomBasket = new Basket<>();

        Assertions.assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket());
    }
}