package Modulo3_Desenvolvimento_de_sistemas;

import javax.swing.*;
import java.awt.*;

public class Container {
    //aula 1 - Interface gráfica
    public static void main(String[] args) {
        int i;
        JFrame janela = new JFrame("titulo da janela");
        janela.setBounds(50,100,400,150);//seta posicao e tamanho
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        FlowLayout flow = new FlowLayout();//Define o layout do container
        java.awt.Container caixa = janela.getContentPane();//define o tamanho
        caixa.setLayout(flow);

        for (i = 1; i <= 8; i++){
            caixa.add(new JButton("Botao " + i));
        janela.setVisible(true);
        }
    }
}
