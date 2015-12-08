public class ElementosClasseEDestricao{
	// primeiro deve-se publicar o package (se tiver ele é obrigatorio em primeiro)
	// depois os imports (obrigatorio logo apos o package)
	// depois a classe

	// comentarios podem ir em qualquer lugar

	// o Java possui o garbage collector, que fica observando quais objetos nao estao sendo
	// mais utilizados.

	// Todos os objetos ficam armazenados na memoria heap (é um espaço largo de memoria nao usada
	// para sua aplicacao, seu tamanho depende do ambiente)

	// O java prove um metodo chamado System.gc que sugere ao Garbage Collector para ser executado
	// o java pode ignorar isto.

	// O garbage collection destroi o objeto em duas situaçoes:
		// nao há mais referencias ao objeto ou todas as referencias estao fora do escopo.

	// Objeto x referencia:
		// O objeto sempre esta na heap, ele nunca é passado a um metodo ou retornado,
		// ele que recebe o gc, e nao a referencia (esta que não muda de tamanho)

	// um objeto so pode ser acessado por sua referencia

	// o metodo finalize() só pode ser chamado uma vez, e é o garbage que o chama, quando ele esta
	// elegivel para ter um fim!

	public static void main(String... args){
		ElementosClasseEDestricao e = new ElementosClasseEDestricao();
	}		

	protected void finalize() {
		 System.out.println("Calling finalize"); // isso nao vai funcionar!
	} 
}