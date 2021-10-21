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
1.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. 
Implementa el programa en el entorno y compara tus resultados con la ejecución.
 */
public class Ej01 {

    public static void main(String[] args) {

        int x = 1;

        //Mientras la condicion sea verdadera se repetira el bucle
        while (x <= 100) {
            
            System.out.print(x);
            //Imprime un guion detras de cada variable x
            System.out.print(" - ");

            //Se suma uno a la variable x hasta que llegue a 100, en ese momento
            //la condicion es falsa y sale del bucle
            x = x + 1;
        }

    }

}
