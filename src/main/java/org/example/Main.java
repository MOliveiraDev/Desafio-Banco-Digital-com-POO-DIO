package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente maicon = new Cliente();
        maicon.setNome("Maicon");

        Conta cc = new ContaCorrente(maicon);
        Conta cp = new ContaPoupanca(maicon);

        cc.depositar(200);
        cc.sacar(50);

        cc.imprimirExtrato();
        cp.depositar(1000);
        cp.sacar(100);
        cp.imprimirExtrato();
    }

}