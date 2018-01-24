import java.util.ArrayList;
/**
 * Write a description of class Tienda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tienda
{
    // instance variables - replace the example below with your own
    private ArrayList<Movil> listaMoviles;
    int imei = 0;
    /**
     * Constructor for objects of class Tienda
     */
    public Tienda()
    {
        // initialise instance variables
        listaMoviles = new ArrayList<Movil>();
        imei=1;
    }

    /**
     * Añadir una lista de objetos de moviles
     */
    public void addMoviles(String marca, String modelo, int capacidad)
    {
        // put your code here
        Movil nuevoMoviles = new Movil(marca, modelo, capacidad, imei);
        listaMoviles.add(nuevoMoviles);
        imei++;
    }
    
    public void mostrarMoviles()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaMoviles.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaMoviles.get(posicionTareaActual).devolverCaracteristicas() + imei++);
            posicionTareaActual++;
            
        }
    }
    

}
