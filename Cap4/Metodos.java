package OCA;
import static java.util.Arrays;

public class Metodos{
	// modificadores de acesso:
		// public, private, protected(NAO ACESSA VARIAVEIS)
			// e package (default)
		
	// especificadores opcionais:
		// static, abstract, final <- estao no exame
		// synchronized, native, strictfp <- nao estao
		// PODE USAR ELES ANTES DO MODIFICADOR DE ACESSO!!!!!!!

	// VAR ARGS: necessitam ser o ultimo argumento de um metodo
		// E so pode ter um, por metodo!
		// Pode-se passar null e também nada na sua chamada!

	// Metodos e campos estaticos:
		// existem independetemente de uma instancia da classe
		// Servem para auxiliar e compartilhar dados entre as classes
		// A referencia pode ser NULL, mas o java olha para sua classe
		// Pode-se chamar metodos das variaveis estaticas
		// ha inicializadores estaticos : static {}
				
	// Finals:
		// pode se inicializar depois

	// Static imports:
		// sao usados para importar partes de classes
		// nao se pode usar classes completas nos static imports
		// SO PODE SER import static e nao o contrario

	protected static String nome = "Julio";
	public static String kkk = nome+ 1/3+2;
	{
		nome = "TEC";
	}

	final static protected void teste(){
		System.out.println("Funciona!!" + nome + "''''" + kkk);
	}

	final static public long teste(int... nums){
		System.out.println("Funciona!!" + nums[0]);
		return 9;
	}

	public static void main(String... args){
		Metodos.teste();			
	}
}