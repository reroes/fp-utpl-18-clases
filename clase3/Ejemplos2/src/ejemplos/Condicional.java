/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Condicional {
    
    public static void main(String[] args) {
        // manejo de condicionales
        int valor = 9;
        
        if(valor >= 10){
            System.out.printf("Aprobado con nota %d", valor);
        }else{
            System.out.printf("Reprobado con nota %d", valor);
        }
        
    }
}
