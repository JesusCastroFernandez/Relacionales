/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorelacionales;

import java.util.Scanner; //importamos el paquete necesario para poder usar la clase Scanner

/**
 *
 * @author JESUS
 */
public class EjemploRelacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado = new Scanner( System.in );
      int x, y;
      String cadena;
      boolean resultado;

      System.out.print( "Introducir primer número: " );
      x = teclado.nextInt(); // pedimos el primer número al usuario
      System.out.print( "Introducir segundo número: " );
      y = teclado.nextInt(); // pedimos el segundo número al usuario

      // realizamos las comparaciones y las mostramos por pantalla
      cadena=(x==y)?"iguales":"distintos";
      System.out.printf("Los números %d y %d son %s\n",x,y,cadena); 
      resultado=(x!=y);
      System.out.println("x != y  // es " + resultado);
      resultado=(x < y );
      System.out.println("x < y  // es " + resultado);
      resultado=(x > y );
      System.out.println("x > y  // es " + resultado);
      resultado=(x <= y );
      System.out.println("x <= y  // es " + resultado);
      resultado=(x >= y );
      System.out.println("x >= y  // es " + resultado);
    }
    
}
