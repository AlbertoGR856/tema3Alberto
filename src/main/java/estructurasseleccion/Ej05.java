/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasseleccion;

import java.util.Scanner;

/**
 *
 * @author GR6
 */
/*
5.- Implementa y completa el siguiente programa. Ten en cuenta que cuando se entre en cada una de las opciones (1,2 o 3) 
el programa realice su función. Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de calcular el área de un cuadrado 
y debe solicitar los dos lados y mostrar el resultado. Así con el resto de opciones.
 */
public class Ej05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        //Variables para calcular el area del cuadrado
        int lado;
        int areaCuadrado;

        //Variables para calcular el area del triangulo
        int base;
        int altura;
        int areaTriangulo;

        //Variables para calcular el area del circulo
        final double NUMERO_PI = 3.14;
        int radio;
        double areaCirculo;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");

            System.out.println("Introduzca el lado del cuadrado: ");

            lado = entrada.nextInt();

            areaCuadrado = (int) Math.pow(lado, 2);

            System.out.println("El area del cuadrado es: " + areaCuadrado);

        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");

                System.out.println("Introduzca la base del triangulo: ");

                base = entrada.nextInt();

                System.out.println("Introduzca la altura del triangulo: ");

                altura = entrada.nextInt();

                areaTriangulo = (base * altura) / 2;

                System.out.println("El area del triangulo es: " + areaTriangulo);

            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");

                    System.out.println("Introduzca el radio del circulo: ");

                    radio = entrada.nextInt();

                    areaCirculo = (int) Math.sqrt((NUMERO_PI * Math.pow(radio, 2)));

                    System.out.println("El area del circulo es: " + String.format("%.2f", areaCirculo));

                } else {
                    System.out.println("Ha seleccionado terminar");
                }

            }

        }

    }

}
