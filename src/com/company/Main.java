package com.company;
import java.awt.geom.Area;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner =new Scanner (System.in);
	System.out.println("ingrese base");
	String base = scanner.nextLine();
	double b = Double.parseDouble(base);
	System.out.println("ingrese altura");
	String altura = scanner.nextLine();
	double a = Double.parseDouble(altura);
	Rectangulo miRectangulo = new Rectangulo(b,a);
	System.out.println("el Perimetro es:"+miRectangulo.Perimetro());
	System.out.println("el Area es:"+ miRectangulo.Area());
    }
}
