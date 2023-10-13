/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos que hacen a un triángulo
 */
public class Triangulo {
    int base, altura, lado1, lado2, lado3;
    
    /**
     * Constructor vacío de triángulo
     */
    public Triangulo() {
    }
    
    /**
     * Constructor lleno de triánngulo
     * @param base base del triangulo
     * @param altura altura del triangulo
     * @param lado1 un lado del triángulo
     * @param lado2 un lado del triángulo
     * @param lado3 un lado del triángulo
     */
    public Triangulo(int base, int altura, int lado1,
            int lado2, int lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Método que calcula el área del triángulo
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public void calcularArea(int base, int altura){
        float area=(base*altura)/2;
        System.out.println("El área del triángulo de base: "+base+
                " [cm], altura: "+altura+" [cm] es = "+area+" [cm^2]");
    }
    
    /**
     * Método que calcula el perímetro del triángulo
     * @param lado1 un lado del triángulo
     * @param lado2 un lado del triángulo
     * @param lado3 un lado del triángulo
     */
    public void calcularPerimetro(int lado1, int lado2, int lado3){
        float perimetro=lado1+lado2+lado3;
        System.out.println("El perímetro del triángulo es = "+perimetro);
    }
    
    /**
     * Método que determina el tipo de triángulo
     * @param base base del triángulo
     * @param lado1 un lado del triángulo
     * @param lado2 un lado del triángulo
     * @param lado3 un lado del triángulo
     */
    public void obtenerTipoTriangulo(int base, int lado1, 
            int lado2, int lado3){
        if ((base==lado1) & (base==lado2) & (base==lado3)){
            System.out.println("Triangulo: Equilátero");
        }
        else if ((base==lado1) & (base!=lado2) & (base!=lado3)){
            System.out.println("Triangulo: Isósceles");
        }
        else
            System.out.println("Triangulo: Escaleno");
    }
    
    /**
     * Método que calcula un ángulo interior del triángulo
     * @param alfa un ángulo del triángulo
     * @param beta un ángulo del triángulo
     */
    public void calcularAnguloFaltante(int alfa, int beta){
        float gamma=180-alfa-beta;
        System.out.println("El ángulo faltante mide: "+gamma+"°");
    }

    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del triángulo
     * @return returna una concatenación de los valores de los atributos del triángulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + 
                ", altura=" + altura + 
                ", lado1=" + lado1 + ", "
                + "lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
}
