/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author GR6
 */
public class EjerciciosDiapositiva {

    public static void main(String[] args) {

        //A. Saber si un número es positivo, negativo, o cero
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce un numero: ");

        numero = teclado.nextInt();

        if (numero >= 1) {

            System.out.println("El número es positivo");

        } else if (numero < 0) {

            System.out.println("El número es negativo");
        } else if (numero == 0) {

            System.out.println("El numero es cero");
        } else {
            System.out.println("No es un numero valido");
        }

        /*
        B. Saber si un carácter es un dígito, una letra mayúscula o una letra minúscula
	UNICODE:
		dígito: 48 – 57
		letra mayúscula: 65 – 90
		letra minúscula: 97 – 122
         */
        String caracter;

        System.out.println("Introduce un caracter: ");

        caracter = teclado.next();

        /*      
        Se almacena el String cracter en una variable char, para ello se usa el metodo charAt(numero) de la clase caracter 
       (Ya que String es un objeto o cadena de texto)
        
        El metodo charAt(numero) nos permite extraer una letra de la cadena de texto en este caso es la posicion 0 
       (Por ejemplo, hola se extraeria la letra h, si fuera 1 la o etc)
        
        Finalmente se almacena en un char por que en si un char o caracter equivale a un valor numerico de la tabla unicode
        por lo tanto la letra equivaldra a un numero en particular de dicha tabla
         */
        char caracter2 = caracter.charAt(0);

        //Se puede parar de un char a int sin problemas pues como se comento antes equivale a un numero sin decimales
        //En este caso la conversión implicita no es necesaria. Ya que la variable char es apta para su uso con numeros
        int unicodeChar = (int) caracter2;

        if (caracter2 >= 48 && caracter2 <= 57) {

            System.out.println("El número es un digito");

        } else if (caracter2 >= 65 && caracter2 <= 90) {

            System.out.println("El número es una letra mayúscula");
        } else if (caracter2 >= 97 && caracter2 <= 122) {

            System.out.println("El numero es una letra minúscula");
        } else {

            System.out.println("No es un caracter valido");
        }

        //C. Leer un número entero entre 1 y 10 y mostrar el número escrito en numeros romanos. Usa Switch
        int numeroRomano;

        System.out.println("Introduzca un numero entre el 1 y el 10: ");

        numeroRomano = teclado.nextInt();

        switch (numeroRomano) {

            case 1:
                System.out.println("El numero 1 en numeros romanos es I");
                break;

            case 2:
                System.out.println("El numero 2 en numeros romanos es II");
                break;

            case 3:
                System.out.println("El numero 3 en numeros romanos es III");
                break;

            case 4:
                System.out.println("El numero 4 en numeros romanos es IV");
                break;

            case 5:
                System.out.println("El numero 5 en numeros romanos es V");
                break;

            case 6:
                System.out.println("El numero 6 en numeros romanos es VI");
                break;

            case 7:
                System.out.println("El numero 7 en numeros romanos es VII");
                break;

            case 8:
                System.out.println("El numero 8 en numeros romanos es VIII");
                break;

            case 9:
                System.out.println("El numero 9 en numeros romanos es IX");
                break;

            case 10:
                System.out.println("El numero 10 en numeros romanos es X");
                break;

            default:
                System.out.println("No es un numero valido");
                break;

        }

    }

}
