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
3.- Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. 
No se introducen valores por teclado.
 */
public class Ej03 {

    public static void main(String[] args) {

        final int SERIE_TERMINO = 25;
        int numero = 15;

        for (int i = 0; i < SERIE_TERMINO; i++) {

            System.out.print(numero);
            System.out.print(" - ");

            numero = numero * 2;
        }

    }

}
