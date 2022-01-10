package com.bancodigital;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void inserirCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        String nomeClienteRemover = cliente.getNome();
        this.clientes.removeIf(p -> p.getNome().equalsIgnoreCase(nomeClienteRemover));
    }

    public void listarClientes(){
        System.out.println("### Clientes ###");
        for (Cliente c : this.clientes){
            System.out.println("Nome: " + c.getNome());
        }
    }

}
