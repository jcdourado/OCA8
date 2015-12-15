import java.util.ArrayList;
import java.util.List;

public class ExpressoesLambdas{
	// Uma expressao lambda é um codigo independemente de estados de objetos
	// Ele tem diversos parametros, que podem ser de um Tipo especifico,
		// REGRAS:
			// SE FOR UM PARAMETRO E SEM O TIPO PODE VIR SEM ()
			// DO CONTRARIO, OS PARENTESES SAO OBRIGATORIOS!!!
	// tem uma -> para diferenciar os lados
	// o corpo pode vir com ou sem os {}
	
	// SEMPRE RETORNAM BOOLEAN!
	// SO TRABALHAM COM INTERFACES COM UM METODO APENAS!
	// NO CORPO NAO SE PODEM CRIAR VARIAVEIS COM O MESMO NOME DOS PARAMETROS

	// HA UM PACKAGE java.util.function com classes para auxiliar:
		// Predicate
		// Tem um metodo removeIf, do ArrayList, que usa isto

	public void teste(ArrayList<String> e){System.out.println("1");}
// nao funciona:
//	public void teste(ArrayList e){e.add(3);}
	public static void  main(String[] args){
		new ExpressoesLambdas().teste(new ArrayList<String>());
	}
}