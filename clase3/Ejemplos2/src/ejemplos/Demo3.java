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
public class Demo3 {

    public static void main(String[] args) {
        // este método es para ingresar valores
        // x = 10/a + b  - 3(c)
        Scanner entrada = new Scanner(System.in);
        int a = 3;
        int b = 10;
        int c = 3;
        int x = 10 / a + b - 3 * c;
        System.out.println(x);
    }
}
