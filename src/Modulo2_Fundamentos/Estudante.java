package Modulo2_Fundamentos;

import java.util.Date;

public class Estudante extends Pessoa{
    //aula 4 - Herança
    public Estudante(String _nome, String _cpf, String _endereco, String _RG, Date _data) {
        super(_nome, _cpf, _endereco, _RG, _data);
    }
    protected String matricula;

    //Aula 5 - Polimorfismo
    public double tirarCopias(int qtd){
        return 0.07 * (double) qtd;
    }
}
