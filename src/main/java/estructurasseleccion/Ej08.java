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
8.- ¿Qué realiza el siguiente programa Java?
 */
public class Ej08 {

    public static void main(String[] args) {

        /*
        La variable char departamento es igual al caracter B, por lo que al entrar al switch departamento
        se dirigira al case 'B' y mostrara por teclado el texto Recursos Humanos. 
        Finalmente se imprime por consola el system.out del final
         */
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);

    }

}
