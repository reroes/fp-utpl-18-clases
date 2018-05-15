/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author reroes
 */
public class EjemploTrece {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int suma = 0;
        String cadena = String.format("%s\t%s\n","Contador","Suma");
        while (contador <= 4){
            suma = suma + contador;
            cadena = String.format("%s%d\t\t%d\n", cadena, contador, suma);
            contador = contador + 1;
        }
        
        System.out.printf("%s", cadena);
        
    }
}
