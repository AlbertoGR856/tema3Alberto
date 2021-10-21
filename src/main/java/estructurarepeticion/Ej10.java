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
10.- Implementa un programa Java que permita visualizar todas las letras minúsculas, 
desde la 'a' hasta la 'z', usando un for.
 */
public class Ej10 {

    public static void main(String[] args) {

        char primeraLetraAbecedario = 'a';

        for (char z = 'z'; primeraLetraAbecedario <= z; primeraLetraAbecedario++) {

            System.out.print(primeraLetraAbecedario);
            System.out.print(" - ");

        }

        System.out.println(primeraLetraAbecedario);
    }

}
