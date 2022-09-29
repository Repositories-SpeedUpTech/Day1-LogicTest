package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un número flotante para iniciar: ");
        Double cadena = entrada.nextDouble();

    Numero nuevoNumero = new Numero(cadena);

        nuevoNumero.generarNumeroDigital();
    }
}
