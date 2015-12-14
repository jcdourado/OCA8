import java.time.*;

public class DatesTimes{
	
	// Classes:
		// LocalDate apenas um dia, sem tempo e sem timeZone
		// LocalTime apenas um tempo, sem dat e sem timeZone
		// LocalDateTime contem ambos, mas sem o timeZone
	
	// Metodo now() retorna o tempo e a data atual
	
		// LocalDate, PASSA ANO, MES E DIA, O MES pode ser o 
			// estatico da classe Month ou int começando de 1!!!
		// LocalTime, PASSA HORA E MINUTO, DPOIS PODE IR SEGUNDOS
			// E NANOSEGUNDOS
		// LocalDateTime, tem diversas assinatures, mas começa com o 
			// Date e depois Time

	// Eles nao contem construtores publicos, é necessario usar o of!
	// geram Exception caso dê algum erro de data
	
	// Manipular:
		// metodo plus"Year","Days","Weeks","Months" : faz aquilo que e necessario
		// metodo minus"Hours","Minutes","Seconds","Nanos"
	
	// Sao imutaveis como Strings

	// Transforma em long:
		// LocalDate -> toEpochDay() qnt de dias
		// LocalDateTime -> toEpochTime() qnt de segundos

	// Period para auxiliar no trabalho com Dates :
		// Period.of"Days","Weeks","Months",(year,month,day)
		// Ele nao permite a corrente
		// pode-se usar o plus sozinho!!!
	
	// Para formatar a saida
		// DateTimeFormatter passa a variavel estatica, ISO_LOcal_Date exemplo
		// tem um metodo ofLocalizedDate(FormatStyle.TAMANHO) que retorna
			// do jeito solicitado a formatacao
		// as duas classes, a formatadora e a cliente, tem o metodo
			// format que passa a outra para exibir
		// tambem tem o metodo ofPattern() que passa o estilo que voce deseja
		
	// Para pegar um Date de uma String
		// Cria-se o DateTimeFormatter, para LocalDate usa o parse, com o
			// o Formatter, para o LocalTime não

	public static void main(String... args){
		String s1 = "java";
	StringBuilder s2 = new StringBuilder("java");
		System.out.print("1");
	if (s1.equals(s2))
	System.out.print("2");
	}
	

}