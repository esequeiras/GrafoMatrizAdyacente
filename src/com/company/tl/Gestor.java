package com.company.tl;

import com.company.bl.GrafoMA;

public class Gestor {
    private GrafoMA grafo;

    public Gestor() {
        this.grafo = new GrafoMA(8);
    }
    public String agregarVertice(int num){
        try{
            return grafo.insertVertex(num);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void agregarArco(int v1,int v2,int p){
        try{
            grafo.insertEdge(v1,v2,p);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
    public String mostrarGrafo(){
        try {
            return grafo.showGraph();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        return null;
    }
    public String mostrarVertices(){
        try {
           return grafo.showVertex();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        return null;
    }


}
