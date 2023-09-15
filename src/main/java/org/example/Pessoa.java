package org.example;

abstract class Pessoa {

    private  String identificador;
    private  String nome;
    private  String idade;
    private Endereco endereco;
    private String telefone;
    private String contatoDeEmergencia;


    public Pessoa(String identificador, String nome, String idade)
    {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
    }
    public String getDados()
    {
        return identificador+ "\n" + nome + "\n"+ idade + "\n";
    }



}
