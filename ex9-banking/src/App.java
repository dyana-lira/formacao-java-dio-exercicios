import java.util.Scanner;
import Banking.Banking;
import Banking.AccountView;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //criar menu
        Banking account1 = criarConta();

        System.out.println("Informe o valor do saque: ");
        account1.sacar(account1, scan.nextDouble());

        System.out.println("Informe o valor do deposito: ");
        account1.depositar(account1, scan.nextDouble());


    }

    private static Banking criarConta() {
        System.out.println("Para criar sua conta. Adicione um saldo inicial: ");
        return new Banking(scan.nextDouble());
    }


}

