package com.mycompany.figurasg;

public class FigurasG {

    public static void main(String[] args) {
        IFigura[] figuras={
            new Circulo(5),
            new Rectangulo(4,6),
            new Triangulo(3,4,3,4,5)
            
        };
        
        for(IFigura figura:figuras){
            System.out.println("Area: "+figura.calcularArea());
            System.out.println("Perimetro: "+figura.calcularPerimetro());
            System.out.println("------------------");
                    
        }
    }
}
