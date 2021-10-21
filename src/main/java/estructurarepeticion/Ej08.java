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
8.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. 
Implementa el programa en el entorno y compara tus resultados con la ejecución.
 */
public class Ej08 {

    public static void main(String[] args) {

        int j = 1;
        
        //En el bucle for la variable int vale -13, la condicion indica que -13 <= -10
        //por lo que el bucle for se repetira 4 veces hasta que la condicion sea falsa
        //-9 <= -10
        for (int i = -13; i <= -10; i++) {
            //Se va sumando 1 a la varaible j
            j++;
        }
        //El resultado seria 5, ya que se repite cuatro veces
        System.out.println(j);

    }

}
