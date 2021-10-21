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
9.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. 
Implementa el programa en el entorno y compara tus resultados con la ejecución.
 */
public class Ej09 {

    public static void main(String[] args) {

        int i = 0;
        int j = 6;
        
        //Mientas que i que vale 0 < 0, por lo tanto la condicion es falsa, por lo que sale
        //del bucle de forma instantanea sin ejecutar nada dentro del bucle
        
        //while puede o no entrar en el bucle, do-while se ejecutara al menos una vez
        //y el bucle for se utiliza cuando sepamos la cantidad de veces que se debe ejecutar
        //el bucle
        while (i < 0) {
            i++;
            j++;
        }
        System.out.println(i);
        System.out.println(j);

    }

}
