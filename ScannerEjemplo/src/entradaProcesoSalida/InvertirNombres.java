/*
Ingresar por teclado y por separado en dos variables, sus nombres y apellidos respectivamente,
mostrar en orden contrario a la entrada apellidos y nombres,

ENTRADA: VARIABLES NOMBRE Y APELLIDO
PROCESO: pedir al usuario su nombre y apellido por teclado y mostrarlo en pantalla
SALIDA: JHON JAIRO OROZCO DAVILA => OROZCO DAVILA JHON JAIRO

 */
package entradaProcesoSalida;

import java.util.Scanner;
/**
 *
 * @author juand
 */
public class InvertirNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //creo el teclado
        Scanner teclado = new Scanner(System.in);
        
       //variables
       String nombre="";
       String apellido="";
       
      //proceso
        System.out.print("SU NOMBRE: ");  nombre= teclado.nextLine();
        System.out.print("SU APELLIDO: "); apellido=teclado.next();
        
        //salida
        System.out.println(apellido+" "+nombre);
    }
    
}
