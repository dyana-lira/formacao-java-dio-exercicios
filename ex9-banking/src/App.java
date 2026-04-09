import java.util.Scanner;
import Banking.Banking;
import Banking.AccountView;

/*
    PRÓXIMOS PASSOS...:
    1 - Implementar BankingService
      - O usuário deve poder alternar entre contas, isto é, escolher uma conta de uma lista
      - na qual poderá realizar as ações do menu
      - DICA: utilizar numberAccount já existente em Banking
    2 - Todas as informações da conta devem manter-se em Banking.
      - BankingService servirá apenas, por enquanto, para podermos acessar diferentes contas
      - com diferentes valores.
    3 - Implementar opção "Acessar conta"
      - Essa opção irá alterar o valor de atualAccount (agora account)
      - Assim como atualmente, cada opção do case verifica se existe conta criada, é necessário verificar
      - se a lista de contas não está vazia para prosseguir.
      - Se findAccount() não encontrar o numberAccount passado como parâmetro na lista de contas
      - o erro deve ser tratado e o usuário deve ser informado.
    4 - O criarConta() deve chamar o metodo addAccount de BankingService.
    5 - É necessário verificar quando houver saldo na conta suficiente para haver o desconto de 20%
      - do Cheque Especial Usado.
      - Atualmente o desconto é realizado somente sobre o depósito e somente se o valor do depósito for
      - superior ou igual aos 20%, dessa forma, caso o usuário sempre deposite valores menores,
      - esses valore serão somados ao saldo sem nunca pagar o cheque especial mesmo que o saldo
      - já seja superior ao devido.


*/



public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        var option = -1;
        Banking account = null; //será atualAccount, seu valor mudará conforme escolha do usuário, baseando-se em NumberAccount.

        do {
            System.out.println("===============MENU===============");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Acessar conta");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar Cheque Especial");
            System.out.println("6 - Depositar");
            System.out.println("7 - Sacar");
            System.out.println("8 - Pagar boleto");
            System.out.println("0 - Sair");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    account = criarConta();
                    System.out.println("Conta Criada com Sucesso!");
                    AccountView.visaoGeral(account);
                    break;
                case 4:
                    if (account != null) {
                        AccountView.consultarSaldo(account);
                    } else {
                        System.out.println("Nenhuma conta foi encontrada! Crie uma conta primeiro!");
                    }
                    break;
                case 5:
                    if (account != null) {
                        AccountView.consultarChequeEspecial(account);
                    } else {
                        System.out.println("Nenhuma conta foi encontrada! Crie uma conta primeiro!");
                    }
                    break;
                case 6:
                    if (account != null) {
                        System.out.println("Informe o valor do depósito: ");
                        account.depositar(account, scan.nextDouble());
                    } else {
                        System.out.println("Nenhuma conta foi encontrada! Crie uma conta primeiro!");
                    }
                    break;
                case 7:
                    if (account != null) {
                        System.out.println("Informe quanto deseja sacar: ");
                        account.sacar(account, scan.nextDouble());
                    } else {
                        System.out.println("Nenhuma conta foi encontrada! Crie uma conta primeiro!");
                    }
                    break;
                case 8:
                    System.out.println("Opção em construção");
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);

    }

    private static Banking criarConta() {
        System.out.println("Para criar sua conta. Adicione um saldo inicial: ");
        return new Banking(scan.nextDouble());
    }


}

