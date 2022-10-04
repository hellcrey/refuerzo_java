/*
Leer las tres notas de los parciales y mostrar su definitiva aplicando los respectivos 
porcentajes: Primer y Segundo Parcial 25%, Final del 20% y los Talleres 30% (tres talleres).
NOTA: declarar los porcentajes como constantes:

ENTRADA:VARIABLES 3 PARCIALES / 3 TALLERES/ CONSTANTES %PARCIALES Y %TALLERER
PROCESOS: PEDIR POR TECLADO LAS NOTAS 
PARCIAL25%->(P1+P2/2)*0.25/ PFINAL20%->P3*0.20/ T30%->(T1+T2TT3/3)*0.30/ NOTAF=P25+PF+T
SALIDA: MMOSTRAR LAS NOTAS Y EL PROMEDIO DE LA CLASE 

 */
package entradaProcesoSalida;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class NotaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // teclado
        Scanner teclado= new Scanner(System.in);
        //limitar decimales
        DecimalFormat formato1= new DecimalFormat("#.00");
       
       //entrada
       //constante
       double P1Y2=0.25;
       double P3=0.20;
       double T=0.30;
       //variables
       double p1=4.5d;
       double p2=2.5d;
       double p3=3.8d;
       double t1=4.5d;
       double t2=3.5d;
       double t3=2.8d;
       
       //proceso
       /*
        System.out.println("INGRESE LAS NOTAS DE LOS PARCIALES");
        System.out.print("PARCIAL 1: "); p1=teclado.nextDouble();
        System.out.print("PARCIAL 2: "); p2=teclado.nextDouble();
        System.out.print("PARCIAL 3: "); p3=teclado.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("INGRESE LAS NOTAS DE LOS TALLERES");
        System.out.print("TALLER 1: "); t1=teclado.nextDouble();
        System.out.print("TALLER 2: "); t2=teclado.nextDouble();
        System.out.print("TALLER 3: "); t3=teclado.nextDouble();
        */
        //OPERACION
        double notaf=(p1*P1Y2)+(p2*P1Y2)+(p3*P3)+(((t1+t2+t3)/3)*T);
        
        //SALIDA
        System.out.println("-----------------------------------------------------------");
        System.out.println("P1 \t P2 \t P3 \t T1 \t T2 \t T3 \t NOTA");
        System.out.println(p1+"\t "+p2+"\t "+p3+"\t "+t1+"\t "+t2+"\t "+t3+"\t "+formato1.format(notaf));
        System.out.println("-----------------------------------------------------------");
        
    }
    
}
