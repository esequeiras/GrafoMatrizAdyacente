package com.company.bl;

import java.util.ArrayList;
import java.util.Arrays;

public class GrafoMA {
   //Almacenar colección de vértices
    private ArrayList<Integer> vertexList;
    //Almacene la matriz de adyacencia correspondiente al gráfico * /
    private int[][] edges;
    //Número total de lados * /
    private int numOfEdges;
    //Si se ha visitado un nodo * /
    private boolean[] isVisited;

    /**
     * Constructor, inicializar
     */
    public GrafoMA(int vertexSize) {
        edges = new int[vertexSize][vertexSize];
        vertexList = new ArrayList<>(vertexSize);
        isVisited = new boolean[vertexSize];
    }
    /**
     * Agregar vértices / nodos
     */
    public void insertVertex(int vertex){
        vertexList.add(vertex);
    }
    /**
     * Agregar bordes
     * @param v1 El subíndice del primer vértice
     * @param v2 El subíndice del segundo vértice
     */
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }
    /**
     * Mostrar la matriz correspondiente del gráfico
     */
    public String showGraph(){
        String mensaje="";
        mensaje=mensaje+"\n"+vertexList.toString()+"\n";
        for (int[] link : edges){
            mensaje=mensaje+"\n"+Arrays.toString(link);
        }
        return mensaje;
    }
    public String showVertex(){
        int i=0;
        String mensaje="";
        for (int num : vertexList){
            mensaje=mensaje+"\n"+i+"- Vertice: "+num;
            i++;
        }
        return mensaje;
    }

    public int getVertexListSize() {
        return vertexList.size();
    }

}
