/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;


public class Rectangulo {
    
    public double baserec;
    public double alturarec;
    public double arearec;
    public double perimetrorec;

    public Rectangulo() {
    }

    
    public Rectangulo(double baserec, double alturarec) {
        this.baserec = baserec;
        this.alturarec = alturarec;
    }
    
    
    public void imprimir() {
    
        System.out.println("base: " + baserec);
        System.out.println("altura: " + alturarec);
        
    }
    public double calculararea (){
        return (baserec * alturarec);
    }
    public double calcularperimetro () {
    
        return 2 * (baserec + alturarec);
    }
}
