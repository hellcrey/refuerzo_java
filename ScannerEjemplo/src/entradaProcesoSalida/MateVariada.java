/*
Leer dos números y hallar: la sumatoria, su diferencia, 
su producto, su cociente y su residuo. Mostrar con un encabezado:
N1 N2 SUMA DIFERENCIA PRODUCTO COCIENTE RESIDUO

ENTRADA: variables numero1 y numero2
PROCESO: pedir numero/ hacer las diferentes operaciones
SALIDA: tabla de operaciones y numeros
 */
package entradaProcesoSalida;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class MateVariada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //teclado 
        Scanner teclado= new Scanner(System.in);
        
        //variables
        int n1=0;
        int n2=0;
        
        //proceso
        System.out.print("PRIMER NUMERO: "); n1=teclado.nextInt();
        System.out.print("SEGUNDO NUMERO: ");     n2=teclado.nextInt();
        
        //salida
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("N1\t N2\t SUMA\t DIFERENCIA\t PRODUCTO\t COCIENTE\t RESIDUO");
        System.out.println(n1+"\t "+n2+"\t "+(n1+n2)+"\t    "+(n1-n2)+"\t\t   "+(n1*n2)+"\t \t    "+(n1/n2)+"\t\t    "+(n1%n2));
        System.out.println("---------------------------------------------------------------------------------------------------");
    }
    
}
