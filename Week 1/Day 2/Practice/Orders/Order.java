
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private List<Iteams> items = new ArrayList<>();
    private double total;
    private String status;

    public Order(String name) {
        this.name = name;
        this.status = "Pending";
    }

    public String getName() {
        return name;
    }

    public List<Iteams> getIteams() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void addItem(Iteams item) {
        items.add(item);
        total += item.getPrice();
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}
