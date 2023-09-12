
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) { //CREACIÒN DEL TP CON psvm+TAB
        //DECLARACIÒN DE VARIABLES
        int entero;
        float flotante;
        double datoDouble;
        char caract;
        boolean booleano;
        String cadena;
        //INICIALIZACIÓN
        entero=4;
        flotante=6.2f;
        datoDouble=1.23242; //observar diferencias con el tipo flotante
        cadena="hola mundo"; //comillas DOBLES
        caract='h'; //comillas SIMPLES
        booleano=true;
        
        
        //muestra por pantalla de los datos
        
        System.out.println(entero + " "+ flotante+" "+datoDouble+" "+cadena+" "+caract + " "+ booleano);  //el " " es para que se genere un espacio
        
        
        //DECLARACIÓN DEL ARRAYLIST DE FLOTANTES
        
        
        ArrayList<Float>nuevoarray=new ArrayList<Float>();
        //agrego elementos al arraylist
        nuevoarray.add(7.5f);
        nuevoarray.add(3.5f);
        
        float sumador=0; //sumador de los elementos del arraylist
        
        for(int i=0;i<nuevoarray.size();i++)
        {
            float elemento=nuevoarray.get(i); //toma el elemento i del arraylist y lo copia en la variable "elemento"
            System.out.println("Elemento "+i+" del arraylist--->"+elemento);
            sumador=sumador+elemento;
        }
        
        float promedio; //en esta variable guardaremos el promedio de los elementos del arraylist
        
        promedio=sumador/nuevoarray.size();
        
        System.out.println("El promedio es: "+promedio);
        
        
        
        
        //HACER LO QUE SIGUE EN EL TP
    }
    
}
