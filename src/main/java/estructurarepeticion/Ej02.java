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
2.-  Intenta averiguar qué realiza el siguiente programa, sin implementarlo. 
Implementa el programa en el entorno y compara tus resultados con la ejecución.
 */
public class Ej02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        //Mientras la condicion sea verdadera se repetira el bucle,
        //Si se introduce 1 el bucle se ejecutara
        while (x <= n) {
            
            System.out.print(x);
            System.out.print(" - ");
            //Se suma uno a la variable x hasta que llegue a 100, en ese momento
            //la condicion es falsa y sale del bucle
            x = x + 1;
        }

    }

}
