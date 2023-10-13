/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author  Jacinto Robledo Valeria Berenice
 * Clase principal que muestra el uso de las clases, punto, coche, perro,triángulo y rectángulo 
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Se crean dos objetos de la clase punto, y se llama al método que imprime los valores del punto
         */
        Punto punto = new Punto();                                                          //tipo de variable, nombre de la variable y new constuctor
        punto.imprimirPunto();                                                              //si no tengo ningun cosntructor, se crea uno en automático
        Punto punto2 = new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto);                                                                  //paquete.clase@(en)la direccion de memoria //se creo una instancia en 63961c42
        
        /**
         * Se crea un objeto de la clase perro y se imprime el objeto
         */
        //para el perro
        Perro perro= new Perro("Chiquitin","Mestizo", "negro", 1);
        System.out.println(perro);
        
        /**
         * Se crea un objeto de la clase coche, se imprime la representación del objeto coche, y se imprime el objeto coche
         */
        //para el coche
        Coche coche= new Coche("Mazda","2019",
                "blanco","automático", "disel");
        coche.girar("derecha");
        System.out.println(coche.toString());                                                   //con el toString lo va a convertir a cadena y sale exactamente iguual, hace el pareso de un objeto a una cadena
        System.out.println(coche);
    
        /**
         * Se crea un objeto de la clase triángulo
         * se calcula el área, perímetro, tipo de triángulo y el ángulo faltante
         * Imprime la representación en cadena del triángulo
         */
        Triangulo triangulo = new Triangulo(5,3,5,5,6);
        triangulo.calcularArea(5,3);
        triangulo.calcularPerimetro(5, 5, 6);
        triangulo.obtenerTipoTriangulo(5, 5, 5, 6);
        triangulo.calcularAnguloFaltante(45, 45);
        System.out.println(triangulo.toString());
        
        /**
         * Se crea un objeto de la clase rectángulo
         * Se calcula el área, perímetro, diagonal, determina si es un polígono regular
         * Imprime el objeto rectángulo
         */
        Rectangulo rectangulo = new Rectangulo(10,7);
        rectangulo.calcularArea(10, 7);
        rectangulo.calcularPerimetro(10, 7);
        rectangulo.calcularDiagonal(10, 7);
        rectangulo.determinarTipoRectangulo(10, 7, 10, 7);
        System.out.println(rectangulo);
    }
}
