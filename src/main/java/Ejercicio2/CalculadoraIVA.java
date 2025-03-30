package Ejercicio2;

public class CalculadoraIVA {

    private static final double IVA = 0.21; // 21% de IVA

    public double calcularPrecioConIVA(double precio) {
        return precio + (precio * IVA);
    }
}
