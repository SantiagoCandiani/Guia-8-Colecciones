package Service;

import entidad.EntidadPais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

public class ServicePais {

    
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    private HashSet<EntidadPais> ConjuntoPais; // Creo la lista

    //Esta es una muy buena practica
    public ServicePais() {
        this.ConjuntoPais = new HashSet(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos
    }

    public void CrearPais(){
        String Exit;
        
        do{
            EntidadPais p1 = new EntidadPais();
            
            System.out.println("Ingrese el nombre del pais: ");
            p1.setName(leer.next());
            ConjuntoPais.add(p1);
            
            System.out.println("Si quiere salir ingrese S");
            System.out.println("En caso contrario cualquier letra para continuar");
            Exit = leer.next();
            
        }while(!Exit.equalsIgnoreCase("S"));
                   
        
    }
    
    public void MostrarPais(){
        
        for (EntidadPais aux : ConjuntoPais) {
            System.out.println(aux.toString());
        }
        
    }
    
    public void BorrarPais(){
        
        System.out.println("Ingrese un pais a eliminar");
        String borrar = leer.next();
        Boolean auxx=false;
        
        
        Iterator<EntidadPais> it = ConjuntoPais.iterator();
        
        while(it.hasNext()){
            if (it.next().getName().equals(borrar)) {
                it.remove();
                System.out.println("El Pais fue eliminado");
                auxx = true;
            } 
       
        }
        
        if (auxx==true) {
            System.out.println("No se encontro el pais a eliminar");
        }
        
    }
    
}
