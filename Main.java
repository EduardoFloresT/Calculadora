package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int option;
        float n1, n2, result;

        System.out.println("\t\t\tCalculadora Básica");
        System.out.println("Selecciona la operación matemática");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        option = entrada.nextInt();

        DecimalFormat df = new DecimalFormat("#.00");

        switch (option) {

            case 1 :
                System.out.println("Digita los números a SUMAR: ");
                n1 = entrada.nextFloat();
                n2 = entrada.nextFloat();
                result = n1 + n2;
                System.out.println("El resultado de la SUMA es: " + df.format(result));
                break;

            case 2 :
                System.out.println("Digita los números a RESTAR: ");
                n1 = entrada.nextFloat();
                n2 = entrada.nextFloat();
                result = n1 - n2;
                System.out.println("El resultado de la RESTA es: " + df.format(result));
                break;

            case 3 :
                System.out.println("Digita los números a MULTIPLICAR: ");
                n1 = entrada.nextFloat();
                n2 = entrada.nextFloat();
                result = n1 * n2;
                System.out.println("El resultado de la MULTIPLICACION es: " + df.format(result));
                break;

            case 4 :
                System.out.println("Digita los números a DIVIDIR: ");
                n1 = entrada.nextFloat();
                n2 = entrada.nextFloat();
                result = n1 / n2;
                System.out.println("El resultado de la DIVISION es: " + df.format(result));
                break;

            default:
                System.out.println("Opción Invalida");
        }
    }
}
