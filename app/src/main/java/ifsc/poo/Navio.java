package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Navio {

    public void desenhar(Draw draw, int[] posicao, int tamanho, int x, char y, char orientacao) {

        int pos_x = x * 40 + posicao[0];
        int pos_y = (y - 65) * 40 + posicao[1];
        System.out.println(pos_x);
        System.out.println(pos_y);

        if (orientacao == 'H') {
            for (int i = 40; i <= 40 * tamanho; i+=40) {
                draw.setPenColor(153, 0, 0);
                draw.filledRectangle(pos_x+i, pos_y, 20, 20);
                draw.setPenColor(0, 0, 0);
                draw.rectangle(pos_x+i, pos_y, 20, 20);
            }
        } else if (orientacao == 'V') {
            for (int i = 40; i <= 40 * tamanho; i+=40) {
                draw.setPenColor(153, 0, 0);
                draw.filledRectangle(pos_x, pos_y+i, 20, 20);
                draw.setPenColor(0, 0, 0);
                draw.rectangle(pos_x, pos_y+i, 20, 20);
            }
        }
    }
}
