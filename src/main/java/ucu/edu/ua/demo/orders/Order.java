package ucu.edu.ua.demo.orders;


import ucu.edu.ua.demo.flowers.Item;
import ucu.edu.ua.demo.payment.Payment;
import ucu.edu.ua.demo.delivery.Delivery;
import ucu.edu.ua.demo.user.Interface;


import java.util.List;

public class Order {
    private Payment aPayment;
    private Delivery aDelivery;
    private List<Item> aOrder;
    private int userId;
    private List<Interface> users;


    public Order(List<Item> items) {
        this.aOrder = items;
    }

    public void setPaymentMethod(Payment clientPayment) {
        this.aPayment = clientPayment;
    }

    public double countPrice() {
        return aOrder.stream().mapToDouble(Item::price).sum();
    }

    public void setDeliverStrategy(Delivery clientDelivery) {
        this.aDelivery = clientDelivery;
    }

    public void sendNotification(String information) {
        for (Interface user: users) {
            user.update(information);
        }
    }

    public String processingOrder() {
        if (this.aPayment.pay(countPrice()) == countPrice()) {
            System.out.println("The order has been payed");

            this.aDelivery.deliver(this.aOrder);
            System.out.println("The order has been delivered");
        }
        else {
        System.out.println("Payment failed. Please try again.");
        }
        return null;
    }

    public void addItem(Item item) {
        aOrder.add(item);
    }

    public void deleteItem(Item item) {
        aOrder.remove(item);
    }

    public int getId() {
        return 0;
    }

    public int setId(int i) {
        return userId;
    }
}
