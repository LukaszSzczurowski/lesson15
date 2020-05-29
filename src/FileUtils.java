import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils {

    static ArrayList<Product> readDataFromFile(String fileName) throws IOException {
        ArrayList<Product> productList = new ArrayList<>();
        int size = countSize(fileName);
        String[] helperTable = new String[size];
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        for (int i = 0; i < helperTable.length; i++) {
            helperTable[i] = br.readLine();
            String[] split = helperTable[i].split(";");
            String name = split[0];
            double price = Double.parseDouble(split[1]);
            double tax = Double.parseDouble(split[2]);
            productList.add(new Product(name, price, tax));
        }
        br.close();
        return productList;
    }

    private static int countSize(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()){
            lines++;
            scanner.nextLine();
        }
        scanner.close();
        return lines;
    }
}
