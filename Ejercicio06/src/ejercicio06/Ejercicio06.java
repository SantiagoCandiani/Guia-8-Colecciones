/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio06;

import ejercicio06.servicios.Servicios;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Servicios serv = new Servicios();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String exit="";

        do {

            System.out.println("MENU");
            System.out.println("1- Ingresar Producto");
            System.out.println("2- Mostrar Producto");
            System.out.println("3- Cambiar precio");
            System.out.println("4- Eliminar Producto");
            System.out.println("5- Exit");

            switch (leer.next()) {
                case "1":
                    serv.crearProducto();
                    break;
                case "2":
                    serv.mostrarLista();
                    break;
                case "3":
                    serv.modificarPrecio();
                    break;
                case "4":
                    serv.eliminarProducto();
                    break;
                case "5":
                    System.out.println("Esta seguro que desea salir (Y/N)?");
                    exit = leer.next();
            }

        } while (!exit.equalsIgnoreCase("y"));

    }//main
}//class
