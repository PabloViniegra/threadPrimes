import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Primes extends Thread{

    public void searchPrimes() {
        int val = 0;
        System.out.println("Prime numbers....");
        while (true) {
            if (val > 100000) {
                break;
            }
            if (val > 1) {
                if (new BigInteger(val + "").isProbablePrime(val/2)) {
                    System.out.println(getName() + " " + val);
                }
            }
            val++;
            }
        }

    @Override
    public void run() {
        searchPrimes();
        try {
            TimeUnit.MILLISECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
