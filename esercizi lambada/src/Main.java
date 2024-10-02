import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Esercizio uno !");

        // lista prodotti
        Product calza = new Product("everyday", 2522L, "Calza da notte", 10.43);
        Product harryPotter = new Product("book", 5677L, "Harry potter", 25.45 );
        Product manualeCucina = new Product("book", 4455L,"Cucina parodi", 110.00);
        Product basketBall = new Product("sport", 2662L, "Basket Ball", 45.00);
        Product cuffia = new Product("everyday", 2592L, "cuffia per piscina", 30.43);
        Product giovaneErmellino = new Product("quadro", 5555L, "Il giovane ermellino", 210.45 );
        Product cocaCola = new Product("drink", 4005L,"Coca Cola", 2.00);
        Product portablePc = new Product("tech", 1010L, "MacBook Pro", 2045.00);


        List<Product> listaProdotti = new ArrayList<>();

        Stream<listaProdotti> stream =
    }



}