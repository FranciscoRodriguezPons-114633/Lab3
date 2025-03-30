package Ejercicio3;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Variables para almacenar precio y cantidad de cada articulo
        double precioUnitario;
        int cantidad;
        double totalFactura=0;

        //Ingreso de datos de 3 articulos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del artículo " + i + ":");
            System.out.print("Precio unitario: ");
            precioUnitario = scanner.nextDouble();
            System.out.print("Cantidad: ");
            cantidad = scanner.nextInt();

            // Calculamos el subtotal del artículo y sumamos al total de la factura
            double subtotal = precioUnitario * cantidad;
            totalFactura += subtotal;
        }


        //Imprimimos el total de la factura
        System.out.println("El total de la factura es: " + totalFactura);
        //Cerramos el scanner
        scanner.close();




    }



}
