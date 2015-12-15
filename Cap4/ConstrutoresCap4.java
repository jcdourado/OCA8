public class ConstrutoresCap4{
	// Sao chamados apenas com o new ou this, nao se pode chamar COM OUTRAS COISAS!!
	// SE FOR CHAMAR O THIS, PRECISA SER A PRIMEIRA LINHA E NAO PODE SER VAZIO!!!!!
	// PODE-SE INICIALIZAR FINALS, MAS SE NAO TIVER SIDO INICIALIZADA
		// APOS O CONSTRUTOR, ELE NAO COMPILA!!!	
	// Ordem:
		// Classe-mae
		// Estaticos
		// Instancia
		// Construtor

	final String kkk;

	public ConstrutoresCap4(String a){this();}

	public static void main(String... args){
		ConstrutoresCap4 c = new ConstrutoresCap4("");
	}	


}