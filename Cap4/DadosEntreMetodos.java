public class DadosEntreMetodos{
	// ele nao altera seu valor de jeito nenhum, a nao ser se trocar de fato
	// pois ele faz uma copia das variaveis ao chamar seu metodo
	
	// OverLoading:
		// permite o sobrecarregamento atraves de regras do mesmo metodo
			// Se SOMENTE MUDA O RETORNO, nao compila!!!
			// NAO se pode passar varios valores quando o metodo e Array
			// NAO FUNCIONA ENTRE VAR ARGS E ARRAYS!!!!
			// Há autoBoxing nos tipos primitivos se especificado
			// E COMPILA CASO HAJA ENTRE WRAPPER E PRIMITIVOS
			// ELE BUSCA O MAIS ESPECIFICO POSSIVEL
			// O VAR ARGS É O ULTIMO A SER PROCURADO
			// NA CHAMADA, ELE APENAS FAZ UMA COISA, EX:
				// SUBIR PRA INTEGER, OU LONG
			
	public static void main(String[] args){
		alterarValor("","a");
	}

	public static void alterarValor(String[] b){
	}

}