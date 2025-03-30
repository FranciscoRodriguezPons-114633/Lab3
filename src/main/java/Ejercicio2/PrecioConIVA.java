package Ejercicio2;
import java.util.Scanner;



public class PrecioConIVA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraIVA calculadora = new CalculadoraIVA();
        // Entrada de datos
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();

        // Cálculo del precio con IVA
        double precioFinal = calculadora.calcularPrecioConIVA(precio);

        // Salida del resultado
        System.out.println("El precio con IVA es: " + precioFinal);

        scanner.close();
    }
}