package br.com.atividadepoo;

public class Usuario {

    private String nome;
    private int cpf;
    private Endereco endereco;
    private String email;
    private String login;

    public Usuario(String nome, int cpf, Endereco endereco, String email, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email=" + email + ", login=" + login + '}';
    }
    
    
}
