import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    static List<Product> readDataFromFile(String fileName) throws IOException {
        List<Product> productList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String newLine = null;
        while((newLine = br.readLine()) != null){
            String[] split = newLine.split(";");
            String name = split[0];
            double price = Double.parseDouble(split[1]);
            double tax = Double.parseDouble(split[2]);
            productList.add(new Product(name, price, tax));
        }
        br.close();
        return productList;
    }

    public static void saveStatistics(Statistics statistics, String saveFile) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile));
        bw.write(statistics.toString());
        bw.close();
    }
}
