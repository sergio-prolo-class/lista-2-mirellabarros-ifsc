package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Navio {

    public void desenhar(Draw draw, Grade grade, int tamanho, int x, char y, char orientacao) {
        // Define tamanho padrão dos quuadrados
        int TAM_PADRAO = 40;
        // Define a posição inicial do tabuleiro recebido
        int pos_x = x * TAM_PADRAO + grade.getX();
        int pos_y = (y - 65) * TAM_PADRAO + grade.getY();

        // Insere o navio na posição horizontal
        if (orientacao == 'H') {
            for (int i = TAM_PADRAO; i <= TAM_PADRAO * tamanho; i+= TAM_PADRAO) {
                // Define vermelho
                draw.setPenColor(153, 0, 0);
                // Preenche o espaço
                draw.filledRectangle(pos_x+i, pos_y+ TAM_PADRAO, (double) TAM_PADRAO /2, (double) TAM_PADRAO /2);
                // Define preto
                draw.setPenColor(0, 0, 0);
                // Preenche a borda do quadrado
                draw.rectangle(pos_x+i, pos_y+ TAM_PADRAO, (double) TAM_PADRAO /2, (double) TAM_PADRAO /2);
            }
        } else if (orientacao == 'V') { // Insere o navio na posição vertical
            for (int i = TAM_PADRAO; i <= TAM_PADRAO * tamanho; i+= TAM_PADRAO) {
                // Define vermelho
                draw.setPenColor(153, 0, 0);
                // Preenche o espaço
                draw.filledRectangle(pos_x+ TAM_PADRAO, pos_y+i, (double) TAM_PADRAO /2, (double) TAM_PADRAO /2);
                // Define preto
                draw.setPenColor(0, 0, 0);
                // Preenche a borda do quadrado
                draw.rectangle(pos_x+ TAM_PADRAO, pos_y+i, (double) TAM_PADRAO /2, (double) TAM_PADRAO /2);
            }
        }
    }
}
