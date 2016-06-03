/**
 * Created by tatiana.biliaieva on 6/3/2016.
 */

/**
 * Concrete command
 */
public class SellStock implements Order {
    private Stock stock;

    SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
