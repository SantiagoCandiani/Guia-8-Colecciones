/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main
 *
 * @author Usuario
 */
public class ServicioAlumnos {
//    Coleccion c1 = new Coleccion();
//
//        ArrayList<String> libros = new ArrayList();
//
//        libros.add("La Odisea");
//
//        c1.setLibros(libros); // Se guarda la lista  

    private Scanner leer;

    private ArrayList<Alumnos> listaAlumno;
//    private ArrayList<Integer> notas;

    public ServicioAlumnos() {
        leer = new Scanner(System.in).useDelimiter("\n");
        listaAlumno = new ArrayList();
    }

    public void crearAlumno() {

        String respuesta ;
        do {

            Alumnos alumno = new Alumnos();

            System.out.println("ingrese el nombre del alumno");
            String nombre = leer.next();
            alumno.setAlumnos(nombre);

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("ingrese la nota del primer examen");
            Integer nota1 = leer.nextInt();

            System.out.println("ingrese la nota del segundo examen");
            Integer nota2 = leer.nextInt();

            System.out.println("ingrese la nota del tercer examen");
            Integer nota3 = leer.nextInt();
            notas.add(nota1 + nota2 + nota3);
            alumno.setNotas(notas);

            listaAlumno.add(alumno);

            System.out.println("desea crear otro alumno,s/n?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }
//esto nos complico la vida ,no la llamamos ,
    public Boolean verificarAlumno(String buscar) {

        if (listaAlumno.stream().anyMatch((aux) -> (aux.getAlumnos().equalsIgnoreCase(buscar)))) {
            return true;
        }
        return false;

    }

    public Integer notaFinal() {

        Integer notaFinal;
        System.out.println("ingrese el alumno a buscar");
        String buscar = leer.next();
         
        for (Alumnos aux : listaAlumno) {
            
        
        if (aux.getAlumnos().equalsIgnoreCase(buscar)) {
            Integer sumatoria = 0;
            
            
            
            for (Integer suma : aux.getNotas()) {
                sumatoria += suma;

            }
            notaFinal = sumatoria / 3;
            return notaFinal;
        }
        
        }
        System.out.println("no se encuentra en la lista");
        return 0;
    }

}
