import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio20 {
    static PrintStream screen = System.out; 
    static Scanner keyboard = new Scanner (System.in);

Run | Debug
public static void main (String[] args){
    
    int numentero=0;
    int division2=0;
    String mensaje="";

screen.println(x: "Ingresar número entero"); 
numentero= keyboard.nextInt();
division2=numentero%2;

if (division2==0) {
    mensaje= "El número ingresado es par";

}else{
    mensaje= "El número ingresado es impar";

screen.println(mensaje);

}

 } }