package Modulo3_Desenvolvimento_de_sistemas;

import javax.swing.*;

public class TratadorExecao {
    public static void main(String[] args) {
        //aula 2 - Tratamento de exceções
        try{
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
            int r = n1/n2;
            JOptionPane.showMessageDialog(null,r,"Resultado",1);
        }
        catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(null,"digite somente numeros");
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"divisao por 0");
        }
    }
}
