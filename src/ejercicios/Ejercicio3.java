package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> listaNPrimos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer número, superior a 1");
        int numeroMenor = scanner.nextInt();
        System.out.println("Introduce segundo número, superior a 1");
        int numeroMayor = scanner.nextInt();
       // scanner.close();
        if (numeroMenor > numeroMayor) {
            int temp = numeroMayor;
            numeroMayor = numeroMenor;
            numeroMenor = temp;
        }
        System.out.printf("Menor %d, mayor %d, %n", numeroMenor, numeroMayor);
        for (int i = numeroMenor; i <= numeroMayor ; i++) {
           // System.out.printf("¿Es primo %d? %b %n", i, esPrimo(i));
            if (esPrimo(i))
                listaNPrimos.add(i);
        }
       // System.out.println(listaNPrimos);
        System.out.println("Indica el nº de columnas para mostrar los nº primos");
        int columnas = scanner.nextInt();
        scanner.close();
        mostrarFormateadosNPrimos(listaNPrimos, columnas);
    }

    private static void mostrarFormateadosNPrimos(List<Integer> listaNPrimos, int columnas) {
        for (int i = 0; i < listaNPrimos.size(); i++) {
            if (i % columnas == 0)
                System.out.println();
            System.out.printf("%6d", listaNPrimos.get(i));
        }
    }

    private static boolean esPrimo(int numero) {
        for (int i = 2; i < numero ; i++) {
            if ( numero % i == 0)
                return false;
        }
        return true;
    }
}
