 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD

        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = datos[i][j];
                System.out.println(resultado[i][j]);
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.println(resultado[i][j]);
            }
        }

=======
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = factorial(datos[i][j]);
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 
     * @param numero es el numero que se va a calcular el factorial
     * @return el factorial del numero
     */
    public static double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
>>>>>>> 079681fb281129d922ab25ea1cbd8e4a6e7fbd00
    }

    public static double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    
  
    }
}
         
        
