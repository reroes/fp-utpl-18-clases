/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos3;

/**
 *
 * @author reroes
 */
public class UsoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 1;
        String cadena = "Lunes1";
        switch(cadena){
            case "Lunes":
                System.out.println("Lunes");
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
