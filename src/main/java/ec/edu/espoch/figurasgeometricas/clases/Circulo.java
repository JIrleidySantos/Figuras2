package ec.edu.espoch.figurasgeometricas.clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mundo
 */
public class Circulo {

    double pi = 3.1416;

    public double radio;
    public double area;
    public double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("El radio del Circulo es: " + radio);
    }

    public double calcularArea() {
        return (radio * radio) * pi;
    }

    public double calcularPerimetro() {
        return 2 * radio * pi;
    }

}
