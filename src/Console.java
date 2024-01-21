public class Console {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(matheus);
        cc.depositar(1500);
        
        Conta poupanca = new ContaPoupanca(matheus);

        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
