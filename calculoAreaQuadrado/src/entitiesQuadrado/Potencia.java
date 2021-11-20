package entitiesQuadrado;

public class Potencia {

	public static int potencia(int num1, int num2) {
		int i = 0;
		int total = 0;
		
		while(i <= num2) {
			total = num1*num2;
			i++;
		}
		
		return total;
	}
}
