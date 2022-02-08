import java.util.Scanner;

public class VetorMaiorMenosValor {

	public static void main(String[] args) {

		int a[] = new int[5];
		preencher(a);
		int maior = maiorValor(a);
		int menor = menorValor(a);

		System.out.println(maior);
		System.out.println(menor);
		System.out.println("FECHANDO!");
	}
	
	public static void preencher(int[] a) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("digite 5 valores: ");
		for(int i = 0; i < a.length; i++) {
				System.out.println("Valor: ");
				a[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	public static int maiorValor(int[] a) {
		int maior  = a[0];
		for( int i = 0; i < a.length; i++) {
			if(a[i]>maior) {
				maior = a[i];
			}
		}
		return maior;
	}
	
	public static int menorValor(int[] a) {
		int menor  = a[0];
		for( int i = 0; i < a.length; i++) {
			if(a[i]<menor) {
				menor = a[i];
			}
		}
		return menor;
	}

}
