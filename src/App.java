import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ola Seja bem vindo!");

        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o Nome: ");
        String nome = nomeScanner.nextLine();


        Scanner contaScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        Integer conta = contaScanner.nextInt();


        Scanner agenciaScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = agenciaScanner.nextLine();


        Scanner saldoScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o saldo inicial: ");
        
        Double saldo = saldoScanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco,"
                            +"sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}