import java.io.PrintStream;
import java.util.Scanner;


public class Ejercicio24{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){

        int estatura1=0;
        int estatura2=0;
        int estatura3=0;
        int temp=0;
        

        screen.println("Ingresa estatura en cm de la persona 1");
        estatura1=keyboard.nextInt();

        screen.println("Ingresa estatura en cm de la persona 2");
        estatura2=keyboard.nextInt();

        screen.println("Ingresa estatura en cm de la persona 3");
        estatura3=keyboard.nextInt();
        
        if ( estatura1 > estatura2) {
            temp = estatura1;
            estatura1=estatura2;
            estatura2=temp;
        }
        if ( estatura2 > estatura3) {
            temp = estatura2;
            estatura2= estatura3;
            estatura3=temp;
        }
        if ( estatura1 > estatura2) {
            temp = estatura1;
            estatura1=estatura2;
            estatura2=temp;
        }

        screen.println("Las estaturas ingresadas se muestran en forma ascendente \n"+ estatura1 +" cm, "+ estatura2 + " cm y "+estatura3 +" cm");
    
    



}
}