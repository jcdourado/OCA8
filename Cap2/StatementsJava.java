public class StatementsJava{
	// If
		// executa uma expressao BOOLEANA se o teste é verdadeiro
		// caso esteja sem os {} ele executa só ate o primeiro ;
		// nao da pra declarar variaveis nos ()

//	public static void main(String[] args){
		// boolean x = false;
		// if(x = true) System.out.println("oi");
		// else System.out.println("oi");
		// System.out.println("oi");
		
//	}
	
	// Operador ternario
		// ? : 
		// (booleano) ? (valor retornado caso true) : (caso falso);
		// nao precisa de ()
		// ele apenas faz um lado!!! Nao executa o outro

	// Switch
		// nao suporta boolean, long, float e double.
		// ele executa ate encontrar um break nao importando o case
		// os cases nao funcionam com variaveis
		// apenas ENUM (se forem do mesmo tipo do switch), e FINAL
		// TEM QUE SER DO MESMO TIPO DA VARIAVEL DO SWITCH		
	
	// While
		// testa uma condicao e executa seu bloco de instrucoes

	// Do-While
		// é executado pelo menos uma vez e depois testa

	// For
		// Há dois tipos de for, o basico e o for each
		// No basico:
			// todos os campos sao opcionais, mas precisam do ( ; ;)
			// Nao se pode declarar tipos diferentes na declaracao
			// Ele declara novas variaveis caso já nao tenham sido	
				// declaradas
			// pode usar o incremento na declaracao mesmo!!!

		// for each
			// o objeto a ser percorrido pode ser um array ou implementar
				// o lang.Iterable				
	// Label
		// um identificador seguido de ":" que pode ser utilizado nos
		// break (que para o loop atual, NAO USA EM IF) e
		// continue (que retorna ao ultimo teste feito, NAO USA EM SWITCH)
		

	public static void main(String args[]){
		
	int x = 1;
	for(x++; x < 10 ; x ++){
		System.out.println(x);
	}
		System.out.println(x);
	
}
	
}