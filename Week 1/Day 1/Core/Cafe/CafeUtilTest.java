

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class CafeUtilTest {
   
    public void testGetStreakGoal() {
        CafeUtil cafeUtil = new CafeUtil(10);
        assertEquals(10, cafeUtil.getStreakGoal());
    }

    public void testPrintPriceChart() {
        // Implement the test for printPriceChart method here
    }

    public void testGetOrderTotal() {
        double[] prices = { 2.50, 3.75, 1.99 };
        CafeUtil cafeUtil = new CafeUtil(0);
        double expectedTotal = 8.24;
        double actualTotal = cafeUtil.getOrderTotal(prices);
        assertEquals(expectedTotal, actualTotal, 0.001);
    }

 
    public void testDisplayMenu() {
        String[] items = {"Espresso", "Macchiato", "Cappuccino", "Latte"};
    double[] prices = {1.99, 2.49, 3.99, 4.99};
    CafeUtil cafeUtil = new CafeUtil(0);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    cafeUtil.displayMenu(items, prices);

 
    String expectedOutput = "Menu:\n" +
                            "1. Espresso - $1.99\n" +
                            "2. Macchiato - $2.49\n" +
                            "3. Cappuccino - $3.99\n" +
                            "4. Latte - $4.99\n";
    assertEquals(expectedOutput, outContent.toString());
    }


    public void testAddCustomer() { 
         CafeUtil cafeUtil = new CafeUtil(0);
    cafeUtil.addCustomer("John Doe");

   
    List<String> expectedCustomers = Arrays.asList("John Doe");
    assertEquals(expectedCustomers, cafeUtil.getCustomers());
        
    }
    public void testAddCustomers() {
        CafeUtil cafeUtil = new CafeUtil(0);
        List<String> customerNames = Arrays.asList("John Doe", "Jane Smith");
        cafeUtil.addCustomers(customerNames);
    
        List<String> expectedCustomers = Arrays.asList("John Doe", "Jane Smith");
        assertEquals(expectedCustomers, cafeUtil.getCustomers());
    }
   
}