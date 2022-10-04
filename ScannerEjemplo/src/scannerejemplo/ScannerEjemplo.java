/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerejemplo;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class ScannerEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variable e inicializcion con su respectivo tipo de dato
        //VARIABLES A CONSULTAR
        String nombre="";
        char genero='M';
        int edad=0;
        String telefono = "";
        float nota1=0.0f;//para doubles 0.0d
        float nota2=0.0f;
        float nota3=0.0f;
        
        boolean decision= false;
        
        //se crea o instacioamos un objeto de la clase Scanner  llamado teclado
        Scanner teclado = new Scanner(System.in);
        
        // ENTRADA DE TECLADO DE LAS VARIABLES A LAS CUALES DE PEDIRAN
        System.out.print("SU NOMBRE: ");  nombre= teclado.next();
        System.out.print("SU GENERO (M)/(F): "); genero= teclado.next().charAt(0);
        
        System.out.print("SU EDAD: "); edad= teclado.nextInt();
        System.out.print("SU TELEFONO: "); telefono=teclado.next();
        System.out.print("INGRESE NOTA 1 [con coma]: "); nota1=teclado.nextFloat();
        System.out.print("INGRESE NOTA 2 [con coma]: "); nota2=teclado.nextFloat();
        System.out.print("INGRESE NOTA 3 [con coma]: "); nota3=teclado.nextFloat();
        //variable promedio se crea despues de la peticion por teclado para que tome los valores de las notas
       float promedio= (nota1+nota2+nota3)/3;
       
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n   PROMEDIO ESTUDIANTE");
        System.out.println("NOMBRE  GENERO  EDAD    TELEFONO    NOTA_1  NOTA_2  NOTA_3  PROMEDIO");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(nombre+"\t"+genero+"\t"+edad+"\t"+telefono+" "+nota1+"\t"+nota2+"\t"+nota3+"\t"+promedio);
    }
    
}
