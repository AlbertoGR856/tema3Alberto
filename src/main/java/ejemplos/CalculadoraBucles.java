/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author albertogarzon
 */
public class CalculadoraBucles {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int respuesta = 0;

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

        do{
            
        
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("Cualquier numero. Finalizar");

        
        do{
            
       
        System.out.println("Elija una opción: ");
        opcion = entrada.nextInt();

        }while(opcion < 1 || opcion > 4);
        
        switch (opcion) {
            
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Introduzca el lado del cuadrado: ");
                lado = entrada.nextInt();
                areaCuadrado = (int) Math.pow(lado, 2);
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;
                
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduzca la base del triangulo: ");
                base = entrada.nextInt();
                System.out.println("Introduzca la altura del triangulo: ");
                altura = entrada.nextInt();
                areaTriangulo = (base * altura) / 2;
                System.out.println("El area del triangulo es: " + areaTriangulo);
                break;
                
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Introduzca el radio del circulo: ");
                radio = entrada.nextInt();
                areaCirculo = (int) Math.sqrt((NUMERO_PI * Math.pow(radio, 2)));
                System.out.println("El area del circulo es: " + String.format("%.2f", areaCirculo));
                break;
                
            default:
                System.out.println("Ha seleccionado terminar");
                break;
        }
        
        
        System.out.println("¿Quiere volver a realizar una interacción?");
        System.out.println("1 - Si");
        System.out.println("2 - No");
        
        respuesta = entrada.nextInt();
        
        }while(respuesta != 2);
         
         System.out.println("FINALIZANDO PROGRAMA....");
        
    }

}