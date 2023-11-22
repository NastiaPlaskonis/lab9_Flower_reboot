package ucu.edu.ua.demo.decorator;

import ucu.edu.ua.demo.flowers.Item;

public class Basket extends DecoratorItem{
    public Basket(Item the_item) {
        super(the_item);
    }

    public double price() {
        return super.price() + 10;
    }

    public String getDescription() {
        return "Decoration - a basket " + super.getDescription();
    }
}