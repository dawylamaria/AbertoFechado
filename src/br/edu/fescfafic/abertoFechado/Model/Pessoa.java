package br.edu.fescfafic.abertoFechado.Model;

public abstract class Pessoa {
    public String nome;
    public int idade;
    public String email;

    public Pessoa(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;


    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public int getIdade(){
        return idade;

    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public double calcularFolhaDePagamento(){
        return 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
