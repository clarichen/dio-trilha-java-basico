import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

       //Conhecer e importar a classe Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
          
       //Exibir as mensagens para o nosso usuário
       System.out.println("Digite seu nome: ");
       String nomeCliente = scanner.next();

       System.out.println("Digite seu Sobrenome: ");
       String sobrenomeCliente = scanner.next();

       System.out.println("Digite o número da Conta Bancária: ");
       int numero = scanner.nextInt();

       System.out.println("Digite o número da Agência: ");
       String agencia = scanner.next();

       System.out.println("Informe o valor que gostaria de liberar para saque: ");
       double saldo = scanner.nextDouble();

       //Obter pela scanner os valores digitados no terminal
       System.out.println("Conta Bancária: " + numero);
       System.out.println("Agência: " + agencia );
       System.out.println("Nome Completo: " + nomeCliente + " " + sobrenomeCliente);
       System.out.println("Saldo: " + saldo);

       //Exibir a mensagem conta criada
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");

    }  
}
