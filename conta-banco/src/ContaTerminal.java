import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, agora informe o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Por favor, digite agora seu nome: ");
        nomeCliente = sc.nextLine();
        
        System.out.print("Digite o valor do depósito inicial para atualizar saldo: ");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é " + agencia + ", conta " + numero);
        System.out.printf(" e seu saldo %.2f", saldo);
        System.out.println(" já está disponível para saque.");

        sc.close();
    }
}
