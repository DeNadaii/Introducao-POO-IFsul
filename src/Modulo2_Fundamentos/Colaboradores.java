package Modulo2_Fundamentos;

import java.util.Date;

public class Colaboradores extends Pessoa{
    //aula 4 - Herança
    public Colaboradores(String _nome, String _cpf, String _endereco, String _RG, Date _data) {
        super(_nome, _cpf, _endereco, _RG, _data);
    }
    protected double salario;
    protected String funcao;
}
