package org.example;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1; //
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor; // valor é subtraído do saldo
    }

    @Override
    public void depositar(double valor) {
        saldo += valor; // valor é adicionado ao saldo
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor); // valor é depositado na conta destino
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}