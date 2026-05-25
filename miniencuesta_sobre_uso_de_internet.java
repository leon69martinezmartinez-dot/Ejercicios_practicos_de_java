import java.util.Scanner;
public class miniencuesta_sobre_uso_de_internet {
    public static void main(String[] args) {
        // Crear el Scanner para leer datos desde la consola.
        try (Scanner sc = new Scanner(System.in)) {
            // Variables para el conteo y la suma de horas de uso.
            int personas = 0;
            int mas_de_4_horas = 0;
            float horas_de_uso = 0;
            float prom;

            // Bucle que repite la encuesta hasta que el usuario decida terminar.
            while (true) {
                // Preguntar al usuario cuántas horas usa Internet al día.
                System.out.println("¿Cuántas horas usa el internet al día?");
                float uso = sc.nextFloat();

                // Acumular las horas de uso para calcular el promedio posterior.
                horas_de_uso += uso;

                // Contar cuántas personas usan Internet más de 4 horas diarias.
                if (uso > 4) {
                    mas_de_4_horas++;
                }

                // Contar el total de personas encuestadas.
                personas++;

                // Preguntar si se desea terminar la encuesta.
                System.out.println("¿Terminar encuesta? (si/no)");
                String confirmacion = sc.next();

                // Si el usuario responde "si", mostrar resultados y salir del bucle.
                if (confirmacion.equals("si")) {
                    prom = horas_de_uso / personas;
                    System.out.println("Personas encuestadas: " + personas);
                    System.out.println("Promedio de horas: " + prom);
                    System.out.println("Personas que usan el internet por más de 4 horas al día: " + mas_de_4_horas);
                    break;
                }
            }

        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre una excepción durante la lectura.
            System.out.println("Ha ocurrido un error al procesar la encuesta.");
        }
    }
}

