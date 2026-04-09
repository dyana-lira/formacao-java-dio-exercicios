package Banking;

public class Banking {

    private static Integer accountCounter =1;
    private Double chequeEspecialUsado =0.0;
    private Integer numberAccount;
    private Double saldo;
    private Double chequeEspecial; 
    

    //construtor instanciado em criarConta() na main
    public Banking(Double depositoInicial) {
        this.numberAccount = accountCounter;
        this.chequeEspecial = calcChequeEspecial(depositoInicial);
        this.saldo = depositoInicial;
        accountCounter += 1;
    }

    //métodos de controle/gerenciamento de atributos da Banking
    public void depositar(Banking account, Double deposito) {
        if (chequeEspecialUsado == 0.0 || deposito < calcDescontoChequeEspecial(chequeEspecialUsado)) {
            this.saldo += deposito;
        } else {
            //possibilidade de desconto real
            Double resto = deposito - calcDescontoChequeEspecial(chequeEspecialUsado);
            chequeEspecial += calcDescontoChequeEspecial(chequeEspecialUsado);
            chequeEspecialUsado -= calcDescontoChequeEspecial(chequeEspecialUsado);
            this.saldo += resto;
        } 

        AccountView.consultarSaldo(account);
    }

    public void sacar(Banking account, Double saque) {
        if (saque <= saldo) {
            this.saldo -= saque;
        } if (saque <= (this.chequeEspecial + this.saldo)) {
            Double resto = saque - saldo;
            saldo = 0.0;
            chequeEspecial -= resto;
            chequeEspecialUsado += resto;
        } else {
            System.out.println("Saldo insuficiente.");
        }

        AccountView.consultarSaldo(account);
    }

    private Double calcChequeEspecial(Double depositoInicial) {
        if (depositoInicial <= 500.00) return 50.00;
        else return depositoInicial/2;
    }

    private Double calcDescontoChequeEspecial (Double chequeEspecialUsado) {
        return chequeEspecialUsado * 0.20;
    }

    //getters and setters
    public Integer getNumberAccount() {
        return numberAccount;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public Double getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

}
