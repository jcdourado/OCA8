public class _InicializandoVariavies{
	// Variaveis locais precisam ser inicializadas antes de serem usadas, elas não tem um valor
	// padrão, e o compilador não permite que seja lido seu valor até que seja inicializado

	// Variaveis de instancia (campo) ou de classe (estatica)  são inicializadas com estes valores
	// por padrão:  primitivos (false, 0.0 ou 0) de referencia (null).
	
	// Variaveis de instancia sao inicializada quando o objeto é instanciado, as de classe
	// são inicializadas quando o programa é inicializado!

	// Variaveis definidas dentro de {} só podem ser utilizadas lá	
	
	public static void main(String... args){
		int x;
		_InicializandoVariavies v = new _InicializandoVariavies();
		v.calc(x); // erro!	
	}

	public void calc(int x){
		x = 2;
	}
}