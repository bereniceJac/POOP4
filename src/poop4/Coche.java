/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos que hacen a un carro
 */
public class Coche {
    String marca, modelo, color, motor, combustible;
    
    /**
     * Constructor vacío de coche
     */
    public Coche() {
    }
    
    /**
     * Constructor lleno de coche
     * @param marca la marca del coche en String
     * @param modelo el modelo del coche en String
     * @param color el color del coche en String
     * @param motor el motor del coche en String
     * @param combustible el combustible del coche en String
     */
    public Coche(String marca, String modelo, String color,
            String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    
    /**
     * Método que hace que el coche avance
     */
    public void avanzar(){
        System.out.println("El coche avanza");
    }
    
    /**
     * Método que hace que el coche retroceda
     */
    public void retroceder(){
        System.out.println("El coche retrocede");
    }
    
    /**
     * Método que hace que el coche esté encendido
     */
    public void prender(){
        System.out.println("Coche encendido");
    }
    
    /**
     * Método que hace que el coche se apague
     */
    public void apagar(){
        System.out.println("Coche apagado");
    }
    
    /**
     * Metodo que hace que el coche gire en un lado específico
     * @param lado lado hacia el que gira el coche
     */
    public void girar(String lado){
        System.out.println("El coche gira a la "+lado);
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del coche
     * @return returna una concatenación de los valores de los atributos del coche
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=vc" + marca + ", modelo=c " + modelo + 
                ", color= " + color +", motor= " + motor + ", combustible= " 
                + combustible + '}';
    }
}
