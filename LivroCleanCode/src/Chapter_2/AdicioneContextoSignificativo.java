package Chapter_2;

public class AdicioneContextoSignificativo {
	private void printGuessStatics(char candidate, int count) {
		String number;
		String verb;
		String pluralMofifier;
		
		if(count == 0) {
			number = "no";
			verb = "are";
			pluralMofifier = "s";
		} else if( count == 1 ){
			number = "1";
			verb = "is";
			pluralMofifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralMofifier = "s";
		}
		String guessMessage = String.format("There %s %s %s %s", verb, number, candidate, pluralMofifier);
		print(guessMessage);
	}

	private void print(String guessMessage) {
		// TODO Auto-generated method stub
		System.out.println(guessMessage);
	}
}
