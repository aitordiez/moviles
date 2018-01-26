import java.util.ArrayList;
import java.util.Iterator;
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
        imei=0;
    }

    /**
     * Añadir una lista de objetos de moviles
     */
    public void addMoviles(String marca, String modelo, int capacidad, int pixel)
    {
        // put your code here
        Movil nuevoMoviles = new Movil(marca, modelo, capacidad, pixel, imei);
        listaMoviles.add(nuevoMoviles);
        imei++;
    }
    
    public void mostrarMoviles()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaMoviles.size()) {
            System.out.println(listaMoviles.get(posicionTareaActual) + ". " + listaMoviles.get(posicionTareaActual).devolverCaracteristicas() + imei++);
            posicionTareaActual++;
            
        }
    }
    
    /**
     * Mostrar los moviles ordenados por su pixel
     */
    public void ordenarPixel()
    {
        ArrayList<Movil> copiaListaMovil = new ArrayList<Movil>();
        copiaListaMovil.addAll(listaMoviles);
        ArrayList<Movil> listaMovilOrdenados = new ArrayList<Movil>();
        Movil movilMenorPixel = null;
        while(!copiaListaMovil.isEmpty()) {
            movilMenorPixel = copiaListaMovil.get(0);
            for(int i=1; i< copiaListaMovil.size(); i++){
                if(copiaListaMovil.get(i).getPixel() < movilMenorPixel.getPixel()) {
                    movilMenorPixel = copiaListaMovil.get(i);
                }
            }    
            listaMovilOrdenados.add(movilMenorPixel);
            copiaListaMovil.remove(movilMenorPixel);
            movilMenorPixel = null;
        }
        int posicionTareaActual = 0;
        while(posicionTareaActual < listaMovilOrdenados.size()){
                System.out.println((posicionTareaActual) + "." + listaMovilOrdenados.get(posicionTareaActual).devolverCaracteristicas() + imei++);
                posicionTareaActual++;
        }
    }

}

