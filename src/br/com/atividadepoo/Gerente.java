package br.com.atividadepoo;


public class Gerente extends Corretor {

    public Gerente(String creci, String nome, int cpf, Endereco endereco, String email, String login) {
        super(creci, nome, cpf, endereco, email, login);
    }
    public void alterarBonificacao(Corretor corretor){
        System.out.println("Alterado bonificacao do corretor " + corretor + " com sucesso");
    }

    @Override
    public String toString() {
        return "Gerente{" + '}';
    }
    
    
}
