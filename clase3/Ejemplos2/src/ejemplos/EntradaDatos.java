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
public class EntradaDatos {

    public static void main(String[] args) {
        // este método es para ingresar valores
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese su edad :");
        valor = entrada.nextInt();
    }
}
