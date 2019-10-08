package br.com.atividadepoo;

public class Imovel {

    private Endereco endereco;
    private int codigo;
    private double valorVenda;

    public Imovel(Endereco endereco, int codigo, double valorVenda) {
        this.endereco = endereco;
        this.codigo = codigo;
        this.valorVenda = valorVenda;
    }
    
    public void mostrarInformacoes() {
        System.out.printf("Endereco: %s \nCod. %d \nValor: %.2f\n", endereco, codigo, valorVenda);
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + ", codigo=" + codigo + ", valorVenda=" + valorVenda + '}';
    }
    
    
}
