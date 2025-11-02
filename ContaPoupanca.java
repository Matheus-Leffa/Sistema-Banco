package BancoPOO;

public class ContaPoupanca extends Conta{
    private float rendimentoMensal;

    public float getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(float rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    public ContaPoupanca(int numConta, String nomeCliente, double saldoAtual, float rendimentoMensal) {
        super(numConta, nomeCliente, saldoAtual);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento(){
        double rendimento = (float) (saldoAtual * rendimentoMensal);
        System.out.println("O rendimento mensal dessa conta foi R$" + rendimento);
        this.saldoAtual += rendimento;
        System.out.println("Saldo atual: R$" + saldoAtual);
    }

    @Override
    public String toString() {
        return "ContaPoupanca \n" +
                "Conta: " + numConta + "\n" +
                "Nome do cliente: " + nomeCliente + '\n' +
                "Saldo atual: " + saldoAtual + '\n' +
                "Rendimento mensal: " + rendimentoMensal;
    }
}
