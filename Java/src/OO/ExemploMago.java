public class ExemploMago {
    public static void main(String[] args) {
        // Usando construtor padrão
        Mago2 magoGenerico = new Mago2();
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
        Mago2 hp = new Mago2("Harry Potter", 17, "Hogwarts");
        hp.andar();
        hp.falar();
        hp.invocarMagia();

        System.out.println("---");

        Mago2 g = new Mago2("Gandalf",300,"Istari");
        g.andar();
        g.falar();
        g.invocarMagia();
    }
}
