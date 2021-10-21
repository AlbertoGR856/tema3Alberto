/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasseleccion;

/**
 *
 * @author albertogarzon
 */
/*
9.- ¿Cuánto vale variable2 al finalizar la ejecución del switch?
 */
public class Ej09 {

    public static void main(String[] args) {

        //La variable int variable que vale 3 entra en el switch y se dirige al case 3, pero
        //el case 3 carece de break al final por lo que se ejecuta en cascada pasado al case 4 que 
        //tampoco tiene break por lo que se toma el valor del default 100 
        int variable = 3, variable2;

        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;
        }

        System.out.println("La variable2 vale: " + variable2);

    }

}
