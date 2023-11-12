import java.io.PrintStream;
import java.util.Scanner;


public class Ejercicio23{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){

        int llantas=0;
        int costo=0;
        String mensaje="";
        
         
        screen.println("Ingresar cantidad de llantas que desea comprar");
        llantas=keyboard.nextInt();

        if (llantas>=4) {
            costo=llantas*108000;  
            mensaje="Su compra aplica para descuento, el costo de las llantas es de $";
                  
        }else{
            costo=llantas*120000;
            mensaje="A su compra no le aplica descuento, el costo de sus llantas es de $";
        }

        screen.println(mensaje + costo);

    }
}