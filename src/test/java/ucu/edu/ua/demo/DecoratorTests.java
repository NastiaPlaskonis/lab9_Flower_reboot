package ucu.edu.ua.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.demo.flowers.Flower;
import ucu.edu.ua.demo.flowers.Item;

import ucu.edu.ua.demo.decorator.ItemBasket;
import ucu.edu.ua.demo.decorator.Paper;
import ucu.edu.ua.demo.decorator.Ribbon;


class DecoratorTest {

    @Test
    public void configSuccess() {
        Item itemsTree = new Paper(new Flower());

        Assertions.assertEquals(itemsTree.getDescription(),
                "Decoration - paper description: a flower");

        Item itemsTreeNew = new Ribbon(new Paper(
            new Basket(new Flower())));
        Assertions.assertEquals(itemsTreeNew.getDescription(),
                "Decoration - ribbon Decoration - paper Decoration - a basket description: a flower");
    }

}