
package com.mycompany.figurasg;


public class Rectangulo implements IFigura {
    private double ancho;
    private double alto;

    public Rectangulo (double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

