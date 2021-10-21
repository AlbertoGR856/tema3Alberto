/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasseleccion;

import java.util.Scanner;

/**
 *
 * @author GR6
 */

/*
1.- Implementa el siguiente programa y realiza ejecuciones para los siguientes datos de edad: 10,18 y 67. ¿Cuáles son los resultados?
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        //Al introducir 18 y 67 entra en el if mostrando el mensaje por consola
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            
        //Al introducir 10 muestra el mensaje del else
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
        
         
    }

}
