/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PrimeraClase {
    String unaCadena;  //definicion de los atributos solicidatos
    int unEntero; 
    
    //definicion de metodos
    
    public void mostrar()
    {
        System.out.println("Atributos: "+unaCadena+" y "+ unEntero);
        
    }
    
    public static void main(String[] args)  //main()
    {
        //Punto 8-creación de los objetos solicitados
        
        //creo objetos
        
        PrimeraClase unObjeto1=new PrimeraClase();
        PrimeraClase unObjeto2=new PrimeraClase();
        PrimeraClase unObjeto3=new PrimeraClase();
        
        //doy valor a los atribbutos de los objetos
        
        unObjeto1.unaCadena="Casa";
        unObjeto1.unEntero=3;
        
        unObjeto2.unaCadena="Ventilador";
        unObjeto2.unEntero=4;
        
        unObjeto3.unaCadena="Puerta";
        unObjeto3.unEntero=5;
        
        unObjeto1.mostrar(); //usar el metodo mostrar()
        unObjeto2.mostrar();
        unObjeto3.mostrar();
        
        //Definicion del arraylist del punto 9
        
        ArrayList<PrimeraClase>arrayDeObjetos=new ArrayList<>();
        
        arrayDeObjetos.add(unObjeto1);
        arrayDeObjetos.add(unObjeto2);
        arrayDeObjetos.add(unObjeto3);
        
        System.out.println("\nMuestra de los objetos del ArrayList\n");
        
        //muestra con for mejorado
        
        for(PrimeraClase objeto:arrayDeObjetos)
        {
            objeto.mostrar(); //muestro los elementos
        }
        
        
        
        
        
    }
}
