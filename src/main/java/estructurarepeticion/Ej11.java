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
11.- Implementa un programa Java que permita visualizar todas las letras mayúsculas, 
desde la 'A' hasta la 'Z', usando un do – while.
 */
public class Ej11 {

    public static void main(String[] args) {

        char primeraLetraAbecedario = 'A';
        char ultimaLetraAbecedario = 'Z';


        do {

            System.out.print(primeraLetraAbecedario);
            System.out.print(" - ");
            primeraLetraAbecedario++;

        } while (primeraLetraAbecedario <= ultimaLetraAbecedario);

    }

}
