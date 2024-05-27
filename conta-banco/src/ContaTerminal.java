import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== BEM-VINDO! ===");

        System.out.println("Número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agência: ");
        String agencia = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Nome: ");
        String nome = scanner.next();

        scanner.close();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
