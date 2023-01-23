/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumnos {
  
    private String alumnos;
    
    private ArrayList<Integer> notas;

    public Alumnos() {
        
    }

    public Alumnos(String alumnos, ArrayList<Integer> notas) {
        this.alumnos = alumnos;
        this.notas = notas;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "alumnos=" + alumnos + ", notas=" + notas + '}';
    }

    
    
    
    
    
    
}
