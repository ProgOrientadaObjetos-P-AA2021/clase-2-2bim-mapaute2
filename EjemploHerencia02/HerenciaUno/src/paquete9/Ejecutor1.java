/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

public class Ejecutor1 {

    public static void main(String[] args) { //método main
        //objeto array de tipo EstudianteDistancia llamado listaDistancia sin parametros
        ArrayList<EstudianteDistancia> listaDistancia = new ArrayList<>();
        
        //Creando 3 objetos de tipo EstudianteDistancia
        //e1, e2, e3 enviando 6 parametros a la clase EstudianteDistancia
        EstudianteDistancia e1 = new EstudianteDistancia("Mario", "Mills", "212233",
                23, 1, 100.2);
        EstudianteDistancia e2 = new EstudianteDistancia("Joseph", "White", "212234",
                24, 5, 100.2); 
        EstudianteDistancia e3 = new EstudianteDistancia("Catherine", "Reyes", "212235",
                25, 8, 100.2);
        //estableciendo valores 
        listaDistancia.add(e1);
        listaDistancia.add(e2);
        listaDistancia.add(e3);
        //ciclo repetitivo para calcular el valor total de la matricula de distancia
        for (int i = 0; i < listaDistancia.size(); i++) {
            listaDistancia.get(i).calcularMatriculaDistancia();
        }
        // creando un objeto rd de tipo ReporteDistancia enviando 3 parametros
        ReporteDistancia rd = new ReporteDistancia("Reporte Distancia", 
                "Derecho", "Sexto");
        //estableciendo valores
        rd.establecerLista(listaDistancia);
        rd.establecerTotalMatriculasDistancia();
        
        //System.out.println(listaDistancia);//si se desea saber Estudiante distancia
        System.out.println("----------------------");
        System.out.println(rd);//imprimir el objeto metodo to String
        
        
    }
}
