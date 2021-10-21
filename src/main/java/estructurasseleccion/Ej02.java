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
2.- Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:

a)Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”. 
Las cadenas que se devuelven se guardarán en una variable llamada resultado.

b)Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.

c)Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())
 */
public class Ej02 {

    public static void main(String[] args) {

        //a
        Scanner teclado = new Scanner(System.in);

        int x;

        String resultado;

        System.out.println("Introduzca el numero x: ");

        x = teclado.nextInt();

        resultado = (x > 135) ? "Mayor" : "Menor";

        System.out.println("El resultado es: " + resultado);

        //b
        String resultado2 = (x <= 0) ? "Menor que cero" : "Mayor que cero";

        System.out.println("El resultado es: " + resultado2);

        //c
        /*
        Se usa el operador ternario pero almacenandolo en un variable entera, para ello se hace uso de la variable x
        como variable logica. Si el numero es positivo se imprimira dicho numero y si es negativo el numero negativo 
        se volvera positivo (su valor absoluto) ya que (- x -) = +.
        */
        int resultado3 = (x > 0) ? x : -x;

        System.out.println("El resultado es: " + resultado3);

    }
}
