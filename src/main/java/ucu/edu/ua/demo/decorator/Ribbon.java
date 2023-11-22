package ucu.edu.ua.demo.decorator;



import ucu.edu.ua.demo.flowers.Item;

public class Ribbon extends DecoratorItem {

    public Ribbon(Item item) {
        super(item);
    }

    public double price() {
        return super.price() + 70;
    }

    public String getDescription() {
        return "Decoration - ribbon " +super.getDescription();
    }
}