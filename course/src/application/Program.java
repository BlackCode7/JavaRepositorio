package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fazer um programa para ler as medidas dos lados de dois triângulos x e y
		 () Em seguida mostrar o valor das áreas dos dois triângulos e dizer qual 
		 dos dois triângulos possui a maior área.
		 lados do triÇangulo a, b, c formula area = Vp(p-a)(p-b)(p-c) onde p = (a+b+c)/2 
		 
		 Problema resolvido sem orientação a objetos
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		//double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); 
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
		
		//double p = (xA+xB+xC)/2.0;
		//Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		//p = (yA+yB+yC)/2.0;
		//double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		// Testando qual das áreas é maior
		if(areaX > areaY) {
			System.out.println("Maior Área é X");
		}else {
			System.out.println("Maior área é Y");
		}
		
		sc.close();
	}

}
