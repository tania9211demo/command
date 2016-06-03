/**
 * Created by tatiana.biliaieva on 6/3/2016.
 */

/**
 * Concrete command
 */
public class BuyStock implements Order {
    private Stock stock;

    BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}
