package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    public void desenhar(Draw draw, int x, int y) {

        // Monta a grade 10x10 com a posição inicial X e Y definida pelo usuário
        for (int i=40; i<=400; i+=40) {
            for (int j=40; j<=400; j+=40) {
                draw.rectangle(x+i, y+j, 20, 20);
            }
        }

        int numeros = 0; // Inicia a contagem em 0
        char letra = 65; // Inicia a contagem em A
        draw.setPenColor(153, 0, 0);

        // Acrescenta as letras e números à grade
        for (int i=40; i<=400; i+=40) {
            draw.text(x+i,y,Integer.toString(numeros));
            draw.text(x,y+i,Character.toString(letra));
            numeros++;
            letra++;
        }
    }
}
