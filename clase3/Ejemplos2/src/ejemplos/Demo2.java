/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Demo2 {

    public static void main(String[] args) {
        // este método es para ingresar valores
        // x = 10/a + b  - 3(c)
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Ingrese valor a:");
        a = entrada.nextInt();
        System.out.println("Ingrese valor b:");
        b = entrada.nextInt();
        System.out.println("Ingrese valor c:");
        c = entrada.nextInt();
        double a1 = (double) (a);
        double b1 = (double) (b);
        double c1 = (double) (c);
        double x = 10 / a1 + b1 - 3 * c1;
        System.out.printf("El valor es %.3f", x);
        System.out.printf("El valor es %.3f", x);

    }
}
