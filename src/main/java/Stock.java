/**
 * Created by tatiana.biliaieva on 6/3/2016.
 */
/**
 * Receiver
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + "]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + "]sold ");
    }
}
