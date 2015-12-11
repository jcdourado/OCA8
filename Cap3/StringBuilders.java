public class StringBuilders{
	// sao mutaveis	
	// seus metodos alteram seu proprio valor
	// caso altere algum objeto, ele altera todas as referencias
	// se instancia com o new, pode ser vazio, ou passar o tamanho(alternavel)
		// ou uma string especifica
	
	// metodos:
		// mesmos do String
		// append() adiciona ao final da string, pode passar numeros, booleanos
		// insert(pos,string) adicionar em uma posicao especifica
		// delete(comeco, fim) e deleteCharAt(posicao) 
		// reverse()
		// toString()

	// O stringBuffer faz a mesma coisa so que mais lento, pois 
		// é sincronizado com Threads

	// Referencias:
		// String: em caso de literais (sem o new), ele pode reusar o 
			// objeto declarado anteriormente, se for alterado,
			// um novo objeto é criado
		// Objetos quaisquer: o == e o .equals() testa a referencia


	public static void main(String... args){
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		System.out.println(same + "  " + sb);
	}

}