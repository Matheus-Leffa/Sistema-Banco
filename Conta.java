package BancoPOO;

public abstract class Conta {
    protected int numConta;
    protected String nomeCliente;
    protected double saldoAtual;

    public int getNumConta() {
        return numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }


    public void sacar(double valorSaque) throws SaldoInsuficienteException {
        if(valorSaque < saldoAtual){
            System.out.println("Saque de R$" + valorSaque + " efetuado!");
            saldoAtual -= valorSaque;
            System.out.println("Saldo atual: R$" + saldoAtual);
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente. saldo atual: R$" + saldoAtual);
        }
    }

    public void depositar(double deposito) throws DepositoInvalidoException {
        if(deposito > 0){
            System.out.println("Depósito de R$" + deposito + " efetuado!");
            saldoAtual += deposito;
            System.out.println("Saldo atual: R$" + saldoAtual);
        }else{
            throw new DepositoInvalidoException("Depósito inválido!");
        }
    }

    public void verificarSaldoAtual(){
        System.out.println("Saldo atual da conta " + this.numConta + " : R$" + this.saldoAtual);
    }
}
