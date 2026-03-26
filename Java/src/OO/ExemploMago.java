public class ExemploMago {
    public static void main(String[] args) {
        // Usando construtor padrão
        Mago magoGenerico = new Mago();
        magoGenerico.andar();

        System.out.println("---");

        // Usando construtor com parâmetros
        Mago hp = new Mago("Harry Potter", 17, "Hogwarts");
        hp.andar();
        hp.falar();
        hp.invocarMagia();

        System.out.println("---");

        Mago g = new Mago("Gandalf",300,"Tolkien");
        g.andar();
        g.falar();
        g.invocarMagia();
    }
}
