/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Gabriel Mijangos
 * Clase que construye coches
 */
public class Coche {
    private String color;
    private String marca;
    private String placa;
    
    /**
     * Constructor vacio
     */
    public Coche() {
    }
    
    /**
     * 
     * @param color el color del coche
     * @param marca la marca del coche
     * @param placa placa vehicular
     */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }
    
    /**
     * Metodo que devuelve el color
     * @return color del coche
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo que establece el color
     * @param color color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Metodo que devuelve la marca
     * @return marca del coche
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo que establece la marca
     * @param marca marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Metodo que devuelve la placa vehicular
     * @return placa del coche
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Metodo que establece la placa
     * @param placa placa vehicular
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * Metodo que imprime frenar
     */
    public void frenar(){
        System.out.println("Frenar");
    };
    
    /**
     * Metodo que carga cosa
     * @param cosa lo que va a cargar el coche
     * @return la coas que cargo el coche
     */
    public String carga(String cosa){
        System.out.println("Estoy cargando"+cosa);
        return cosa;
    }

    /**
     * Metodo que parsea un objeto a una cadena
     * @return los atributos del objeto en cadena
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
    
    
}