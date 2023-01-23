package ejercicio05.servicios;

import ejercicio05.entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Servicios {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private HashSet<Pais> ConjuntoPais; // Creo la lista

    //Esta es una muy buena practica
    public Servicios() {
        this.ConjuntoPais = new HashSet(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos
    }

    public void CrearPais() {
        String Exit;

        do {
            Pais p1 = new Pais();

            System.out.println("Ingrese el nombre del pais: ");
            p1.setName(leer.next());
            ConjuntoPais.add(p1);

            System.out.println("Si quiere salir ingrese S");
            System.out.println("En caso contrario cualquier letra para continuar");
            Exit = leer.next();

        } while (!Exit.equalsIgnoreCase("S"));
    }//CrearPais

    public void MostrarPais() {

        for (Pais aux : ConjuntoPais) {
            System.out.println(aux.toString());
        }
    }//MostrarPais

    public void BorrarPais() {

        System.out.println("Ingrese un pais a eliminar");
        String borrar = leer.next();
        Boolean auxx = false;

        Iterator<Pais> it = ConjuntoPais.iterator();

        while (it.hasNext()) {
            if (it.next().getName().equals(borrar)) {
                it.remove();
                System.out.println("El Pais fue eliminado");
                auxx = true;
            }
        }

        if (auxx == true) {
            System.out.println("No se encontro el pais a eliminar");
        }
    }//BorrarPais

}//Class
