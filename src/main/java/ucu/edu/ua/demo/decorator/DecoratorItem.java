package ucu.edu.ua.demo.decorator;

import ucu.edu.ua.demo.flowers.Item;

public abstract class DecoratorItem extends Item {
    private Item the_item;

    public DecoratorItem(Item the_item) {
        this.the_item = the_item;
    }

    @Override
    public double price() {
        return the_item.price();
    }

    @Override
    public String getDescription() {
        return the_item.getDescription();
    }

}