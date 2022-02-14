package br.com.exercicios.br.com.exercicios.exercicio1;

public class Pessoa {
    public String nome;
    public int idade;


    public Pessoa(){
        this.nome = "Kayllane";
        this.idade = 19;
    }


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
