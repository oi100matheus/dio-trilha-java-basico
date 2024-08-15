import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String agencia;
        String nome;
        float saldo;
        System.out.print("Por favor, digite seu nome: ");
        nome = teclado.next();
        System.out.print("Digite sua agência: ");
        agencia = teclado.next();
        System.out.print("Digite seu número de conta: ");
        numero = teclado.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = teclado.nextFloat();
        System.out.print("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+"," +
                " conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
