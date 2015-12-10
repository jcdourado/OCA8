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
		// apenas enums (se forem do mesmo tipo do switch), e finals
		
		

	public static void main(String args[]){
		
	int x = 0;
	
	switch(x){
		case 1.0: break;
		default: System.out.println("oi"); break;

	}
	}
	
}