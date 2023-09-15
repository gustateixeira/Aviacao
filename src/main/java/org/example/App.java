package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Endereco endereco = new Endereco("Porto Alegre", "RS", "Brasil", "Plinio Brasil Milano", "1703 B", "Higienópolis", "90520-000", "1310");
        Passageiro passageiro = new Passageiro("000.000.000-00", "Pedro", "13", endereco);
        System.out.println(passageiro.getDados());

    }
}
