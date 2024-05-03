import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Informe Seu nome: ");
        String nomeCliente = s1.nextLine();

        System.out.println("Informe Numero: ");
        Integer numero = s1.nextInt();

        System.out.println("Informe Agencia: ");
        Integer agencia = s1.nextInt();

        System.out.println("Informe saldo bancario: ");
        Integer saldo = s1.nextInt();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %d já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }
}
