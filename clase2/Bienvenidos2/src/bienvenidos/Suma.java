/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienvenidos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    
    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1; // primer número a sumar
        int numero2; // segundo número a sumar
        int suma; // suma del primer y segundo número
        
        System.out.println("Ingresar primer número");
        numero1 = entrada.nextInt(); // lee el primer número que el usuario ingresa
        
        System.out.println("Ingresar segundo número");
        numero2 = entrada.nextInt(); // lee el segundo número que el usuario ingresa
        
        suma = numero1 + numero2;
        
        System.out.printf("La suma es %d.\n", suma);
        
    }
    
}
