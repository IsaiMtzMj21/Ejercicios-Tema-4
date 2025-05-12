/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ej2TryCatchFinalli;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author zdieg
 */
public class holaMundo {

    public static void main(String[] args) {
        /*
        try {
            leerArchivo();
        }
        catch( FileNotFoundException e){
            System.out.println("Archivo no encontrado"+e);
        }
        catch( IOException e ){
            System.out.println("no se puede acceder a ese archivo"+e);
        }
        catch( Exception e ){
            System.out.println(e);
        }
        finally{
            System.out.println("Yo me ejecuto si o si");
        }
         */

        try{
        Integer num =null;
        System.out.println(num.toString());
        }
        catch(NullPointerException e ){
            System.out.println("Debes de inicualizar tu objeto");
        }
    }

    public static void leerArchivo() throws FileNotFoundException, IOException {

        ///EXCEPCIONES VERIFICADAS
        
        BufferedReader bf = new BufferedReader(new FileReader("C:/Users/zdieg/OneDrive/Documentos/archivo/arc.txt"));
        String linea;
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }
}
