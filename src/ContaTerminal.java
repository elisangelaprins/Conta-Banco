import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
            // Conhecer e importar a classe scanner

            // Exibir as mensagens para o nosso usuário

            // Obter pela scanner os valores digitados no Terminal

            // Exibir a mensagem conta criada

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá vamos começar, por favor preencha os dados a seguir: "); //para ser mais amigavel

        System.out.println("Digite o número da sua conta (máximo 6 dígitos): ");
        int numeroConta;
        //este bloco delimita a quantidade de digitos que sua conta pode ter, para evitar erros no programa
        do {
            numeroConta = scanner.nextInt();
            if (String.valueOf(numeroConta).length() > 6) {
                System.out.println("O número de sua conta deve ter no máximo 6 dígitos. Digite novamente: ");
            }
        } while (String.valueOf(numeroConta).length() > 6);

        System.out.println("Digite o número da sua agência (máximo 4 dígitos): ");
        String numeroAgencia;
        //este bloco delimita a quantidade de dígitos da agencia para no máximo 4
        do {
            numeroAgencia = scanner.next();
            if (String.valueOf(numeroAgencia).length() > 4) {
            System.out.println("O número da sua agência deve ter no máximo 4 dígitos. Digite novamente: ");
            } 
        } while (String.valueOf(numeroAgencia).length() > 4);

        scanner.nextLine(); // Limpar o buffer (memória temporária)

        System.out.println("Digite seu Nome e Sobrenome: ");
        String nomeCliente = scanner.nextLine(); // nextLine para ler as duas informações e não apenas a primeira

        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque.");

        scanner.close(); //encerrar o scanner
    }
}