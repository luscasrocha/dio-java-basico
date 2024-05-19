import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º parâmetro:");
		int parametroUm = sc.nextInt();

		System.out.println("Digite o 2º parâmetro:");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		sc.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int contagem = parametroDois - parametroUm;
			for (int quantidade = 1 ; quantidade <= contagem ; quantidade++) {
				System.out.println("Imprimindo o número " + quantidade);
			}
		}
	}
}