import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco-Dio, insira os seus dados para concluir o cadastro!");

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o seu nome. ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o número da Agência
        System.out.println("Certo, " + nomeCliente + ". Agora digite o número da Agência.");
        int numeroAgencia = 0;
        boolean numeroValido = false; 
        while (!numeroValido) {
            try {
                numeroAgencia = Integer.parseInt(scanner.nextLine());
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Número da Agência inválido. Digite novamente.");
            }
        }

        // Solicitar e ler o número da conta
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.nextLine();

        // Solicitar e ler o saldo da conta
        System.out.println("Qual o seu saldo?");
        double saldo = 0.0;
        boolean saldoValido = false;
        while (!saldoValido) {
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                saldoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Digite novamente.");
            }
        }

        // Fechar o scanner
        scanner.close();

        // Exibir os detalhes da conta
        System.out.println(
            "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia +
            ", conta " + numeroConta +
            " e seu saldo é " + saldo +
            ". Seu saldo já está disponível para saque!"
        );
    }
}
