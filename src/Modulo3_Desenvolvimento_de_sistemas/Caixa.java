package Modulo3_Desenvolvimento_de_sistemas;

public class Caixa<T> {
    //aula 5 - Tipos Genéricos
    //<T> pode ser qualquer tipo, incluindo nao primitivos
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        Caixa<Integer> integerCaixa = new Caixa<Integer>();
        Caixa<String> stringCaixa = new Caixa<String>();

        integerCaixa.add(10);
        stringCaixa.add(new String("alo mundo"));

        System.out.printf("valor inteiro: %d\n", integerCaixa.get());
        System.out.printf("valor String: %s\n", stringCaixa.get());
    }
}
