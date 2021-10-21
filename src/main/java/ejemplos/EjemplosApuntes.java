/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author GR6
 */
public class EjemplosApuntes {

    public static void main(String[] args) {

        //Estructura de seleccion if
        int calificacion = 10;

        if (calificacion == 10) {
            System.out.println("Matrícula de Honor");

            //Estructur de seleccion if-else para determinar si un numero es par o impar
            int numero = 3;

            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

            //Estructura if-else apilada
            int notaExamen = 7;

            if (notaExamen == 10) {
                System.out.println("Matrícula de Honor");
            } else { // else1

                if (notaExamen == 9) {
                    System.out.println("Sobresaliente");
                } else { // else2

                    if (notaExamen >= 7) {
                        System.out.println("Notable");
                    } else { // else3

                        if (notaExamen == 6) {
                            System.out.println("Bien");
                        } else { // else4

                            if (notaExamen == 5) {
                                System.out.println("Aprobado");
                            } else { // else5

                                System.out.println("Suspenso");

                            } // else5

                        } // else4

                    } // else3

                } // else 2

            } // else1

        }

        //Estructura if-else if. Es una estructura anidada
        int notaExamen = 7;

        if (notaExamen == 10) {
            System.out.println("Matrícula de Honor");
        } else if (notaExamen == 9) {
            System.out.println("Sobresaliente");
        } else if (notaExamen >= 7) {
            System.out.println("Notable");
        } else if (notaExamen == 6) {
            System.out.println("Bien");
        } else if (notaExamen == 5) {

            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        //Operador ternario, se cumple la condicion detras de ? (true) 0 la condicion detras : (false)
        int edad = 16;
        String txt;
        txt = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.print(txt);

        //Ejemplo de estructura Switch
        int cotizacion = 150; // Un valor cualquiera
        char categoriaProfesional;

        if (cotizacion < 80) {
            categoriaProfesional = 'C';
        } else {
            if (cotizacion < 120) {
                categoriaProfesional = 'B';
            } else {
                categoriaProfesional = 'A';
            }
        }

        System.out.print("Cotización " + cotizacion + " euros, ");
        System.out.print("Categoría " + categoriaProfesional + " de ");

        //Se utiliza la variable de tipo char en los case
        switch (categoriaProfesional) {
            case 'A':
                System.out.print("Socio ");
                break;
            case 'B':
                System.out.print("Senior ");
                break;
            case 'C':
                System.out.print("Junior ");
                break;
            default:
                System.out.print("¡Indefinida! ");
                break;
        }

        //Otro ejempplo pero con tipo int, los primeros cases se dejan vacios por lo tanto saltaria hasta el case 4 suspenso en caso de que el valor fuera
        //inferior a 4
        int nota = 9;

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");

                break;

            case 5:
                System.out.println("Aprobado");

                break;

            case 6:
                System.out.println("Bien");

                break;

            case 7:

            case 8:
                System.out.println("Notable");

                break;

            case 9:
                System.out.println("Sobresaliente");

                break;

            case 10:
                System.out.println("Matrícula");
                break;

            default:
                System.out.println("No presentado");
                break;
        }

    }

}
