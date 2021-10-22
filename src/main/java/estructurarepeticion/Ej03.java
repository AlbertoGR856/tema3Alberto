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

        final int FACTOR_MULTIPLICATIVO = 2;

        final int NUMERO = 15;

        //Se utiliza una variable auxiliar para alamacenar la constante ya que una 
        //constante no puede ser modificada, lo que daria error
        int aux = NUMERO;

        for (int i = 0; i < SERIE_TERMINO; i++) {

            System.out.print(aux);
            System.out.print(" - ");

            aux = aux * FACTOR_MULTIPLICATIVO;
        }

    }

}
