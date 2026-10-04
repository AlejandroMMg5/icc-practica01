import java.util.Scanner;
/*
clase: RFC
que tiene: Un programa que calcula e imprime el RFC basico
a partir de su nombre completo y fecha de nacimiento ingresados
autor: Alejandro Montaño Mauro
version: 1.0
*/
public static void main (String [] args) {

    Scanner in = new Scanner (System.in);
    String nombreCompleto = new String();
    String fecha = new String();
    
    System.out.println("Sistema de generacion de RFC");
    System.out.println("porfavor dime tu nombre completo");
    nombreCompleto = in.nextLine();
    nombreCompleto = nombreCompleto.trim();
    nombreCompleto = nombreCompleto.toLowerCase();
    
    System.out.println("ingresa tu fecha de nacimiento");
    System.out.println("Formato dd/mm/aa");
    fecha = in.nextLine();
    fecha = fecha.trim();

    String nombre = nombreCompleto.substring(0, 1);
    int pos = nombreCompleto.indexOf(" ");
    String apaterno = nombreCompleto.substring(pos + 1, pos + 3);
    pos = nombreCompleto.indexOf(" ", pos + 1);
    String amaterno = nombreCompleto.substring(pos+1, pos + 2);

    String año = fecha.substring(4, 6);
    String mes = fecha.substring(2, 4);
    String dia = fecha.substring(0, 2);
    String nombrenuevo = apaterno + amaterno + nombre + año + mes + dia;

    System.out.println("El RFC de " + nombreCompleto + " es:" + nombrenuevo.toUpperCase());

}
