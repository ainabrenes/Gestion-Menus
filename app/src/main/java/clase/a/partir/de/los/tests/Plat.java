package clase.a.partir.de.los.tests;
public class Plat {
    private String nombre;
    private double precio;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
     
    public Plat(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
