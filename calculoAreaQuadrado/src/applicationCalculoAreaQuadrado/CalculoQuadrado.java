package applicationCalculoAreaQuadrado;

import java.util.Locale;
import java.util.Scanner;

import entitiesQuadrado.QuadradoEntitie;

public class CalculoQuadrado {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Para fazer o c�lculo da �rea do quadrado � necess�rio realizar o 
		 *produto entre dois lados. Como o quadrado tem lados iguais, basta 
		 *pegar a medida de um dos lados e elevar ao quadrado. Para a 
		 *realiza��o usamos a f�rmula da �rea A = b. h, assim um de seus 
		 *lados ser� a base (b) e o outro a altura (h). 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int potencia = 2;		
		int A;		
		int B;
		int C;
		
		//A = new QuadradoEntitie();
		//B = new QuadradoEntitie();
		//C = new QuadradoEntitie();
		
		System.out.println("Digite as medidas do Quadrado A :");
		A = (int)sc.nextDouble();
		System.out.println("Digite as medidas do Quadrado B :");
		B = (int)sc.nextDouble();
		System.out.println("Digite as medidas do Quadrado C :");
		C = (int)sc.nextDouble();
		
		double A_calcArea = (int) Math.pow(A,potencia);
		double B_calcArea = (int) Math.pow(B,potencia);
		double C_calcArea = (int) Math.pow(C,potencia);
		
		System.out.printf("Area do quadrado A: %.4f%n ",A_calcArea);
		System.out.printf("Area do quadrado B: %.4f%n ",B_calcArea);
		System.out.printf("Area do quadrado C: %.4f%n ",C_calcArea);
		
		
		if (A_calcArea > B_calcArea) {
			System.out.println("Maior �rea � A_calcArea");
		}
		else if (B_calcArea > C_calcArea){
			System.out.println("A Maior Area � B_calcArea");
		}
		else {
			System.out.println("A Maior Area � C_calcArea");
		}
		
		sc.close();
		
	}

}
