package ejercicio03.servicios;

import ejercicio03.entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

    private Scanner leer;
    private ArrayList<Alumno> listaDeAlumnos;

    public Servicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaDeAlumnos = new ArrayList();
    }

    public void crearAlumno() {

        String exit;

        do {
            Alumno a1 = new Alumno();
            ArrayList<Integer> listaDeNotasAux = new ArrayList();

            System.out.println("- Ingrese el nombre del Alumno: ");
            a1.setNombre(leer.next().toUpperCase());

            for (int i = 0; i < 3; i++) {
                System.out.println("- Ingrese la " + (i + 1) + " ° nota.");
                Integer nota = leer.nextInt();
                listaDeNotasAux.add(nota);
            }

            a1.setListaDeNotas(listaDeNotasAux);
            listaDeAlumnos.add(a1);

            System.out.print("Desea Ingresar otro Alumno? ");
            System.out.print("(Ingrese 'Y' para continuar o presione cualquier ");
            System.out.println("letra para continuar).");
            exit = leer.next();

        } while (exit.equalsIgnoreCase("y"));

    }
//ME DA SIEMRE FALSO.... PORQUE??????

//    public boolean verificarAlumno() {
//
//        System.out.println("- Ingrese el nombre del alumno para calcularle el promedio: ");
//        String nombreBuscado = leer.next();
//        System.out.println(listaDeAlumnos.contains(nombreBuscado.toUpperCase()));
//
//        return listaDeAlumnos.contains(nombreBuscado.toUpperCase());
//    }
    public void notaFinal() {

        System.out.println("- Ingrese el nombre del alumno para calcularle el promedio: ");
        String nombreBuscado = leer.next();

        boolean bandera = false;

        for (Alumno aux : listaDeAlumnos) {

            if (aux.getNombre().equalsIgnoreCase(nombreBuscado)) {
                double sumatoriaNotas = 0;

                for (Integer notaAux : aux.getListaDeNotas()) {
                    sumatoriaNotas += notaAux;
                }
                Double notaFinal = sumatoriaNotas / 3;
                System.out.println("La nota promedio de " + aux.getNombre() + " es: " + notaFinal);
                bandera = true;
            }
        }//for
        
        if (bandera == false) {
            System.out.println("El alumno que busca no se encuentra en la lista.");
        }

    }//notaFinal()

}//Class
