package org.example;

public class Piloto extends Funcionario {
    public Piloto (String identificador, String nome, String idade)
    {
        super(identificador, nome, idade);
    }

    @Override
    public String getDados() {
        return super.getDados() + "\n" + getID() + "\n";
    }
}
