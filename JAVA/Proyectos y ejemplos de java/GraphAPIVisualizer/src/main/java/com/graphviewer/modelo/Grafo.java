package com.graphviewer.modelo;


import java.util.ArrayList;
import java.util.List;


/**
 * Clase encargada de crear los grafos 
 * @author Armando
 */
public class Grafo {
    int id;   
    public List<Nodo> nodos;
    public List<Aristas> aristas;
    Grafo next;
        
                   
    public Grafo(){
        
        
    }
    
    /**
     * Contructor para crear un grafo
     * @param id_grafo numero a asignar al grafo creado para su identificación
     */
   
    public Grafo(int id_grafo){
        
        this.id = id_grafo;
        this.next = null;
        this.nodos = new ArrayList();
        this.aristas = new ArrayList();
    }
    
    //Metodos get y set para las variables que almacena el grafo
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Nodo getNodo(int index) {
        return nodos.get(index);
    }

    public List<Aristas> getAristas() {
        return aristas;
    }
    public Aristas getArista(int index) {
        return aristas.get(index);
    }

    public void setAristas(List<Aristas> aristas) {
        this.aristas = aristas;
    }
    
    public List getNodos() {
        return nodos;
    }

    
    public void setNodo(Nodo nodo,int index) {
        this.nodos.set(index, nodo);
    }

    public Grafo getNext() {
        return next;
    }

    public void setNext(Grafo next) {
        this.next = next;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grafo other = (Grafo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
  
    

    
     
}

