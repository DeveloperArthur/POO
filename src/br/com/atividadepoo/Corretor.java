package br.com.atividadepoo;


public class Corretor extends Usuario {
    private String creci;

    public Corretor(String creci, String nome, int cpf, Endereco endereco, String email, String login) {
        super(nome, cpf, endereco, email, login);
        this.creci = creci;
    }
    
    public void cadastrar(Imovel imovel){
        System.out.println("imovel " + imovel + " cadastrado com sucesso");
    }

    @Override
    public String toString() {
        return "Corretor{" + "creci=" + creci + '}';
    }
    
    
}
