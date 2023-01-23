package ejercicio03.entidad;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> listaDeNotas;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> listaDeNotas) {
        this.nombre = nombre;
        this.listaDeNotas = listaDeNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaDeNotas=" + listaDeNotas + '}';
    }    

}//Class
