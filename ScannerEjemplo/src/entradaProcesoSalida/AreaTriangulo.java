/*
ANALISIS
ENTRADA: (QUE ME DAN- QUE NECESITO)
PROCESOS:(FORMULAS O PASOS PARA HACER LA SALIDA)
SALIDA: (QUE ME PIDEN- QUE MUESTRO) ** PARA EL ANALISIS CASI SIEMPRE ES COMENZAR POR ESTE PUNTO

 */
package entradaProcesoSalida;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se busca el area de un triangulo el cual la formula es B*A/2
        //inicializar instaciar el teclado
        Scanner teclado= new Scanner(System.in);
        
        //instacioamos las variables
        int base=0;
        int altura=0;
        
        //peticion al usuario
        System.out.println("***AREA DEL TRIANGULO***");
        System.out.print("BASE: "); base=teclado.nextInt();
        System.out.print("ALTURA: "); altura=teclado.nextInt();
        //variable de operacion 
        float area=(base*altura)/2;
        System.out.println("formula del area= (BASE X ALTURA)/2 ");
        System.out.println("---------------------------");
        System.out.println("BASE    ALTURA  AREA");
        System.out.println(base+"\t"+altura+"\t"+area);
        
        
        
    }
    
}
