package Banking;

public class AccountView {

    //métodos de consulta
    public static void visaoGeral(Banking account) {
        System.out.println("=================VISÃO GERAL=================");
        System.out.printf("ACCOUNT ID: %s\n", account.getNumberAccount());
        System.out.printf("SALDO ATUAL: %.2f\n", account.getSaldo());
        System.out.printf("LIMITE DE CHEQUE ESPECIAL: %.2f\n", account.getChequeEspecial());
        System.out.printf("CHEQUE ESPECIAL UTILIZADO: %.2f\n", account.getChequeEspecialUsado());
        System.out.printf("DESCONTO SOBRE CHEQUE ESPECIAL UTILIZADO: %.2f\n", account.getChequeEspecialUsado() * 0.20);
        System.out.println("=============================================");
        //System.out.printf("\n", );
        //System.out.printf("\n", );
    }

    public static void consultarSaldo(Banking account) {
        System.out.printf("SALDO ATUAL: %s \n", account.getSaldo());
    }

    public static void consultarChequeEspecial(Banking account) {
        System.out.printf("SALDO CHEQUE ESPECIAL: %s\n", account.getChequeEspecial()); 
    }

    public static void consultarChequeEspecialUtilizado(Banking account) {
        System.out.printf("CHEQUE ESPECIAL UTILIZADO: %s\n", account.getChequeEspecialUsado());
    }


}
