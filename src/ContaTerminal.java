import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco-Dio, insira os seus dados para concluir o cadastro!");

        System.out.println("Por favor, digite o seu nome. ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Certo, " + nomeCliente + ". Agora digite o número da Agência.");
        int numeroAgencia = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite a agência.");
        String agencia = scanner.nextLine();

        System.out.println("Qual o seu saldo?");
        double saldo = Double.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println(
            "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numeroAgencia +
            " e seu saldo " + saldo +
            " já está disponível para saque!"
        );
    }
}
