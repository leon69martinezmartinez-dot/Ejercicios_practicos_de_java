// Importar la clase Scanner para leer datos ingresados por el usuario.
import java.util.Scanner;
public class Cálculo_de_salario_semanal {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer desde la entrada estándar.
        try (Scanner sc = new Scanner(System.in)) {
            // Pedir al usuario información básica del trabajador.
            System.out.println("Ingrese su nombre");
            String nombre = sc.next();

            System.out.println("Ingrese las horas trabajadas a la semana");
            float horas = sc.nextFloat();

            System.out.println("Ingrese el valor por hora");
            float valor = sc.nextFloat();

            // Calcular el salario total multiplicando horas por valor de hora.
            float salario = horas * valor;

            // Mostrar el salario calculado.
            System.out.println("El trabajador " + nombre + " tiene un salario de " + salario);

            // Evaluar si se trabajaron horas extra, una jornada normal o valores inválidos.
            if (horas > 48 && horas > 0) {
                System.out.println("El trabajador realizó horas extra.");
            } else if (horas <= 48 && horas > 0) {
                System.out.println("El trabajador cumplió una jornada normal");
            } else {
                System.out.println("Horas inválidas");
            }

        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre alguna excepción al leer los datos.
            System.out.println("[!] Error al procesar la entrada de datos");
        }
    }
}
