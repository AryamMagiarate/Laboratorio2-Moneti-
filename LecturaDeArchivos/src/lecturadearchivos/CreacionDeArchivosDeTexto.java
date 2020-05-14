/*
 *Ejercicio 14

Codifique en Java un programa que genere un fichero de texto que contenga números enteros entre 1 y 1000.  
Almacene solamente 100 números siguiendo la forma de organización directa.

 */
package lecturadearchivos;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author Mayra M.F
 */
public class CreacionDeArchivosDeTexto {
    
    public String generarNumero(){
    String contenedor=" ";
    String[]numeros=new String[100];
        for (int i = 0; i < numeros.length; i++) {
    int numeroEntero=(int)((Math.random()*1000)+1);
    numeros[i]=Integer.toString(numeroEntero);
     contenedor=numeros[i]+"\n "+contenedor;      
            }
    
    return contenedor;
    }
    
    public static void main(String[]args) throws FileNotFoundException{
        CreacionDeArchivosDeTexto contenedor=new CreacionDeArchivosDeTexto();
        
        
    try{// creo un archivo vacio de tipo texto en la misma carpeta del proyecto, asì no se pierde.
        String ruta="C:\\Users\\Mayra M.F\\Desktop\\Carpeta Programacion\\ProyectosNeatbeansCursos\\LecturaDeArchivos\\ParaLlenar.txt";
        String contenido= contenedor.generarNumero();
        
        File archivo=new File(ruta);
// si el archivo no existe es creado.
        if(!archivo.exists()){
        archivo.createNewFile();
        
        }//fin if
        FileWriter escritorDeArchivo=new FileWriter(archivo);
        BufferedWriter escritorAmortiguado=new BufferedWriter(escritorDeArchivo); // es un objeto que hace que el escritor se amortigue a la latencia entre escritura. O sea a los tiempos "vacios" o de espera entre escritura y escritura.
        escritorAmortiguado.write(contenido); // aqui agrego el contenido al escritor, o sea le agrego lo que quiero que escriba.
        escritorAmortiguado.close();   
    
    }// fin try
    catch(Exception e){
    e.printStackTrace();
    }// fin catch
    
   //Ahora voy a comprobar que me genero el archivo y que lo ha escrito leyendo el archivo
   
    File arch1=new File("C:\\Users\\Mayra M.F\\Desktop\\Carpeta Programacion\\ProyectosNeatbeansCursos\\LecturaDeArchivos\\ParaLlenar.txt"); // debo guardar el archivo txt en la carpeta del proyecto o bien en cualquier otro lugar, colocando con doble \\ la direccion del mismo.
       Scanner lector = new Scanner(arch1);
       String contenidoDelArchivo=lector.toString();
        while(lector.hasNextLine()){ // mientras el objeto de tipo Scanner "lector" tenga una proxima linea (cadena de caracteres).
 String lineaDeTexto=lector.nextLine();
 
     System.out.println(lineaDeTexto); // 
 
 }

    }

}