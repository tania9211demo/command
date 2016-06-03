package runable;

/**
 * Created by tatiana.biliaieva on 6/3/2016.
 */
public class RunWithDelay implements Runnable {
    DelaySetter delaySetter = new DelaySetter();

    public void run() {
        try {
            Thread.sleep(delaySetter.getDelay());

            System.out.println("Run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
