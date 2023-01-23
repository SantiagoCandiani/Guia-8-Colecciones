package ejercicio05.entidad;

public class Pais {

    private String name;

    public Pais() {
    }

    public Pais(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntidadPais{" + "name=" + name + '}';
    }

}//Class
