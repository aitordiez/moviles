import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
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
    public Tienda(String txt)
    {
        // initialise instance variables
        listaMoviles = new ArrayList<Movil>();
        imei=0;
        datos(txt);
    }

    public void datos(String nombre)
    {
        try {
            File archivo = new File(nombre + ".txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayString= sc.nextLine().split("#");
                addMoviles(arrayString[0],arrayString[1],Integer.parseInt(arrayString[2]));

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Añadir una lista de objetos de moviles
     */
    public void addMoviles(String marca, String modelo, int pixel)
    {
        // put your code here
        listaMoviles.add(new Movil(marca, modelo, pixel, imei));
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

    /**
     * Mostrar los moviles ordenados por su capacidad
     */    
    public void ordenarPorCapacidad(){ 
        ArrayList<Movil> copiaListaMovil = new ArrayList<Movil>();
        copiaListaMovil.addAll(listaMoviles);
        ArrayList<Movil> listaMovilOrdenados = new ArrayList<Movil>();
        Movil movilMenorCapacidad = null;
        while(!copiaListaMovil.isEmpty()) {
            movilMenorCapacidad = copiaListaMovil.get(0);
            for(int i=1; i< copiaListaMovil.size(); i++){
                if(copiaListaMovil.get(i).getCapacidad() < movilMenorCapacidad.getCapacidad()) {
                    movilMenorCapacidad = copiaListaMovil.get(i);
                }
            }    
            listaMovilOrdenados.add(movilMenorCapacidad);
            copiaListaMovil.remove(movilMenorCapacidad);
            movilMenorCapacidad = null;
        }
        int posicionTareaActual = 0;
        while(posicionTareaActual < listaMovilOrdenados.size()){
            System.out.println((posicionTareaActual) + "." + listaMovilOrdenados.get(posicionTareaActual).devolverCaracteristicas() + imei++);
            posicionTareaActual++;
        }
    }
    
    /**
     * Modificar al menos una de las características del objeto con el numero identificativo indicado por el usuario.
     */
    public void modificarCaracteristicas(int pixel, int imei){
        if(imei>=0 && imei<listaMoviles.size()) {
            Movil moviles = listaMoviles.get(imei);
            moviles.setPixel(pixel);
        }

    }

    /**
     * Eliminar los objetos cuyo atributo cumpla una determinada condicion usando obligatoriamente un iterador
     */
    public void eliminarObjetos(String modelo){
        Iterator<Movil> it = listaMoviles.iterator();
        while(it.hasNext())
        {
            Movil i = it.next();
            if(i.getModelo().contains(modelo)){
                it.remove();
            }
        }
    }
}

