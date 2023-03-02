/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Alex
 */
public class Lista {
    Nodo Primero;
    
    public void InsertarNodo(String datos){
        Nodo nodoNuevo = new Nodo(datos);
        if(Primero==null){
            Primero=nodoNuevo;
        }
        else{
            nodoNuevo.siguiente = Primero;
            Primero = nodoNuevo;
        }
    }
    
    public void ListarNodos(){
        Nodo Auxiliar;
        Auxiliar = Primero;
        while(Auxiliar!=null){
            System.out.println(Auxiliar.getDatos());
            Auxiliar = Auxiliar.siguiente;
        }
    }
}
