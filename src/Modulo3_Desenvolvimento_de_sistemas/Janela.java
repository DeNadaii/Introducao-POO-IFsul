package Modulo3_Desenvolvimento_de_sistemas;

import javax.swing.*;

public class Janela {
    //aula 1 - Interface gráfica
    public static void main(String[] args) {
        final JFrame janela = new JFrame("titulo da janela");
        janela.setBounds(50,100,400,150);//seta posicao e tamanho
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
