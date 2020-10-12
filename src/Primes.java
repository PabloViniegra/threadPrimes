import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class Primes extends Thread {
    private int contador = 0;



    public void searchPrimes() { //MÉTODO PARA BUSCAR NUMEROS PRIMOS Y QUYE EJECUTARÁN LOS HILOS
        int val = 0;
        System.out.println("Prime numbers....");
        while (true) {
            if (val > 100000) {
                break;
            }
            if (val > 1) {
                if (new BigInteger(val + "").isProbablePrime(val / 2)) {
                    System.out.println(getName() + " " + val );
                    this.contador++;
                }
            }
            val++;

        }
    }


    public int getContador() {  //GETTER DEL CONTADOR DE NUMEROS PRIMOS
        return contador;
    }

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        searchPrimes();
        System.out.println("El hilo " + getName() + " ha tardado en ejecutarse " + (System.currentTimeMillis() - time)  + " milisegundos");
        System.out.println("Hay " + getContador() + " números primos");
        try {
            TimeUnit.MILLISECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
