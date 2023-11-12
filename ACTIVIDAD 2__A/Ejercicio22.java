import java.io.PrintStream;
import java.util.Scanner;


public class Ejercicio22{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){

        int numentero=0;
        int division2=0;
        String mensaje="";
        String mensaje1="";

        screen.println("Ingresar número entero");
        numentero= keyboard.nextInt();
        division2=numentero%2;

        if (division2==0) {
            mensaje= "El número ingresado es par";    
        }else{
            mensaje= "El número ingresado es impar";
        }

        if (numentero==0) {
            mensaje1="El número ingresado es cero";
        }
        else if(numentero>0){
            mensaje1=" El número ingresado es positivo";
        }
        else{
            mensaje1=" El número ingresado es negativo";

        }

        screen.println(mensaje + mensaje1);      

            
        }
        
        
    }

