/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clase.a.partir.de.los.tests;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Menu {
    Map<String,Double> menu=new HashMap<>();
    List<Comanda> comanda = new ArrayList<>();
    List<Plat> platosComanda = new ArrayList<>();


    public void afegir_plat(String nombre, Double precio){
        menu.put(nombre,precio);
    }
  
    public void eliminar_plat(String nombre) {
        menu.remove(nombre);
    }
    
    public Map<String, Double> llistar_menu() {
        return menu;
    }

    public void crearComanda() {
        Comanda comandaNueva = new Comanda();
        comanda.add(comandaNueva);
        
    }
    
    public void afegirPlatComanda(int numComanda, String nombrePlato) {
        Comanda comandaActual = comanda.get(numComanda);
        Plat plat = new Plat(nombrePlato, menu.get(nombrePlato)); 
        comandaActual.afegirPlat(plat);
    }
    
    
    public double CalcularTotal(int numComanda) {
        Comanda c = comanda.get(numComanda);
        double total = 0.0;
        for (Plat plat : c.getPlatos()) {
            total += plat.getPrecio();
        }
        return total;
    }
    
    public Comanda MostrarComanda(int numComanda) {
        if (numComanda >= 0 && numComanda < comanda.size()) {
            return comanda.get(numComanda);
        } else {
            return null; 
        }
    }
    
    
    
    
    

    
    
}                                   