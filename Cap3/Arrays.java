public class Arrays{
	// quando instanciando, ele seta os valores como null ou 0
	// int[] ar = new int[3] {42, 55, 99} isto gera erro
	
	// Para colocar em ordem:
		// package java.util.Arrays <- NAO SE PODE INSTANCIAR ELA!!!
		// Arrays.sort(vetor)

	// Para procurar
		// O array ja deve ter sido colocado em ordem
		// Arrays.binarySerach(vetor, valor);
		// se nao estiver em ordem, ele retorna um valor aleatorio
			// (unpredictable output)
		// Se ele achar o valor, ele retorna o indice dele
		// Senão ele retorna -1 + o indice de onde ele ficaria em negativo	

	public static void main(String... args){
		int[] numbers = {2,4,6,8};
		System.out.println(java.util.Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(java.util.Arrays.binarySearch(numbers, 4)); // 1
		System.out.println(java.util.Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(java.util.Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(java.util.Arrays.binarySearch(numbers, 9)); // -5
	}
	
//	public static void main(String args[]){
//		int[] ar = new int[] {(int)42.0, 55, 99};
//		int [] ar2 = ar;
//		ar[1] = 2;
//		System.out.println(ar.equals(ar2));
//		System.out.println(ar2[1]);
//		
//	}


}