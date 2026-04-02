public class ExemploMago {
    public static void main(String[] args) {
        // Usando construtor padrão
        Mago magoGenerico = new Mago();
        magoGenerico.andar();
        // magoGenerico.nome = "Frieren"; ERRADO! Atributo nome é privado
        magoGenerico.setNome("Frieren");
        magoGenerico.falar();
        System.out.println("Pontos de saúde:" + magoGenerico.getPontosSaude());
        int ptsSaudeEquipe = 0;
        ptsSaudeEquipe += magoGenerico.getPontosSaude(); //pode armazenar o valor em uma variável local
        // magoGenerico.inicializarAtributosPadrao(); ERRADO! Este método é privado!

        System.out.println("---");

        // Usando construtor com parâmetros
        Mago hp = new Mago("Harry Potter", 17, "Hogwarts");
        hp.andar();
        hp.falar();
        hp.invocarMagia();

        System.out.println("---");

        Mago g = new Mago("Gandalf",300,"Istari");
        g.andar();
        g.falar();
        g.invocarMagia();
    }
}
