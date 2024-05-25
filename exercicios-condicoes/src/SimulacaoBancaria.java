import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
        
        int opcao = scanner.nextInt();
    
	    	switch (opcao) {
	    	case 1:{
			double deposito = scanner.nextDouble();
			saldo = saldo + deposito;
			System.out.printf("Saldo atual: %.1f\n", saldo);
			break;
		}
	    	case 2:{
			double saque = scanner.nextDouble();
			if (saque > saldo){
			  System.out.println("Saldo insuficiente.");
			} else{
			  saldo = saldo - saque;
			  System.out.printf("Saldo atual: %.1f\n", saldo);
			} 
			break;
		}
	    	case 3:{
			System.out.printf("Saldo atual: %.1f\n", saldo);
				break;
		}
    		case 0:{
			System.out.println("Programa encerrado.");
			scanner.close();
			return;
		}

		default:
            System.out.println("Opção inválida. Tente novamente."); 
        }
        }
    }
}