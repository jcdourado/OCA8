public class Operadores{
	// aqui nao tem contas, apenas variaveis e metodos
		
	// Um operador � um simolo especial que pode ser aplicado em um conjunto
	// de variaveis, valores ou literais. Tem tres tipos:
		// unario, binario e ternario.

	// h� toda uma ordem de opera��o:
		// pos unary
		// pre unary
		// unary operator (+,-,!)
		// *,/,%
		// +,-
		// >>,<<,>>>>
		// <,>,<=,>=, instanceof
		// ==,!=
		// &,^,|
		// &&, ||
		// ? :
		// de atribuicao � primeira variavel (+=)
		
	// a ordem pode ser alterada com "()"
	
	// regras de promocao:
		// se dois valores possuem diferentes tipos, o java promove o menor
			// para o maior
		// se um valor � int e o outro � de ponto decimal, o java promove
			// o  int para o ponto decimal
		// byte, short e char sao promovidas para int quando sao usadas 
			// com operadores aritmetivos
		// o resultado deve ser do mesmo tipo das promocoes

	// Operadores unarios:
		// +(transforma em positivo),-(transforma em negativo),!,++,--
		// incremento e decremento sao os primeiros a serem feitos
			// ha pre e pos(s� executa depois de ter passado por ele)!
	
	// Operadores binarios
		// pode se usar casting para alterar o resultado de um tipo grande
			// em um menor (do tipo declarado)
	
	// Operadores de atribuicao compostos:
		// apenas cai += e -=
		// ele da o cast AUTOMATICO para a variavel de atribuicao		

	// Operadores l�gicos:
		// &, | e ^(xor -> que transforma os diferentes em true)
		
	// Operadores de Short-circuit
		// && e || 
		
	// Operadores de equalidade
		// h� promo��o em casos de diferencas entre tamanhos
		// em casos de comparacao entre objetos, ele compara onde eles
			// estao apontando(se � ao mesmo alvo)

	// short x = 10;
	// short y = 3;
	// short z = (short) (x * y);
	
	// int x = 9;
	// int y = -(x);

	public static void main(String... args){
		Operadores e = new Operadores();
		System.out.println(e.y);
		System.out.println(e.x);
	}

}