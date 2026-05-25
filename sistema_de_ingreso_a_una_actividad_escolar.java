import java.util.Scanner;
public class sistema_de_ingreso_a_una_actividad_escolar {
    public static void main(String[] args) {
        // Crear el Scanner para leer datos desde la entrada estándar.
        try (Scanner sc = new Scanner(System.in)) {
            // Solicitamos el nombre del usuario.
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();

            // Leer la edad del usuario.
            int edad = sc.nextInt();

            // Determinar si el usuario puede ingresar según su edad y permiso.
            if (edad < 14 && edad > 0) {
                // Si el usuario es menor de 14 años, preguntar por permiso del acudiente.
                System.out.println("Tienes algun permiso de tu acudiente?");
                String permiso = sc.nextLine();

                if (permiso.equals("si")) {
                    System.out.println("Hola " + nombre + " puedes ingresar");
                } else if (permiso.equals("no")) {
                    System.out.println("Hola " + nombre + " no puedes ingresar");
                }
            } else if (edad > 14 && edad > 0) {
                // Si el usuario es mayor de 14 años, puede ingresar sin permiso adicional.
                System.out.println("Hola " + nombre + " puedes ingresar");
            } else {
                // Edad inválida o no permitida.
                System.out.println("Ingrese una edad valida");
            }

        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre un problema con la entrada.
            System.out.println("Ha ocurrido un error al procesar los datos");
        }
    }
}
