/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;
import ec.edu.espoch.figurasgeometricas.clases.Cuadrado;




/**
 *
 * @author mundo
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        
        Circulo objCirculo = new Circulo(10.6);

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

        
    }
}
