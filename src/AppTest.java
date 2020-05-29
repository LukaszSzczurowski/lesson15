import java.io.IOException;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        try {
            List<Product> productList = FileUtils.readDataFromFile("data.csv");
            for (Product product : productList) {
                System.out.println(product);
            }
        } catch (IOException e) {
            System.err.println("Nie udało się wczytać pliku");
        }
    }
}
