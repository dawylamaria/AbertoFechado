package br.edu.fescfafic.abertoFechado.Model;

import java.util.ArrayList;

public class FolhaDePagamento {
    public static double calcularFolhaDePagamento(ArrayList<Pessoa> listaPessoas) {
        double valorTotal = 0;

        for (Pessoa pessoa : listaPessoas) {
            valorTotal += pessoa.calcularFolhaDePagamento();
        }
        return valorTotal;
    }

}
