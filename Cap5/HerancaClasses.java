public class HerancaClasses{
	// Assim como o this, o super deve ser o primeiro do construtor
	// O java chama o Construtor da mae na primeira linha
	// O this pode ser usado pra chamar coisas da Super-Classe
	
	// Overriding:
		// Tem que ter a mesma assinatura da super classe
		// Tem ter a mesma acessibilidade, ou ser mais acessivel
		// Nao pode lançar excecoes que sao novas 
		// Pode retirar as excecoes!!!!
		// Se o metodo retorna um valor, este deve ser 
			// uma subclasse ou uma classe deste
	
	// Estaticos:
		// Se tem static na da mae, tem que ter na filha
		// A ordem pode ser qualquer!!
	
	// Ao chamar metodos estaticos, cada um chama da sua classe
	// Ao chamar metodos normais, ele executa como se fosse um só na filha!!

	// Abstract:
		// um metodo nao pode ser marcado como private e abstract!1
	
	// Interface:
		// pode ter abstract tanto no nome quanto nos metodos
		// o mesmo pra variaveis estaticas
		// nao tem finals, protecteds, privates
		// PODE EXTENDER DE MULTIPLAS INTERFACES
		// Aplica as mesmas regras de overLoading

		// as variaveis dele sao OBRIGATORIAMENTE:
			// publicas, estaticas e finais!!

		// foi implementado um novo tipo de metodo:
			// default: ele existe para todas as classes que implementam
			// a interface, se elas nao o reescrevem, nao da erro,
			// ele a executa!
	
			// Nao pode ser estatico, final ou abstrato
			// Nao pode ser protected ou private
			// ele chama o default por interface.super.metod();

		// Metodos estaticos:
			// nao pode colocar private ou protected		
			// Nao pode ser sobrescrito
			
}