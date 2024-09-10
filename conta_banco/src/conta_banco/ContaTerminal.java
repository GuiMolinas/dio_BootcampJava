package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declarando Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Declarando variáveis
        int num;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Pedindo dados
        System.out.println("====== CRIANDO CONTA BANCÁRIA ======");
        
        System.out.println("INSIRA AQUI O NÚMERO DA SUA CONTA");
        num = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("=============================================");
        
        System.out.println("INSIRA AQUI O NÚMERO DA SUA AGÊNCIA");
        agencia = scanner.nextLine();
        
        System.out.println("=============================================");
        
        System.out.println("INSIRA AQUI O SEU NOME");
        nomeCliente = scanner.nextLine().toUpperCase();
        
        System.out.println("=============================================");
        
        System.out.println("INSIRA AQUI O SEU SALDO ATUAL");
        saldo = scanner.nextDouble();
        
        System.out.println("=============================================");
        
        System.out.println("Sua conta foi criada com sucesso ;)");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + num);
        System.out.println("Saldo disponível: R$ " + saldo);
    }
}
