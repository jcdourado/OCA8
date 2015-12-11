public class Strings{
	// nao precisa do new
	// há concatenacao: entre numeros (soma) e string
	
	// são imutaveis, nao alteram depois de criadas:
		// isso nao funciona: string.concat("3") apenas se atribuir de volta
	
	// se usadas com o operaor new, elas nao vao pra String Pool!

	// metodos:
		// length()
		// chartAt() qual eh o char naquela posicao
		// indexOf() onde esta tal string ou char, pode-se passar 
			// uma posicao inicial, se ele nao acha, ele retorna -1
		// substring() retorna um pedaco da string, passa-se o inicio
			// e pode passar o fim, ele nao exibe a ultima posicao
		// toUpperCase() e toLowerCase()
		// equals() e equalsIgnoreCase()
		// startsWith() e endsWith() pode passar uma string inteira
		// contains()
		// replace() 
		// trim() remove espaços do começo e do fim da string

	public static void main(String args[]){
		String s1 = "   oii ii";
		System.out.println(s1.trim());
	}

}