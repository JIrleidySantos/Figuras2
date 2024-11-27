/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;
import ec.edu.espoch.figurasgeometricas.clases.Cuadrado;
import ec.edu.espoch.figurasgeometricas.clases.Rectangulo;
import ec.edu.espoch.figurasgeometricas.clases.Triangulo;

/**
 *
 * @author mundo
 */
public class FigurasGeometricas {

    public static void main(String[] args) {

        Circulo objCirculo = new Circulo(5.6);

        objCirculo.imprimir();

        double area = objCirculo.calcularArea();
        System.out.println("El Area del circulo es: " + area);

        double perimetro = objCirculo.calcularPerimetro();
        System.out.println("El perimetro del Circulo es " + perimetro);

        Cuadrado objCuadrado = new Cuadrado(30.5);

        objCuadrado.imprimir();

        double areaC = objCuadrado.calcularArea();
        System.out.println("El Area del cuadrado es: " + areaC);

        double perimetroC = objCuadrado.calcularPerimetro();
        System.out.println("El perimetro del Cuadrado es: " + perimetroC);

        Rectangulo objRectangulo = new Rectangulo(4.7, 5.7);

        objRectangulo.imprimir();

        double arearec = objRectangulo.calculararea();
        System.out.println("El Area del rectangulo es: " + arearec);

        double perimetrorec = objRectangulo.calcularperimetro();
        System.out.println("El perimetro del rectangulo es: " + perimetrorec);

        Triangulo objTriangulo = new Triangulo(4.2, 4.1);

        objTriangulo.imprimir();

        double areatri = objRectangulo.calculararea();
        System.out.println("El Area del triangulo es: " + areatri);

        double perimetrotri = objRectangulo.calcularperimetro();
        System.out.println("El perimetro del triangulo es: " + perimetrotri);

        System.out.println("Este es un Triangulo " + objTriangulo.TipoTriangulo());
    }
}
