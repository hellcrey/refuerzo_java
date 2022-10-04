/*
Hallar la edad de una persona, leer su año de nacimiento; tener en cuenta solo el año.

ENTRADA: variables año actual / año de nacimiento de la persona
PROCESO:pedir   el año de nacimiento -> hacer el proceso año actual-año de nacimiento
SALIDA:
edad de la persona
 */
package entradaProcesoSalida;
 import java.util.Scanner;
/**
 *
 * @author juand
 */
public class EdadPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //telacdo 
        Scanner teclado= new Scanner(System.in);
        
        //variables 
        int anio=2022;// no es necesario con solo la variable born se puede resolver esto
        int born=0;
        
        //proceso
        System.out.print("COLOQUE SU AÑO DE NACIMIENTO: "); born=teclado.nextInt();
        //salida
        System.out.println("su edad es "+(anio-born));
        
        
    }
    
}
