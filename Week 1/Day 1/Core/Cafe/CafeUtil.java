import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
public class CafeUtil {
    private int streakGoal;
    private List<String> customers = new ArrayList<>();

    public CafeUtil(int streakGoal) {
        this.streakGoal = streakGoal;
    }

    public int getStreakGoal() {
        return streakGoal;
    }

    public void printPriceChart() {
         String[] items = {"Espresso", "Macchiato", "Cappuccino", "Latte"};
        double[] prices = {1.99, 2.49, 3.99, 4.99};

        System.out.println("Price Chart:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": " + formatPrice(prices[i]));
        }
    }

    private String formatPrice(double price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(price);
    }
        
    

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(String[] items, double[] prices) {
        System.out.println("Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - " + formatPrice(prices[i]));
        }
    }
    
   

    public void addCustomer(String customerName) {
        customers.add(customerName);
    }

    public void addCustomers(List<String> customerNames) {
        customers.addAll(customerNames);
    }
}

