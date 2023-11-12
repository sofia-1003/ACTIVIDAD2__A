import java.io.PrintStream;
import java.util.Scanner;


public class Ejercicio26{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){

        long numcelular=0;
        long prefijo=0;        

        screen.println("Ingresar número celular");
        numcelular=keyboard.nextLong();
        prefijo=numcelular/10000000;
        
        if ( prefijo>=300 && prefijo<=305){
            screen.println("El prefijo es: "+ prefijo + " y corresponde al operador movil claro el cual es un operador movil con red. ");
        }
        else if (prefijo >=310 && prefijo <=314){
            screen.println("El prefijo es: "+ prefijo + " y correspomdel al operador movil Movistar el cual es un operador de movil con red.");
        }
        else if (prefijo >= 315 && prefijo <= 320 ){
            screen.println("El prefijo es: "+ prefijo +" y corresponde al operador movil Tigo el cual es un operador movil con red.");

        }
        else if( prefijo == 321){
            screen.println("El prefijo es: "+ prefijo + "y corresponde al operador movil Movil Exito el cual es un operador movil virtual y trabaja sobre la infraestructura de Tigo Colombia");
        }
        else if( prefijo >= 322 && prefijo <= 323){
            screen.println("El prefijo es: "+ prefijo + "y corresponde al operador movil Uff Movil el cual es un operador de movil virtual y trabaja sobre la infraestructura de Tigo Colombia ");
        }
        else if (prefijo == 350){
            screen.println("El prefijo ingresado es: "+ prefijo +"correspondel operador movil Virgin Mobile el cual es un operador movil virtual y trabaja sobre la infraestructura de Movistar" );
        }
        else {
            screen.println("El número ingresado es incorrecto");
        }

        





        

        

        

    

}
}