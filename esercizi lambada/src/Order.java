import java.time.LocalDate;
import java.util.List;

public class Order {

    public Long id;
    public String status;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    public List<Product> products;
    public Customer customer;

    public Order(Customer customer, LocalDate deliveryDate, List<Product> products, LocalDate orderDate, Long id, String status) {
        this.customer = customer;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.orderDate = orderDate;
        this.id = id;
        this.status = status;
    }


}
