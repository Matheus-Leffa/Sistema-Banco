package BancoPOO;

public class ContaCorrente extends Conta{
    private boolean utilizaCheque;

    public ContaCorrente(int numConta, String nomeCliente, double saldoAtual, boolean utilizaCheque) {
        super(numConta, nomeCliente, saldoAtual);
        this.utilizaCheque = utilizaCheque;
    }

    public boolean isUtilizaCheque() {
        return utilizaCheque;
    }

    public void setUtilizaCheque(boolean utilizaCheque) {
        this.utilizaCheque = utilizaCheque;
    }

    @Override
    public String toString() {
        return "ContaCorrente \n" +
                "Conta: " + numConta + "\n" +
                "Nome do cliente: " + nomeCliente + '\n' +
                "Saldo atual: " + saldoAtual + '\n' +
                "Utiliza cheque: " + utilizaCheque;
    }
}
