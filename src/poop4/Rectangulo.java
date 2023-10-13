/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que contiene los métodos que hacen a un rectángulo
 */
public class Rectangulo {
    int base, altura;
    
    /**
     * Constructor vacío de rectángulo
     */
    public Rectangulo() {
    }
    
    /**
     * Constructor lleno de rectángulo
     * @param base base del rectángulo en int
     * @param altura altura del rectángulo en int
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método que calcula el área del rectángulo
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public void calcularArea(int base, int altura){
        float area=base*altura;
        System.out.println("El área del rectángulo de base: "+base+
                " [cm], altura: "+altura+" [cm] es = "+area+" [cm^2]");
    }
    
    /**
     * Método que calcula el perímetro del rectángulo
     * @param base base del rectángulo
     * @param altura altura del rectángulo 
     */
    public void calcularPerimetro(int base, int altura){
        float perimetro=2*(base+altura);
        System.out.println("El perímetro es: "+perimetro);
    }
    
    /**
     * Método que calcula la diagonal del rectángulo
     * @param base base del rectángulo
     * @param altura altura del rectángulo 
     */
    public void calcularDiagonal(int base, int altura){
        float diagonal=(float) Math.sqrt((base*base)+(altura*altura));
        System.out.println("La diagnonal del rectángulo es: "+diagonal);
    }
    
    /**
     * Método que determina si el rectángulo es un polígono regular
     * @param ladoA un lado del rectángulo
     * @param ladoB un lado del rectángulo
     * @param ladoC un lado del rectángulo
     * @param ladoD un lado del rectángulo
     */
    public void determinarTipoRectangulo( int ladoA, int ladoB,
            int ladoC, int ladoD){
        if ((ladoA==ladoC) & (ladoB==ladoC)){
            System.out.println("El rectángulo es un polígono regular");
        }
        else
            System.out.println("El recttángulo es irregular");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del rectángulo
     * @return returna una concatenación de los valores de los atributos del rectángulo
     */
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + 
                ", altura=" + altura + '}';
    }
    
    
}
