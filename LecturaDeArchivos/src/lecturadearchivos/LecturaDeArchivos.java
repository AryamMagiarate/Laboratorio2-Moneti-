/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturadearchivos;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Mayra M.F
 */
public class LecturaDeArchivos {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException { // USO LAS EXCEPCIONES DE JAVA, PARA QUE SE MANEJEN ENTRE METODOS.
        
       File arch1=new File("misCompras.txt"); // debo guardar el archivo txt en la carpeta del proyecto o bien en cualquier otro lugar, colocando con doble \\ la direccion del mismo.
       Scanner lector=new Scanner(arch1); // usamos un objeto tipo Scanner para volcar el contenido del  objeto tipo File donde depositamos el contenido del txt
     
       // Metodo para contar las letras del texto y ademas imprimir
    int contadorPalabras=0;  
 while(lector.hasNextLine()){ // mientras el objeto de tipo Scanner "lector" tenga una proxima linea (cadena de caracteres).
 String lineaDeTexto=lector.nextLine();
 contadorPalabras=lineaDeTexto.split(" ").length +contadorPalabras;// aqui se cuenta la cantidad de espacios cortados, por eso tenemos que tener cuidado de ver si el texto en el archivo comienza o no con espacio, igual que los puntos y aparte.
     System.out.println(lineaDeTexto); // 
 
 }
        System.out.println("La Cantidad de palabras que tiene el texto es: "+contadorPalabras);     
    
    }// fin Metodo Main
    
}// fin Clase LecturaDeArchivos
