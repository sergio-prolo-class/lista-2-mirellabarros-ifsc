# Mirella Barros

## Classe Grade

### public Grade(int x, int y)
Método construtor que recebe 2 valores inteiros referentes à posição X e Y do tabuleiro no espaço.

### Parâmetros
**y** - valor inteiro referente à coordenada vertical.

**x** - valor inteiro referente à coordenada horizontal.

### public void desenhar(Draw draw)
Método para desenhar um tabuleiro 10x10 de acordo com as coordenadas informadas 
durante a construção do objeto Grade.

### Parâmetros
**draw** - objeto Draw.

## Classe Navio

### public void desenhar(Draw draw, Grade grade, int tamanho, int x, char y, char orientacao)
Método para desenhar um navio no tabuleiro.

### Parâmetros
**draw** - objeto Draw.

**grade** - objeto Grade.

**tamanho** - valor inteiro referente ao tamanho do navio.

**x** - valor inteiro referente à coordenada na posição horizontal do tabuleiro.

**y** - valor do tipo char referente a posição vertical do tabuleiro
orientação - valor do tipo char. 'V' para vertical e 'H' horizontal.