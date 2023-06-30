package Modulo2_Fundamentos;

import java.util.Date;
//aula 1 - Classes e objetos
public class App {
    public static void main(String[] args) {
        Pessoa professora = new Pessoa("Andreia", "123.456.789.00","Rua X","14563",new Date());
        System.out.println(professora.nome);
        System.out.println(professora.cpf);
        System.out.println(professora.data_nascimento);

        //Aula 2 - Métodos e mensagens
        professora.alteraEndereco("rua y");
        System.out.println(professora.endereco);
    }
}
