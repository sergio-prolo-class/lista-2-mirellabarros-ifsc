package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    private int x = 0;
    private int y = 0;

    public Grade(int x, int y) {
        if (x >= 40 && y >=40) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 40;
            this.y = 40;
        }
    }

    public void desenhar(Draw draw) {
        // Define tamanho padrão dos quuadrados
        int TAM_PADRAO = 40;

        // Monta a grade 10x10 com a posição inicial X e Y definida pelo usuário
        for (int i=TAM_PADRAO; i<=TAM_PADRAO*10; i+=TAM_PADRAO) {
            for (int j=TAM_PADRAO; j<=TAM_PADRAO*10; j+=TAM_PADRAO) {
                draw.rectangle(this.x+i, this.y+j, (double) TAM_PADRAO /2, (double) TAM_PADRAO /2);
            }
        }

        int numeros = 0; // Inicia a contagem em 0
        char letra = 65; // Inicia a contagem em A
        draw.setPenColor(153, 0, 0);

        // Acrescenta as letras e números à grade
        for (int i=TAM_PADRAO; i<=TAM_PADRAO*10; i+=TAM_PADRAO) {
            draw.text(this.x+i, this.y, Integer.toString(numeros));
            draw.text(this.x,this.y+i, Character.toString(letra));
            numeros++;
            letra++;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
