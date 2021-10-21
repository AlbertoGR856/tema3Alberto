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
4.- Reescribe el programa del ejercicio 1 usando el operador ternario ?:.
 */
public class Ej04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad: ");

        int edad = scanner.nextInt();

        String resultado = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";

        System.out.print("mostrar la edad: ");
        System.out.println(resultado);
    }

}
