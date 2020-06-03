import java.math.BigDecimal;

public class Statistics {
    private BigDecimal sumNettoPrice;
    private BigDecimal sumTaxVat;
    private BigDecimal sumBruttoPrice;

    public Statistics(BigDecimal sumNettoPrice, BigDecimal sumTaxVat, BigDecimal sumBruttoPrice) {
        this.sumNettoPrice = sumNettoPrice;
        this.sumTaxVat = sumTaxVat;
        this.sumBruttoPrice = sumBruttoPrice;
    }

    public BigDecimal getSumNettoPrice() {
        return sumNettoPrice;
    }

    public void setSumNettoPrice(BigDecimal sumNettoPrice) {
        this.sumNettoPrice = sumNettoPrice;
    }

    public BigDecimal getSumTaxVat() {
        return sumTaxVat;
    }

    public void setSumTaxVat(BigDecimal sumTaxVat) {
        this.sumTaxVat = sumTaxVat;
    }

    public BigDecimal getSumBruttoPrice() {
        return sumBruttoPrice;
    }

    public void setSumBruttoPrice(BigDecimal sumBruttoPrice) {
        this.sumBruttoPrice = sumBruttoPrice;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sprzedaż netto: " + sumNettoPrice + "zł \n");
        stringBuilder.append("Suma podatku VAT: " + sumTaxVat + "\n");
        stringBuilder.append("Suma sprzedaży brutto: " + sumBruttoPrice + "zł \n");
        return stringBuilder.toString();
    }
}
