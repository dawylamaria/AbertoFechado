package br.edu.fescfafic.abertoFechado.Main;
import br.edu.fescfafic.abertoFechado.Model.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa empregado = new Empregado(
            "dawyla",
            19,
            "dawyla@htmail",
            1000);

        Pessoa gerente = new Gerente(
                "danylo",
                20,
                "danyllo@gmail",
                1000);

        Pessoa consultor = new Consultor(
                "esmeralda",
                30,
                "esmeralda@gmail",
                60);

        listaPessoas.add(empregado);
        listaPessoas.add(gerente);
        listaPessoas.add(consultor);

        double valorTotal = FolhaDePagamento.calcularFolhaDePagamento(listaPessoas);
        System.out.println("FOLHA DE PAGAMENTO: R$ " + valorTotal);





    }
}