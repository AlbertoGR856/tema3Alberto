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
12.- Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) 
de cada una de las letras.
 */
public class Ej12 {

    public static void main(String[] args) {

        char primeraLetraAbecedario = 'a';
        int codigoNumerico = 0;

        for (char z = 'z'; primeraLetraAbecedario <= z; primeraLetraAbecedario++) {

            codigoNumerico = primeraLetraAbecedario;
            System.out.print(codigoNumerico);
            System.out.print(" - ");

        }

        System.out.println(codigoNumerico);
    }
}


