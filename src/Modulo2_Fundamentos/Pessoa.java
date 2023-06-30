package Modulo2_Fundamentos;

import java.util.Date;

public class Pessoa {
    //aula 1 - Classes e objetos
    //Aula 3 - Encapsulamento
    protected String nome;
    protected String cpf;
    public String endereco;
    protected String RG;
    public Date data_nascimento;

    public Pessoa(String _nome, String _cpf, String _endereco, String _RG, Date _data){
        this.nome = _nome;
        this.cpf = _cpf;
        this.endereco = _endereco;
        this.RG = _RG;
        this.data_nascimento = _data;
    }
    //Aula 2 - Métodos e mensagens
    public void alteraEndereco(String novoEndereco){
        this.endereco = novoEndereco;
    }
    public void  validarCPF(String CPF){
        // CODIGO PARA VALIDAR CPF
    }
    //Aula 3 - Encapsulamento
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //Aula 5 - Polimorfismo
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public double tirarCopias(int qtd){
        return 0.15 * (double) qtd;
    }
}
