package org.example;

import java.net.IDN;

public class Funcionario extends Pessoa{
    private int IDFUNCIONARIO;
    private static int auxID = 1001;

    public Funcionario(String identificador, String nome, String idade)
    {
        super(identificador, nome, idade);
        IDFUNCIONARIO =  auxID;
        auxID++;
    }
    public int getID()
    {
        return IDFUNCIONARIO;
    }


}
