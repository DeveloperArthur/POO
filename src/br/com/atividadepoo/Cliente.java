package br.com.atividadepoo;

public class Cliente extends Usuario {

    public Cliente(String nome, int cpf, Endereco endereco, String email, String login) {
        super(nome, cpf, endereco, email, login);
    }

    public void agendarVisita(Imovel imovel) {
        System.out.println("visita para imóvel " + imovel + " foi agendada com sucesso");
    }

    public void reservar(Imovel imovel) {
        System.out.println("o imóvel " + imovel + " foi reservado com sucesso");
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
    
}
