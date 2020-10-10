public class Main {
    public static void main(String[] args) {
        Primes primes1 = new Primes();
        Primes primes2 = new Primes();
        Primes primes3 = new Primes();
        //Los tres hilos compiten por sacar los numeros primos
        primes1.start();
        primes2.start();
        primes3.start();
        try {
            primes1.join();  //Hasta que no acabe este hilo, lo demás no lo van a hacer. Por tanto, el Thread-0 siempre va a terminar el primnero.
            primes2.join();
            primes3.join();
        } catch (InterruptedException e) {
            System.err.println(e.getLocalizedMessage());
        }

        if (!primes1.isAlive())
            System.out.println("He terminado " + primes1.getName());
        if (!primes2.isAlive())
            System.out.println("He terminado " + primes2.getName());
        if (!primes3.isAlive())
            System.out.println("He terminado " + primes3.getName());


    }
}
