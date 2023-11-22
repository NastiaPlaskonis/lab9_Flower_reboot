package ucu.edu.ua.demo.decorator;



import ucu.edu.ua.demo.flowers.Item;

public class Paper extends DecoratorItem {

    public Paper(Item the_item) {
        super(the_item);
    }

    public double price() {
        return super.price() + 13;
    }

    public String getDescription() {
        return "Decoration - paper " + super.getDescription();
    }
}