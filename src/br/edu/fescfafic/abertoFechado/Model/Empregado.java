package br.edu.fescfafic.abertoFechado.Model;

public class Empregado extends Pessoa{

    public double salario;

    public Empregado(String nome, int idade, String email, double salario){
        super(nome, idade, email);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularFolhaDePagamento() {
        return salario;
    }
}
