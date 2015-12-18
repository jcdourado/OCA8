public class Exceptions{
	// Object -> Throwable -> Exception, Error e RuntimeExcpetion	
	
	// RuntimeExceptions == unchecked exceptions
	// Exception e todas suas subclasses, exceto a de cima == checked exceptions
	// Erros == estao fora do nosso controle, MAS PODE-SE DAR HANDLE!!

	// Precisa dos {}
	// try nao precisa de um catch, mas se nao o tiver, tem q ter o finally
	
	// O java executa na ordem em que ele achar a exception
		// e se uma superclasse estiver acima de uma classe, ele nao compila
		
	// Metodos sobrescritos podem dar throw em RuntimeException!!

	// Checked Exceptions:
		// IOExceptions -> FineNotFoundException
	// Errors Exceptions:
		// ExceptionInInitializerError : Erro na inicializacao de classes
		// StackOverflowError: Erro de recursao infinita
		// NoClassDefFoundError: nao cai no exame: nao encontra a classe

}