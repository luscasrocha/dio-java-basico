import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        // usei o nextLine para que o sistema aceite todo o valor digitado na linha do terminal (nome sobrenome, por exemplo)

        System.out.println("É muito bom te ver aqui, " + nome + "! Para continuar, informe o número de sua agência:");
        String agencia = scanner.next();

        System.out.println("Agora informe o número de sua conta:");
        int numeroConta = scanner.nextInt();
        
        double saldo = 1640;
        // atribui o valor de um salário mínimo, no desafio não constava que precisava solicitar o saldo;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + 
        numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
