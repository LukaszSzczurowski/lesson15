import java.math.BigDecimal;
import java.util.List;

public class Calculation {

    static Statistics countStatistics(List<Product> productList){
        return new Statistics(sumNettoPrice(productList), sumTaxVAT(productList), sumBruttoPrice(productList));
    }

    static BigDecimal sumNettoPrice(List<Product> productList){
        double sumNetto = 0;
        for (Product product : productList) {
            sumNetto += product.getPrice() ;
        }
        BigDecimal sumNettoBD = BigDecimal.valueOf(sumNetto);
        return sumNettoBD;
    }

    static BigDecimal sumTaxVAT(List<Product> productList){
        double sumTax = 0;
        for (Product product : productList) {
            sumTax += product.getPrice() * product.getTax() ;
        }
        BigDecimal sumTaxBD = BigDecimal.valueOf(sumTax);
        return sumTaxBD;
    }
    
    static BigDecimal sumBruttoPrice(List<Product> productList){
        double sumBrutto = 0;
        for (Product product : productList) {
            sumBrutto += (product.getPrice() * product.getTax()) + product.getPrice() ;
        }
        BigDecimal sumBruttoBD = BigDecimal.valueOf(sumBrutto);
        return sumBruttoBD;
    }

}
