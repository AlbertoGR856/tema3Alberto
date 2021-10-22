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
13.- Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) 
de cada una de las letras.
 */
public class Ej13 {

    public static void main(String[] args) {

        char primeraLetraAbecedario = 'A';
        char ultimaLetraAbecedario = 'Z';
        int codigoNumerico;

        do {
            codigoNumerico = primeraLetraAbecedario;

            System.out.print(codigoNumerico);
            System.out.print(" - ");
            ++primeraLetraAbecedario;

        } while (primeraLetraAbecedario <= ultimaLetraAbecedario);

    }

}
