/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurarepeticion;

import java.util.Scanner;

/**
 *
 * @author albertogarzon
 */
/*
6.- Implementa el programa del ejercicio 2 usando un for.
 */
public class Ej06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;

        }
    }

}
