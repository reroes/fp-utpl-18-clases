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
public class Suma {
    // documentación de clase Suma
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Se crea el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // valore para trabajar
        int numero_1;
        int numero_2;
        int suma;
        
        System.out.println("Ingrese el primer número:");
        numero_1 = entrada.nextInt(); // permite leer el elemento del usuario (entero)
        System.out.println("Ingrese el segundo número:");
        numero_2 = entrada.nextInt(); // permite leer el elemento del usuario (entero)
        
        suma = numero_1 + numero_2; // operación
        
        System.out.printf("La suma de los valores %d + %d = %d\n", numero_1,
                numero_2, suma); // tengo tres valores para reemplazar
        
    }
}
