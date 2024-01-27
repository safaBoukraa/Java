public class TesrOrders {
    public static void main(String[] args) {
        
        Iteams item1 = new Iteams("mocha", 3.99);
        Iteams item2 = new Iteams("latte", 4.49);
        Iteams item3 = new Iteams("drip coffee", 2.99);
        Iteams item4 = new Iteams("cappuccino", 4.99);

        
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

       
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);

        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item2);

       
        System.out.println(order1);

       
        System.out.println(order1.getTotal());

        
        order2.addItem(item1);

       
        order3.addItem(item4);

        
        order4.addItem(item3);

       
        order1.updateStatus("Ready");

       
        order4.addItem(item3);
        order4.addItem(item3);

      
        order2.updateStatus("Ready");
    }
}
