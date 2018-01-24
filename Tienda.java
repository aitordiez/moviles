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
    private ArrayList<Moviles> listaMoviles;
    int imei = 0;
    /**
     * Constructor for objects of class Tienda
     */
    public Tienda()
    {
        // initialise instance variables
        listaMoviles = new ArrayList<Moviles>();
        imei=1;
    }

    /**
     * Añadir una lista de objetos de moviles
     */
    public void addMoviles(String marca, String modelo, int capacidad)
    {
        // put your code here
        Moviles nuevoMoviles = new Moviles(marca, modelo, capacidad, imei);
        listaMoviles.add(nuevoMoviles);
        imei++;
    }
}
