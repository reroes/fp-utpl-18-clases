/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        
        System.out.printf("Nombre %s - Apellido %s - Edad %d", nombre, apellido, edad);
    }
    
}
