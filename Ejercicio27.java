import java.io.PrintStream;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ejercicio27{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner (System.in);
    public static void main (String[]args){

        String fechatexto ="";
        int mes=0;
        int dia=0;
        String signo="";
        


        screen.println("Ingresar fecha de nacimiento con formato AAAA-MM-DD");
        fechatexto=keyboard.next();  
        String[] partes = fechatexto.split("-");
        mes = Integer.parseInt(partes[1]);
        dia = Integer.parseInt(partes[2]);       

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else {
            signo = "Piscis";
        }

        screen.println("Su signo zodiacal es: "+signo);


    }}