import java.util.*;

public class ArraysList{
	// pode mudar seu tamanho, tem uma sequencia ordenada e permite duplicamento
	// pode passar outro arraylist na inicializacao para copiar seu conteudo
	// agora se pode especificar o tipo de objeto que vai dentro dele
	// diamond operator: <>
	// O lado esquerdo so funciona com um tipo ou sem nada, o outro 
		// funciona com qualquer coisa

	// Metodos:
		// add(indice, elemento) pode passar o indice junto com 
			//o elemento, ou so o elemento
		// remove() pode passar o indice ou o elemento, se nao tiver
			// no array, ele retorna false, mas se o indice for
			// acima do tamanho do array, ele throw uma exception
		// set() ele altera o elemento no indice passado, se o indice
			// for acima do tamanho do array, ele throw uma exception
		// isEmpty()
		// size()
		// clear() retira todos os elementos
		// contains(obj) procura pelo objeto na lista e retorna um boolean
		// equals() compara se dois arrys tem os mesmos elementos
			// na mesma ordem
		
	// Classes wrapper tem um metodo Wrapper.valueOf que retorna um wrapper
	// Ele tem autoboxing para armazenar os elementos
	// SEMPRE QUE SE PASSA UM INT, ELE BUSCA NO INDICE!!!!!!!

	// para converter de ArrayList para um array qualquer usa o .toArray()
		// para um tipo especifico e preciso passar o wrapper como
		// um construtor de array Wrapper[num];
	
	// para converter de um Array para um List (pois nao se especifica o
		// ArrayList) usa-se o metodo Arrays.asArray(varArgs);
		// Mas isto linka os dois ao mesmo objeto!

	// para colocar em ordem
		// Collection.sort(array);

	public static void main(String... args){
		List<String> list = new ArrayList<>();
		list.add("hawk");

		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[1]);
		System.out.println(stringArray.length); // 2
	}
}