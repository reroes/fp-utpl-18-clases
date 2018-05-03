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
public class SeleccionSimple2 {
    public static void main(String[] args) {
            // documentacion
            
            String calificacion = "buena";
            
            if (calificacion == "buena"){ // no recomendado
                System.out.printf("Usted está aprobado con %s\n", calificacion);
            }
            
            if (calificacion.equals("buena")){
                System.out.printf("Usted está aprobado con %s\n", calificacion);
            }
            
            if (calificacion.contains("naa")){
                System.out.println("correcto");
            }else{
                System.out.println("no correcto");
            }
            
        
        }
}
