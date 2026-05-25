import java.util.Scanner;
public class registro_básico_de_gastos_personales {
    public static void main(String[] args) {
        // Crear el Scanner para leer los datos del usuario desde la consola.
        try (Scanner sc = new Scanner(System.in)) {
            // Pedir el nombre del usuario.
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            // Registrar el gasto total acumulado.
            float gasto = 0;

            // Pedir el precio de 10 productos y sumar los valores.
            for (int i = 1; i < 11; i++) {
                System.out.println("Ingrese el valor del producto " + i);
                float valor = sc.nextFloat();

                // Validar que el valor ingresado no sea negativo.
                if (valor < 0) {
                    System.out.println("[!] Error: ingrese un valor válido");
                    i -= 1; // Repetir el mismo producto si el valor es inválido.
                } else {
                    gasto += valor;
                }
            }

            // Calcular el promedio de gasto por producto.
            float promedio_gastado = gasto / 10;

            // Mostrar el resultado al usuario.
            System.out.println("Hola " + nombre + ", tu promedio de gasto es de " + promedio_gastado);

            // Mostrar recomendaciones según el total gastado.
            if (gasto > 100000 && gasto > 0) {
                System.out.println("Debe revisar sus gastos de la semana.");
                System.out.println("Total gastado: $" + gasto);
            } else if (gasto <= 100000 && gasto > 0) {
                System.out.println("Sus gastos están controlados.");
                System.out.println("Total gastado: $" + gasto);
            }

        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre una excepción al leer datos.
            System.out.println("Ha ocurrido un error al procesar los gastos.");
        }
    }
}
