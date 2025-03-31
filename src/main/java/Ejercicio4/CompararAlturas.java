import java.util.Scanner;


public class CompararAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de la primera persona
        System.out.print("Ingrese el nombre de la primera persona: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la altura de " + nombre1 + " en metros: ");
        double altura1 = scanner.nextDouble();

        scanner.nextLine(); // Consumir la nueva línea

        // Ingresar datos de la segunda persona
        System.out.print("Ingrese el nombre de la segunda persona: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la altura de " + nombre2 + " en metros: ");
        double altura2 = scanner.nextDouble();

        // Determinar y mostrar quién es más alto
        if (altura1 > altura2) {
            System.out.println(nombre1 + " es más alto(a) con una altura de " + altura1 + " metros.");
        } else if (altura2 > altura1) {
            System.out.println(nombre2 + " es más alto(a) con una altura de " + altura2 + " metros.");
        } else {
            System.out.println("Ambos tienen la misma altura de " + altura1 + " metros.");
        }

        scanner.close();
    }
}
