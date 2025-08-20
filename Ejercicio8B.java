package tp1_java;

import java.util.Scanner;

public class Ejercicio8B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 / num2;

        System.out.println("Resultado de la division (double): " + resultado);

        scanner.close();
    }
}
