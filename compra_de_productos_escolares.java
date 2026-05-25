// Importar la clase Scanner para leer datos desde la entrada estándar.
import java.util.Scanner;
public class compra_de_productos_escolares {
    public static void main(String[] args) {
        //Crear el objeto Scanner para leer desde la entrada estándar.
        try (Scanner sc = new Scanner(System.in)) {
            // Solicitar el nombre del comprador.
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();

            // Solicitar el precio de cada producto escolar.
            System.out.println("Ingrese el valor del lápiz");
            float valor1 = sc.nextFloat();

            System.out.println("Ingrese el valor del cuaderno");
            float valor2 = sc.nextFloat();

            System.out.println("Ingrese el valor del borrador");
            float valor3 = sc.nextFloat();

            // Calcular el subtotal sumando los valores ingresados.
            float valor4 = valor1 + valor2 + valor3;

            // Aplicar descuento si el subtotal es mayor a 50.000.
            if (valor4 > 50000) {
                double descuento = valor4 * 0.9;
                System.out.println("--------- Nombre del comprador: " + nombre + " ----------");
                System.out.println("Total sin descuento: $" + valor4);
                System.out.println("Descuento de 10%");
                System.out.println("Valor total: $" + descuento);
            } else if (valor4 < 50000 && valor4 > 0) {
                // No hay descuento para compras menores a 50000 y mayores que 0.
                System.out.println("--------------- Nombre del comprador: " + nombre + " ------------");
                System.out.println("Subtotal: $" + valor4);
                System.out.println("Descuento: 0%");
                System.out.println("Total a pagar: $" + valor4);
            } else {
                // Manejo de valores inválidos como negativos o cero.
                System.out.println("Valor inválido");
            }

        } catch (Exception e) {
            // Mostrar mensaje de error si ocurre una excepción al leer datos.
            System.out.println("Error al procesar la entrada de datos");
        }
    }
}
