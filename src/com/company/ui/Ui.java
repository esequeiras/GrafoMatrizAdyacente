package com.company.ui;

import com.company.tl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ui {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor gestor=new Gestor();
    public static void main(String[] args) throws IOException {
      int v1=0;
      int v2=0;
	  int op=0;
            do {
                mostrarMenu();
                op=Integer.parseInt(in.readLine());

                switch (op){
                    case 1:
                        out.println("Ingrese un numero");
                        out.println(gestor.agregarVertice(Integer.parseInt(in.readLine())));
                        break;
                    case 2:
                        out.println(gestor.mostrarVertices());
                        out.println("Ingrese la posicion del primer vertice");
                        v1= Integer.parseInt(in.readLine());
                        out.println("Ingrese la posicion del segundo vertice");
                        v2= Integer.parseInt(in.readLine());
                        gestor.agregarArco(v1,v2,1);

                        break;
                    case 3:
                        out.println(gestor.mostrarGrafo());
                        break;
                    case 4:
                        out.println("Adios");
                        break;
                    default:
                        out.println("Opcion invalida");

                        break;
                }
            }while (op!=4 );
    }
    public static void mostrarMenu(){
        out.println("Opciones");
        out.println("1 Agregar Vertice");
        out.println("2 Agregar Arco");
        out.println("3 Mostrar Grafo");
        out.println("4 Salir");
        out.print("Ingrese una opcion: ");
    }
}
