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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] datos = {100, 90, 80, 70, 60};
        int[] datos2 = {200, 190, 180, 170, 160};
        int[] suma = new int[5];

        for (int i = 0; i < datos.length; i++) {
            suma[i] = obtenerSuma(datos[i], datos2[i]);
            System.out.printf("%d\n", suma[i]);
        }
    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    
    }
}
