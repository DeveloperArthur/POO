package br.com.atividadepoo;

/*Crie uma aplicação Java, utilizando os conceitos de Orientação a Objetos*/

public class main {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Grajau", 125, 513);
        Endereco endereco2 = new Endereco("Taboao da Serra", 24, 6213);
        Endereco endereco3 = new Endereco("Grajau", 666, 66);

        Cliente cliente1 = new Cliente("Arthur", 1111111, endereco1, "teste@gmail.com", "2216200239");
        Cliente cliente2 = new Cliente("Wallace", 24, endereco2, "meno@gmail.com", "48648641354");

        Corretor corretor1 = new Corretor("testCreci1", "Wesly", 222222, endereco3, "meno@gay.com", "456418961");
        Corretor corretor2 = new Corretor("testCreci2", "Renatin", 333333, endereco1, "MENO@GAY2.COM", "541651651");

        Gerente gerente1 = new Gerente("testCreci3", "Renatin SHOW", 333333, endereco1, "MENO@GAY2.COM", "541651651");
        Gerente gerente2 = new Gerente("testCreci4", "Renatin", 333333, endereco2, "MENO@GAY2.COM", "887511651");

        Imovel imovel1 = new Imovel(endereco3, 3, 1000.25);
        Imovel imovel2 = new Imovel(endereco1, 2, 400);

//      Usuario usuario1 = new Usuario("Arthur", 1111111, endereco1, "teste@gmail.com", "2216200239");
//      Usuario usuario2 = new Usuario("Wallace", 24, endereco2, "meno@gmail.com", "48648641354");
        corretor1.cadastrar(imovel1);

        cliente1.agendarVisita(imovel2);
        cliente2.reservar(imovel1);

        imovel1.mostrarInformacoes();

        gerente1.alterarBonificacao(corretor1);
    }

}
