import java.io.PrintStream;
import java.util.Scanner;


public class Ejercicio21{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){
  
        int numentero=0;
        String mensaje="";

        screen.println("Ingrese un número entero");
        numentero= keyboard.nextInt();

        if (numentero==0) {
            mensaje="El número ingresado es cero";
        }
        else if(numentero>0){
            mensaje="El número ingresado es positivo";
        }
        else{
            mensaje="El número ingresado es negativo";

        }

        screen.println(mensaje);            
        }      
        
    }