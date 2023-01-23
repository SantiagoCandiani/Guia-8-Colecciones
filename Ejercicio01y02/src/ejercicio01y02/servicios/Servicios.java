/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio01y02.servicios;

import ejercicio01y02.entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicios {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private ArrayList<Perro> listaDePerros; // Creo la lista

    //Esta es una muy buena practica
    public Servicios() {
        this.listaDePerros = new ArrayList(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague las razas de forma manual
    public void crearPerros() {
        String exit;
        String input;

        do {
            System.out.println("Ingrese una raza de perro:");
            input = leer.next();
            listaDePerros.add(new Perro(input));

            System.out.print("Desea Ingresar otra raza de perro? ");
            System.out.print("(Ingrese 'Y' para continuar o presione cualquier ");
            System.out.println("letra para continuar).");
            exit = leer.next();
        } while (exit.equalsIgnoreCase("y"));
    }//crearRazas

    public void mostrarPerros() {
        System.out.println("La lista de razas ingresadas son:");
        for (Perro aux : listaDePerros) {
            System.out.println(aux.toString());
        }
    }//mostrarPerros

    public void eliminarPerro() {
        System.out.println("Ingrese la raza que desea eliminar:");
        String nombreRaza = leer.next();

        Iterator<Perro> it = listaDePerros.iterator();
        
        int contador=0;

        while (it.hasNext()) {
            if (it.next().getRaza().equals(nombreRaza)) {
                it.remove();
                contador++;
            }
        }
        
        if(contador==0){
            System.out.println("La raza ingresada no está en la lista.");
        }
    }

}//Class
