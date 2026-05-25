import java.util.Scanner;
public class miniencuesta_sobre_uso_de_internet {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int personas=0;
            int mas_de_4_horas=0;
            float horas_de_uso=0;
            float prom;
            while (true) { 
                System.out.println("cuantas horas usa el intenet al dia?");
                float uso=sc.nextFloat();
                horas_de_uso+=uso;
                if (uso>4){
                    mas_de_4_horas++;
                }
                personas++;
                System.out.println("¿Terminar encuesta? (si/no)");
                String confirmacion = sc.next();
                if (confirmacion.equals("si")){
                    prom = horas_de_uso / personas;
                    System.out.println("Personas encuestadas: " + personas);
                    System.out.println("Promedio de horas: " + prom);
                    System.out.println("Personas que usan el internet por más de 4 horas al día: " + mas_de_4_horas);
                    break;
                }
            }
        sc.close();
        }
        catch(Exception e){
            System.out.println("ha ocurrido un error");
        }
    }
}

