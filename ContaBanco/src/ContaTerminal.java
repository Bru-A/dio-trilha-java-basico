import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da Agência");
        numero = scanner.nextInt();
        agencia = scanner.nextLine();
        System.out.println("Por favor digite a agência!");
        agencia = scanner.nextLine();
        System.out.println("Por favor digite o nome do cliente");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor digite o saldo da conta");
        saldo= scanner.nextDouble();

        

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        scanner.close();

    }
}
