package tp1_java;

import java.util.Scanner;

public class Ejercicio8A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 / num2;

        System.out.println("Resultado de la division (int): " + resultado);

        scanner.close();
    }
}
