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
	// h� inicializadores de instancias, que � o c�digo abaixo no caso, onde ele executa quando
	// o new � chamado

	// h� toda uma sequencia de execu��o!

	{System.out.println(2); }
}