package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    private int x;
    private int y;

    public Grade(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw) {

        // Monta a grade 10x10 com a posição inicial X e Y definida pelo usuário
        for (int i=40; i<=400; i+=40) {
            for (int j=40; j<=400; j+=40) {
                draw.rectangle(this.x+i, this.y+j, 20, 20);
            }
        }

        int numeros = 0; // Inicia a contagem em 0
        char letra = 65; // Inicia a contagem em A
        draw.setPenColor(153, 0, 0);

        // Acrescenta as letras e números à grade
        for (int i=40; i<=400; i+=40) {
            draw.text(this.x+i, this.y, Integer.toString(numeros));
            draw.text(this.x,this.y+i, Character.toString(letra));
            numeros++;
            letra++;
        }
    }

    public int[] posicao() {
        int[] posicao = new int[2];
        posicao[0] = this.x;
        posicao[1] = this.y;
        return posicao;
    }
}
