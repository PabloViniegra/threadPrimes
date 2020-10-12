import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hilos = 0;
        boolean check;
        Primes prime;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("¿Cuantos hilos quieres? (no más de 8)");
            check = false;
            while (!check) {
                try {
                    hilos = sc.nextInt();
                    check = true;
                } catch (InputMismatchException e) {
                    System.out.print("Por favor, introduce un dato numérico: ");
                    sc.next();
                }
            }
        } while (hilos > 8);

        for (int i = 0; i < hilos; i++) {
            prime = new Primes();
            prime.start();
            //prime.join();
        }
    }
}
