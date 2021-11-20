package Chapter_2;

public class VariaveisPossuemContexto {
	
	/* Criando uma classe para separar as variáveis
	 * E dar a elas um contexto melhor criando uma 
	 * Função para cada contexto*/
	
	private String numbers;
	private String verb;
	private String pluralModifier;
	
	public String make(char candidate, int count) {
		createPluralDependentMessageParts(count);
		return String.format("There %s %s %s %s", verb, numbers, candidate, pluralModifier);		
	}

	private void createPluralDependentMessageParts(int count) {
		if (count == 0) {
			thereAreNoLetters();
		}
		else if(count == 1) {
			thereIsOneLetter();
		}
		else {
			thereAreManyLetters(count);
		}
	}

	private void thereAreManyLetters(int count) {
		numbers = Integer.toString(count);
		verb = "are";
		pluralModifier = "s";
	}

	private void thereIsOneLetter() {
		numbers = "1";
		verb = "is";
		pluralModifier = "";
	}

	private void thereAreNoLetters() {
		numbers = "no";
		verb = "are";
		pluralModifier = "s";
	}
}
