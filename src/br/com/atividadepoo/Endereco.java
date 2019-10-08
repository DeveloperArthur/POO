package br.com.atividadepoo;

public class Endereco {

    private String logradouro;
    private int numero;
    private int cep;

    public Endereco(String logradouro, int numero, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + '}';
    }
    
    
}
