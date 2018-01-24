
/**
 * Write a description of class Moviles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movil
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private int capacidad;
    private int imei;
    /**
     * Constructor for objects of class Moviles
     */
    public Movil(String marca, String modelo, int capacidad, int imei)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        imei = imei; 
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
    
    /**
     * Imprimir por pantalla las características
     */
    public void imprimirCaracteristicas(){
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("La capacidad es: " + capacidad);
        System.out.println("El imei es : " + imei);
    }
    
    /**
     * Devolver las caracteristicas de los moviles
     */
    public String devolverCaracteristicas(){
        String devuelto= "";
        devuelto = "La marca es: " + marca + "El modelo es: " + modelo + "La capacidad es: " + capacidad + "El imei es: " + imei;
        return devuelto;
    }
}    
