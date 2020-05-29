import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stats.txt"))){
            List<Product> productList = FileUtils.readDataFromFile("data.csv");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sprzedaż netto: " + Calculation.sumNettoPrice(productList) + "zł \n");
            stringBuilder.append("Suma podatku VAT: " + Calculation.sumTaxVAT(productList) + "\n");
            stringBuilder.append("Suma sprzedaży brutto: " + Calculation.sumBruttoPrice(productList) + "zł \n");
            bw.write(stringBuilder.toString());
        } catch (IOException e) {
            System.err.println("Błąd zapisu/odczytu pliku");
        }
    }
}
