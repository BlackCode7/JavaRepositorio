package applicationCalculoAreaQuadrado;

import java.util.Locale;
import java.util.Scanner;

import entitiesQuadrado.QuadradoEntitie;

public class CalculoQuadrado {

	public static void main(String[] args) {
		/*Para fazer o c�lculo da �rea do quadrado � necess�rio realizar o 
		 *produto entre dois lados. Como o quadrado tem lados iguais, basta 
		 *pegar a medida de um dos lados e elevar ao quadrado. Para a 
		 *realiza��o usamos a f�rmula da �rea A = b. h, assim um de seus 
		 *lados ser� a base (b) e o outro a altura (h). 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		QuadradoEntitie A;
		QuadradoEntitie B;
		
		A = new QuadradoEntitie();
		B = new QuadradoEntitie();
		//C = new QuadradoEntitie();
		double P = 2;
		
		System.out.println("Digite as medidas do Quadrado A :");
		A.L = sc.nextDouble();
		System.out.println("Digite as medidas do Quadrado B :");
		B.L = sc.nextDouble();
		//System.out.println("Digite as medidas do Quadrado C :");
		//C.L = (int)sc.nextDouble();
		
		
		//double A_calcArea = Math.pow(A, P);
		//B_calcArea = potencia();
		//C_calcArea = potencia();
		
		//System.out.printf("Area do quadrado A %.2f%n :  ",A_calcArea);
		//System.out.println("Area do quadrado B:  ",B_calcArea);
		//System.out.println("Area do quadrado C:  ",C_calcArea);
		
		
		/*
		if (A_calcArea > B_calcArea) {
			System.out.println("Maior �rea � A_calcArea");
		}
		else if (B_calcArea > C_calcArea){
			System.out.println("A Maior Area � B_calcArea");
		}
		else {
			System.out.println("A Maior Area � C_calcArea");
		}
		*/
		
		sc.close();
		
	}

	
	
	

}
