package ExemploHeranca;
public class MagoBranco extends Mago {

    private int poderCura;

    public MagoBranco(String nome, int idade, String escola) {
        super(nome,idade,escola);
        poderCura = 10;
    }

    // Reecrita do método falar
    public void falar()
    {
        super.falar();
        System.out.println("Eu sou o mago branco " + nome + "!!!");
    }

    // Método da classe especializada (apenas MagoBranco tem)
    public void curar()
    {
        System.out.println("Estou curando com poder de cura " + poderCura);
    }

    // Reescrita do método invocarMagia
    public void invocarMagia() {
        System.out.println(nome + " está invocando a magia dos Magos Brancos!");
    }

     public void checarStatus() {
        super.checarStatus();
        System.out.println("Poder de cura: " + poderCura);
    }


    
}
