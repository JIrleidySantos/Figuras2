/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;

public class Triangulo {

    public double basetri;
    public double alturatri;

    public Triangulo() {
    }

    public Triangulo(double basetri, double alturatri) {

        this.basetri = basetri;
        this.alturatri = alturatri;
    }

    public void imprimir() {
        System.out.println("base del triangulo es : " + basetri);
        System.out.println("altura del triangulo es : " + alturatri);
    }

    public double calculArea() {
        return (basetri * alturatri) / 2;
    }

    public double calcularHipotenusa() {

        return (double) Math.sqrt((basetri * basetri) + (alturatri * alturatri));
    }

    public double calcularPerimetro() {

        double hipotenusa1 = calcularHipotenusa();
        return basetri + alturatri + hipotenusa1;
    }

    public String TipoTriangulo() {
        double hipotenusa1 = calcularHipotenusa();

        if (basetri == alturatri && alturatri == hipotenusa1 && basetri == hipotenusa1) {
            return "Equilatero";
        } else if (basetri == alturatri || basetri == hipotenusa1 || alturatri == hipotenusa1) {
            return "Isosceles";
        } else {

            return "Escaleno";
        }
    }
}
