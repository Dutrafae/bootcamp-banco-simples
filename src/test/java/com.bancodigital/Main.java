package com.bancodigital;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Java Banking");

        Cliente fulano = new Cliente();
        fulano.setNome("fulano");

        Cliente cicrano = new Cliente();
        cicrano.setNome("cicrano");

        Cliente beltrano = new Cliente();
        beltrano.setNome("beltrano");

        banco.inserirCliente(fulano);
        banco.inserirCliente(cicrano);
        banco.inserirCliente(beltrano);

        Conta cc = new ContaCorrente(fulano);
        Conta poupanca = new ContaPoupança(fulano);

        cc.depositar(150);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarClientes();
        banco.removerCliente(beltrano);
        banco.listarClientes();

    }
}
