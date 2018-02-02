package com.company;

public class Rectangulo {
    double base;
    double altura;
    public Rectangulo(double base,double altura){
this.base=base;
this.altura=altura;
    }
    public double Perimetro(){
        double perimetro = altura*2+base*2;
        return perimetro;
    }
    public double Area(){
        double area= altura*base;
        return area;
    }
}
