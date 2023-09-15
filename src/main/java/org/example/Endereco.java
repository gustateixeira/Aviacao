package org.example;

public class Endereco {
    private final String cidade;
    private final String estado;
    private final String pais;
    private final String rua;
    private final String complemento;
    private final String bairro;
    private final String cep;
    private final String numero;

    public Endereco(String cidade, String estado, String pais, String rua, String complemento, String bairro, String cep, String numero)
    {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }
    public String getEndereco()
    {
        String aux = "";
        aux +="País: " + pais + "\n" ;
        aux += "Estado: " + estado + "\n";
        aux += "Cidade: " + cidade + "\n";
        aux += "Bairro: " + bairro + "\n";
        aux += "Rua: " + rua + "\n";
        aux += "Numero: " + numero + "\n";
        aux += "Complemento: " + complemento + "\n";
        aux += "CEP: " + cep + "\n";
        return aux;
    }

}
