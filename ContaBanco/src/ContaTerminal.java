import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //TODO:Conhecer e importar a classe Scanner
        System.out.println("Por favor, informe o número da sua Agencia:");
        String agencia = sc.nextLine();
        //Exibir as mensagens para o nosso cliente
        System.out.println("Por favor, informe o número da sua Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); //Para consumir a quebra de linha
        //Obter pelo scaneer os valores digitados no terminal
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = sc.nextLine();
        //Exibir a mensagem conta criada
        System.out.println("Por favor, digite o Saldo:");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
