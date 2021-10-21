/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurarepeticion;

/**
 *
 * @author albertogarzon
 */
/*
4.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. 
Implementa el programa en el entorno y compara tus resultados con la ejecución.
 */
public class Ej04 {

    public static void main(String[] args) {

        int numero = 1;

        //Mientras el numero sea menor que 11 se repetira el bucle hasta que la condicion
        //sea falsa
        while (numero < 11) {
            System.out.println("Número: " + numero);

            //Se suma 1 a la variable numero
            numero++;
        }

        System.out.println("La variable numero vale: " + numero);

        //Se resta uno a la variable numero hasta que la condicion
        //sea falsa
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);

        System.out.println("La variable numero vale: " + numero);
    }

}
