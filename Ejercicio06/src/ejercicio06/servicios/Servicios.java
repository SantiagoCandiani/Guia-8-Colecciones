package ejercicio06.servicios;

import ejercicio06.entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicios {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private HashMap<String, Double> ListaDeProductos; // Creo la lista

    public Servicios() {
        this.ListaDeProductos = new HashMap(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos
    }

    public void crearProducto() {
        String exit;

        do {
            Producto p1 = new Producto();

            System.out.println("* Ingrese el nombre del producto:");
            p1.setNombreProducto(leer.next());

            System.out.println("* Ingrese el precio del producto:");
            p1.setPrecio(leer.nextDouble());

            ListaDeProductos.put(p1.getNombreProducto(), p1.getPrecio());

            System.out.println("Si desea salir al menu principal digite 'S'.");
            System.out.println("Si desea seguir cargando productos digite cualquier otra letra.");
            exit = leer.next();

        } while (!exit.equalsIgnoreCase("S"));
    }//crearProducto

    public void mostrarLista() {
        System.out.println("LISTA DE PRODUCTOS:");

        for (Map.Entry<String, Double> entry : ListaDeProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("#Producto: " + key + "\n#Precio:" + value);
        }
    }//mostrarLista

    public void eliminarProducto() {

        System.out.println("* Que producto desea eliminar?");
        String elimiar = leer.next();

        ListaDeProductos.remove(elimiar);
    }

    public void modificarPrecio() {

        System.out.println("* A que producto desea cambiar el precio?");
        String cambiar = leer.next();

        for (String aux : ListaDeProductos.keySet()) {
            if (aux.equalsIgnoreCase(cambiar)) {
                System.out.println("* Ingrese el precio nuevo:");
                ListaDeProductos.replace(aux, leer.nextDouble());
            }
        }
    }

    public void menu() {
        String exit = "";

        do {

            System.out.println("---------MENU---------");
            System.out.println("1- Ingresar Producto.");
            System.out.println("2- Mostrar Producto.");
            System.out.println("3- Cambiar precio.");
            System.out.println("4- Eliminar Producto.");
            System.out.println("5- Exit.");
            System.out.println("----------------------");

            switch (leer.next()) {
                case "1":
                    crearProducto();
                    break;
                case "2":
                    mostrarLista();
                    break;
                case "3":
                    modificarPrecio();
                    break;
                case "4":
                    eliminarProducto();
                    break;
                case "5":
                    System.out.println("Si quiere salir ingrese 'S'.");
                    System.out.println("En caso contrario cualquier letra para continuar.");
                    exit = leer.next();
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a intentarlo.");
                    System.out.println("");
            }

        } while (!exit.equalsIgnoreCase("S"));
        System.out.println("¡¡USTED SALIO DEL PROGRAMA CON EXITO!!");

    }

}//Class
