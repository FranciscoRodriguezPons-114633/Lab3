package ejercicio1;
import java.util.Scanner;

public class Calculadora {
        public void realizarOperaciones() {
            Scanner scanner = new Scanner(System.in);

            // Declaración de variables
            int num1, num2;

            // Entrada de datos
            System.out.print("Ingrese el primer número entero: ");
            num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            num2 = scanner.nextInt();

            // Operaciones
            int suma = num1 + num2;
            int resta = num1 - num2;
            int producto = num1 * num2;

            // Verificación para evitar división por cero
            if (num2 != 0) {
                double cociente = (double) num1 / num2;
                System.out.println("El cociente es: " + cociente);
            } else {
                System.out.println("No se puede dividir por cero.");
            }

            // Salida de resultados
            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + resta);
            System.out.println("El producto es: " + producto);

            scanner.close();
        }
}
