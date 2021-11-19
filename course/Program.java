package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fazer um programa para ler as medidas dos lados de dois tri�ngulos x e y
		 () Em seguida mostrar o valor das �reas dos dois tri�ngulos e dizer qual 
		 dos dois tri�ngulos possui a maior �rea.
		 lados do tri�angulo a, b, c formula area = Vp(p-a)(p-b)(p-c) onde p = (a+b+c)/2 
		 
		 Problema resolvido sem orienta��o a objetos
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble(); 
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble(); 
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA+xB+xC)/2.0;
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		p = (yA+yB+yC)/2.0;
		double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		// Testando qual das �reas � maior
		if(areaX > areaY) {
			System.out.println("Maior �rea � X");
		}else {
			System.out.println("Maior �rea � Y");
		}
		
		sc.close();
	}

}
