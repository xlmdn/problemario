/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_biseccion;

/**
 *
 * @author Axel Madin
 */
public class Metodo_Biseccion {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        double a = 0.0; 
        double b = 4.0; 
        double error = 0.0001; 

        double raiz = metodoBiseccion(a, b, error);

        System.out.println("La raíz aproximada es: " + raiz);
    }

    
    private static double metodoBiseccion(double a, double b, double error) {
        double c = 0.0;

        while ((b - a) >= error) {
            c = (a + b) / 2.0;

            if (funcion(c) == 0.0) {
                break;
            }

            if (funcion(c) * funcion(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        return c;
    }

    // Funcion x^2-10
    private static double funcion(double x) {
        return x * x - 10;
    }
    
}
