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
public class EjemploDiez {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        boolean bandera = true;
        while (bandera){
            System.out.println("Ingrese valor a la suma");
            int valor = entrada.nextInt();
            suma = suma + valor;
            
            // salir
            System.out.println("Desea salir pulse -1");
            int m = entrada.nextInt();
            if(m==-1){
                bandera = false;
            }
        }
        
        System.out.printf("El valor de la suma es:%d\n", suma);
    }
}
