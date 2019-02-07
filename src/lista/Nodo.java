/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 * @author FMR
 */
class Nodo {
    protected Nodo siguiente;
    protected Object contenido;
    
    
    Nodo(Object cont){              //Crea un nuevo nodo
        this.siguiente=null;
        this.contenido= cont;
        
    }
    Nodo(Object cont, Nodo sig){    // Crea un nuevo nodo y lo pone apuntando al siguiente
        this.siguiente=sig;
        this.contenido= cont;
    }
    
    void setContenido(Object cont){
        this.contenido=cont;
    }
    
    Object getContenido(){
        return this.contenido;
    } 
    
}
