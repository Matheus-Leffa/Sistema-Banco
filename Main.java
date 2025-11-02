package BancoPOO;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc1 = new ContaCorrente(1, "Mauro", 1500f, true);
        ContaPoupanca cp1 = new ContaPoupanca(2,"Matheus",800f,0.02f);

        cc1.sacar(1200);
        cp1.aplicarRendimento();

        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
    }
}
