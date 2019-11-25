/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graphviewer.modelo;


/**
 * Clase encargada de crear las aristas del grafo 
 * @author Harold
 */
public class Aristas {
    public int start;
    public int end;
    public int peso;
    public int id;
    
    public Aristas(){
    
    }
    
    public Aristas( int id){
        this.start = 0;
        this.end = 0;
        this.peso = peso;
        this.id = id;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int Start) {
        this.start = Start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int End) {
        this.end = End;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int Peso) {
        this.peso = Peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }
    
    

}
