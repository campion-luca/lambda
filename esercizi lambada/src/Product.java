import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Product {

    public Long id;
    public String name;
    public String category;
    public Double price;



    public Product(String category, Long id, String name, Double price) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
