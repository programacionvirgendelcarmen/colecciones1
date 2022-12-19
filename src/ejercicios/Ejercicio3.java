package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce primer número");
        int numeroMenor = scanner.nextInt();
        System.out.println("Introduce segundo número");
        int numeroMayor = scanner.nextInt();
        scanner.close();
        if (numeroMenor > numeroMayor) {
            int temp = numeroMayor;
            numeroMayor = numeroMenor;
            numeroMenor = temp;
        }
        System.out.printf("Menor %d, mayor %d, %n", numeroMenor, numeroMayor);

    }
}
