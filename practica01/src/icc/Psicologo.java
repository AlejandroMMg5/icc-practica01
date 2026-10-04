import java.util.Scanner;
/*
classe: Psicologo
que tiene: Conversacion simulada con Psicologo
autor: Alejandro
version: 1.0
*/
public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    String nombreCompleto = new String();
    String problema = new String();
    String problemaB = new String();

    System.out.println("Buen dia, es tu primera sesion.");
    System.out.println("porfavor dime tu nombre");
    nombreCompleto = in.nextLine();

    System.out.println("Bienvenido "+nombreCompleto);
    System.out.println("dime que te trajo aqui.");
    problema = in.nextLine();

    System.out.println("MMM... ya veo");
    System.out.println("Y digame...");
    System.out.println("Por que dice \"" + problema + "\"");
    problemaB = in.nextLine();

    System.out.println("Bueno,Muy interesante!! Hablaremos de ello con mas detalle en la siguiente sesion.");

}