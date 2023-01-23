/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.servicios;

import ejercicio04.entidedas.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicios {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private ArrayList<Pelicula> listaDePeliculas; // Creo la lista

    //Esta es una muy buena practica
    public Servicios() {
        this.listaDePeliculas = new ArrayList(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague las peliculas de forma manual
    public void crearPeliculas() {
        String exit;
        
        do {
            Pelicula p1 = new Pelicula();

            System.out.println("* Ingrese el titulo de la pelicula:");
            p1.setTitulo(leer.next());

            System.out.println("* Ingrese una el director de la pelicula:");
            p1.setDirector(leer.next());

            System.out.println("* Ingrese la duracion de la pelicula (en horas):");
            p1.setDuracion(leer.nextDouble());

            listaDePeliculas.add(p1);

            System.out.print("* Desea Ingresar otra pelicula? ");
            System.out.print("(Ingrese 'Y' para continuar o presione cualquier ");
            System.out.println("letra para continuar).");
            exit = leer.next();

        } while (exit.equalsIgnoreCase("y"));
    }//crearPeliculas

    public void mostrarTodasPeliculas() {
        for (Pelicula aux : listaDePeliculas) {
            System.out.println(aux.toString());
        }
    }//mostrarTodasPeliculas

    public void mostrarPeliculasLargas() {

        for (Pelicula aux : listaDePeliculas) {
            if (aux.getDuracion() >= 1) {
                System.out.println(aux.toString());
            }
        }
    }//mostrarPeliculasLargas

    public void ordenarDuracioMenorMayor() {
        Collections.sort(listaDePeliculas,
                (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDuracion().compareTo(objeto2.getDuracion()));
    }//ordenarDuracioMenorMayor

    public void ordenarDuracionMayorMenor() {
        Collections.sort(listaDePeliculas,
                (Pelicula objeto1, Pelicula objeto2) -> objeto2.getDuracion().compareTo(objeto1.getDuracion()));
    }//ordenarDuracionMayorMenor

    public void ordenarTituloAaZ() {
        Collections.sort(listaDePeliculas,
                (Pelicula objeto1, Pelicula objeto2) -> objeto1.getTitulo().compareTo(objeto2.getTitulo()));
    }//ordenarTituloAaZ

    public void ordenarTituloZaA() {
        Collections.sort(listaDePeliculas,
                (Pelicula objeto1, Pelicula objeto2) -> objeto2.getTitulo().compareTo(objeto1.getTitulo()));
    }//ordenarTituloZaA

}//Class
