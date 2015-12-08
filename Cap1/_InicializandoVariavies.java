public class _InicializandoVariavies{
	// Variaveis locais precisam ser inicializadas antes de serem usadas, elas n�o tem um valor
	// padr�o, e o compilador n�o permite que seja lido seu valor at� que seja inicializado

	// Variaveis de instancia (campo) ou de classe (estatica)  s�o inicializadas com estes valores
	// por padr�o:  primitivos (false, 0.0 ou 0) de referencia (null).
	
	// Variaveis de instancia sao inicializada quando o objeto � instanciado, as de classe
	// s�o inicializadas quando o programa � inicializado!

	// Variaveis definidas dentro de {} s� podem ser utilizadas l�	
	
	public static void main(String... args){
		int x;
		_InicializandoVariavies v = new _InicializandoVariavies();
		v.calc(x); // erro!	
	}

	public void calc(int x){
		x = 2;
	}
}