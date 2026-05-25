import java.util.Scanner;
public class sistema_de_ingreso_a_una_actividad_escolar{
    public static void main(String[] args){
    try(Scanner sc= new Scanner(System.in)){
        System.out.println("ingrese su nombre");
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        if(edad<14 && edad>0){
            System.out.println("Tienes algun permiso de tu acudiente?");
            String permiso =sc.nextLine();
            if (permiso.equals("si")){
                System.out.println("hola "+nombre+" puedes ingresar");
            }
            else if (permiso.equals("no")){
                System.out.println("Hola"+ nombre+" no puedes ingresar");
            }
        else if (edad>14 && edad>0){
            System.out.println("Hola "+nombre+" puedes ingresar");
        }
        else {
            System.out.println("ingrese una edad valida");
        }
        }
        sc.close();
    }
    catch(Exception e){
            System.out.println("ha ocurrido un error");
        }
    }
}