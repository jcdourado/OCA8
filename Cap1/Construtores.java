public class Construtores{

	private int x;
	private int y = x + 1;
	public Construtores(){
	}
	public void Construtores(){}

	public static void main(String[] args){
		Construtores c = new Construtores();
	}

	// o new instancia o novo objeto; o nome do construtor deve ser o mesmo da classe
	// há inicializadores de instancias, que é o código abaixo no caso, onde ele executa quando
	// o new é chamado

	// há toda uma sequencia de execução!

	{System.out.println(2); }
}