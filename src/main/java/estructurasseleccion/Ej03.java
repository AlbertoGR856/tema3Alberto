/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasseleccion;

/**
 *
 * @author GR6
 */
/*
3.- ¿Qué devuelven estas expresiones?

a)    boolean unaCondicion = true;
      resultado = unaCondicion ? valor1 : valor2;

b)    int x = 10;
      int y = (x > 9) ? 100 : 200;

c)    int publico = 19500;
      int vendidas = 19000;
      int aforo = 2000;
      String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
 */
public class Ej03 {

    public static void main(String[] args) {

        //a
        //Devolveria valor1 ya que la variable booleana unaCondicion es true, el operador ternario toma la primera opcion
        //si esta es verdadera
        int valor1 = 5;
        int valor2 = 3;
        boolean unaCondicion = true;
        int resultado = unaCondicion ? valor1 : valor2;

        System.out.println(resultado);

        //b
        //El operador ternario tomara la primera opcion 100 ya que la condicion 10 > 9 es true
        int x = 10;
        int y = (x > 9) ? 100 : 200;

        System.out.println(y);

        //c
        /*
        En este caso hay dos operados ternarios primera se evalua la condicion (publico < aforo), la cual es falsa por lo tanto se
        pasa a la segunda condicion (vendidas < aforo), como tambien es false se mostrara el segundo mensaje "Esta todo vendido"
        */
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        
        System.out.println(status);
    }

}
