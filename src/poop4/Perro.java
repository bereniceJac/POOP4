/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos que hacen a un perro
 */
public class Perro {
    String nombre, raza, color;
    int edad;
    
    /**
     * Constructor vacío de perro
     */
    public Perro() {
    }
    
    /**
     * Constructor lleno de perro
     * @param nombre nombre del perro en String
     * @param raza raza del perro en String
     * @param color color del perro en String
     * @param edad edad del perro en int
     */
    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    /**
     * Método que indica que el perro se sienta
     */
    public void sentado(){
        System.out.println("Estoy sentado:)");
    }
    
    /**
     * Método que indica que el perro ladra
     * @param veces veces que el perro ladra
     */
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Woof");
        }
    }
    
    /**
     * Método que indica cuánta distancia corre el perro
     * @param distancia distancia que corre el perro
     */
    public void corre(int distancia){
        System.out.println("Corrí "+distancia+ " metros");
    }
    
    /**
     * Método que indica las cantidad de horas que duerme el perro
     * @param horas horas que duerme el perro
     */
    public void duerme(int horas){
        System.out.println("Dormí "+horas+ " horas");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del perro
     * @return returna una concatenación de los valores de los atributos del perro
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre= " + nombre + ", raza= " + raza + 
                ", color= " + color + ", edad= " + edad + '}';
    }
}
