import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        try {
            List<Product> productList = FileUtils.readDataFromFile("data.csv");
            Statistics statistics = Calculation.countStatistics(productList);
            FileUtils.saveStatistics(statistics, "stats2.txt");
        } catch (IOException e) {
            System.err.println("Błąd zapisu/odczytu pliku");
        }
    }


}
