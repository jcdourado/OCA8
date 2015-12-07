public class Primitivos{
	
	// O java possui dois tipos de dados: primitivos e referencias
	//	boolean true or false true
	//	byte 8-bit integral value 123
	//	short 16-bit integral value 123
	//	int 32-bit integral value 123
	//	long 64-bit integral value 123
	//	float 32-bit floating-point value 123.45f
	//	double 64-bit floating-point value 123.456
	//	char 16-bit Unicode value 'a'
	
	// o byte, short, int e long são usados sem pontos decimais.
	// todo float precisa ter o f, todo long precisa do L (upper ou lower)

	// é possivel usar '_' para auxiliar na visão do codigo: 
		// no começo, no fim, antes de um ponto ou depois de um ponto não pode!!!
	
	long e = 123456781l; // a partir de 9 digitos, ele necessita do L!

	// uma referencia refere-se a um objeto (uma instancia de uma classe)
	// diferentemente dos tipos primitivos, que guardam os sus valores onde a variavel
	// esta alocada, uma referencia aponta para o endereço do objeto guardado na memoria
	
	// referencias podem ser atribuidas como null, primitivos não
	// primitivos não tem métodos

	public static void main(String... args){
		System.out.println(new Primitivos().e);
	}
}