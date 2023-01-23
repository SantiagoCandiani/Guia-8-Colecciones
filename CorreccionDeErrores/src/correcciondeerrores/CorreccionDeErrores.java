package correcciondeerrores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class CorreccionDeErrores {

    public static void main(String[] args) {

// MANOS A LA OBRA – DETECCIÓN DE ERRORES
// Corrige el siguiente código:
//      Array<int> listado = new ArrayList;
//      TreeSet<String> = TreeSet();
//      HashMap<Integer> personas = new HashMap<>;
//SOLUCION:
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombres = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

// --------------------------------
//EJERCICIO COLECCIONES
//LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();
        int x0 = 20;
        numerosA.add(x0);
        int x1 = 10;
        numerosA.add(x1);
        int x2 = 5;
        numerosA.add(x2);
        int x3 = 1;
        numerosA.add(x3);
        int x4 = 100;
        numerosA.add(x4);
        int x5 = 166;
        numerosA.add(x5);

        numerosA.remove(3);

        System.out.println("La LISTA queda:");

        //UNA FORMA DE MOSTRARLO:
        System.out.println(numerosA);

        //UNA FORMA DE RECORRERLO Y MOSTRARLO:
        for (Integer aux : numerosA) {
            System.out.print(aux + " - ");
        }
        System.out.println("");
        System.out.println("");

//CONJUNTOS:
        HashSet<Integer> numerosB = new HashSet();
        int y0 = 20;
        numerosB.add(y0);
        int y1 = 10;
        numerosB.add(y1);
        int y2 = 5;
        numerosB.add(y2);
        int y3 = 1;
        numerosB.add(y3);
        int y4 = 100;
        numerosB.add(y4);
        int y5 = 166;
        numerosB.add(y5);

        numerosB.remove(y5);

        System.out.println("Los CONJUNTOS quedan:");

        //UNA FORMA DE MOSTRARLO:
        System.out.println(numerosB);

        //UNA FORMA DE RECORRERLO Y MOSTRARLO:
        for (Integer aux : numerosB) {
            System.out.print(aux + " - ");

        }
        System.out.println("");
        System.out.println("");

//MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni0 = 29969096;
        String nombreAlumno0 = "Santiago_0";
        alumnos.put(dni0, nombreAlumno0);
        int dni1 = 129969096;
        String nombreAlumno1 = "Santiago_1";
        alumnos.put(dni1, nombreAlumno1);
        int dni2 = 229969096;
        String nombreAlumno2 = "Santiago_2";
        alumnos.put(dni2, nombreAlumno2);
        int dni3 = 329969096;
        String nombreAlumno3 = "Santiago_3";
        alumnos.put(dni3, nombreAlumno3);
        int dni4 = 429969096;
        String nombreAlumno4 = "Santiago_4";
        alumnos.put(dni4, nombreAlumno4);
        int dni5 = 529969096;
        String nombreAlumno5 = "Santiago_5";
        alumnos.put(dni5, nombreAlumno5);

        alumnos.remove(dni0);

        System.out.println("Los MAPAS quedan:");

        //UNA FORMA DE MOSTRARLO:
        System.out.println(alumnos);

        //RECORRER LAS 2 PARTES DEL MAPA:
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Documento: " + entry.getKey()
                    + ", Nombre: " + entry.getValue());
        }
        //RECORRER Y MOSTRAR SOLO LAS LLAVES
        for (Integer dni : alumnos.keySet()) {
            System.out.println("Documento: " + dni);
        }
        //RECORRER Y MOSTRAR SOLO LOS VALORES
        for (String nombre : alumnos.values()) {
            System.out.println("Nombre: " + nombre);
        }
        System.out.println("");

// --------------------------------
// MANOS A LA OBRA – DETECCIÓN DE ERRORES
// Corrige el siguiente código:
//      HashMap<Integer> personas = new HashMap<>;
//      String n1 = “Albus”;
//      String n2 = “Severus”;
//      personas.add(n1);
//      personas.add(n2);
//SOLUCION:
        HashMap<Integer, String> personas1 = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas1.put(5, n1); //llave,valor
        personas1.put(10, n2);

// --------------------------------
//EJEMPLO ITERADOR
        ArrayList<String> lista1 = new ArrayList();
        lista1.add("A");
        lista1.add("B");

        Iterator iterador = lista1.iterator();
        System.out.println("Elementos de la lista1: ");

        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }
        System.out.println();

// --------------------------------
//MANOS A LA OBRA - DETECCIÓN DE ERRORES
// Corrige el siguiente código:
//      ArrayList<String> = new ArrayList()
//      bebidas.put(“café);
//      bebidas.add(“té”);
//      Iterator<String> it =bebidas.iterator();
//      whale (it.next()){
//      if (it.next().equals(“café”)){
//      it.remove();
//      }
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

        }//main    
    }//class
