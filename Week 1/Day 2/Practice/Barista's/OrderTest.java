import java.util.ArrayList;
public class OrderTest {
    public static void main(String[] args) {

        Item item1 = new Item("drip coffee", 2.5, "hot coffee");
        Item item2 = new Item("capuccino", 3.2, "espresso-based drink");
        Item item3 = new Item("iced coffee", 7.6, "cold coffee");
        Item item4 = new Item("mocha", 5.5, "coffee with chocolate");

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Safa");
        Order order4 = new Order("mariem");
        Order order5 = new Order("ana");

        
        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

    
        System.out.println(order5.getStatusMessage());
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        System.out.println(order5.getOrderTotal());
        order5.display();
    }
}