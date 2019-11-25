/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graphviewer.modelo;


/**
 * Clase encargada de crear un nodo del grafo
 * @author Harold
 */
public class Nodo {
    public int NodoID;
    public Object Entity;
    public int inDegree;
    public int outDegree;
    
    public Nodo(){
   
    
    }
    
    public Nodo(int Nodeid){
   
        this.NodoID = Nodeid;
        this.inDegree = 0;
        this.outDegree = 0;
        this.Entity = null;
    
    }
    
    public int getID(){//obtiene nombre del doc
        return this.NodoID;
    }

    public int getInDegree() {
        return inDegree;
    }

    public void setInDegree(int inDegree) {
        this.inDegree = inDegree;
    }

    public int getOutDegree() {
        return outDegree;
    }

    public void setOutDegree(int outDegree) {
        this.outDegree = outDegree;
    }

    public void setEntity(Object Entity) {
        this.Entity = Entity;
    }

}
