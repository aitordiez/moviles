
/**
 * Write a description of class Moviles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moviles
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private int capacidad;
    /**
     * Constructor for objects of class Moviles
     */
    public Moviles(String marca, String modelo, int capacidad)
    {
        marca = "";
        modelo = "";
        capacidad = 0;
    }

    /**
     * Fijar la marca
     */
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    /**
     * Fijar el modelo
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    /**
     * Fijar la capacidad
     */
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    
    /**
     * Devolver la marca
     */
    public String getMarca(){
        return marca;
    }
    
    /**
     * Devolver el modelo
     */
    public String getModelo(){
        return modelo;
    }
    
    /**
     * Devolver la capacidad
     */
    public int getCapacidad(){
        return capacidad;
    }
}
