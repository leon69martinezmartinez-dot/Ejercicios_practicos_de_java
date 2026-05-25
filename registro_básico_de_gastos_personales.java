import java.util.Scanner;
public class registro_básico_de_gastos_personales {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            //peticion de nombre
            System.out.println("ingrese su nombre: ");
            String nombre = sc.nextLine();
            //peticion de los 5 gastos
            float gasto=0;
            for (int i=1;i<11;i++){
                System.out.println("ingrese el valor del producto "+i);
                float valor = sc.nextFloat();
                //validacion que ingrese un valor valido
                if (valor<0){
                    System.out.println("[!]Error: ingrese un valor valido");
                    i-=1;
                }
                else{
                    gasto += valor;
                }
            }
            //calculo de promedio gastado
            float promedio_gastado = gasto/10;
            //mostrar en pantalla
            //saludo
            System.out.println("hola "+nombre+" tu promedio de gasto es de "+promedio_gastado);
            //condicional
            //si gasta mas de 100000
            if (gasto >100000 && gasto>0){
                System.out.println("Debe revisar sus gastos de la semana. ");
                System.out.println("total gastado: $"+gasto);
            }
            //si gasta 100000 o menos 
            else if(gasto<=100000 && gasto>0){
                System.out.println("Sus gastos están controlados." );
                System.out.println("total gastado: $"+gasto);
            }
        sc.close();
    }
    catch(Exception e){
            System.out.println("ha ocurrido un error");
        }
    }
}
