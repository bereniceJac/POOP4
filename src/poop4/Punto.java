/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos que hacen a un punto
 */
public class Punto {
    int x,y;
    
    /**
     * Constructor vacío de punto
     */
    public Punto() {
    }
    
    /**
     * Constructor lleno de punto
     * @param x coordenada x en int
     * @param y coordenada y en int
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
                                                    //sobrecarga, dos métodos llamados iguales, pero con diferentes parámetros
                                                    //sobrescritura 
    /**
     * Imprime las coordenadas del punto
     */
    public void imprimirPunto(){
        System.out.println("x= "+x+" , y="+y);
    } //método deprecado
    
    /**
     * Método toString sobrescrito que muestra el valor del punto
     * @return returna una concatenación de el valor del punto
     */
    @Override                                                       //anotación para programar, es la sobrescritura
    public String toString() {                                                          //parseo
        return "Punto{" + "x=" + x + ", y=" + y + '}'; //nombre de la clase, primer atributo, segundo atributo
    }
}
