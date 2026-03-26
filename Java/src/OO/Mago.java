public class Mago {
    // Atributos (privados para garantir o encapsulamento)
    private String nome;
    private int idade;
    private String escola;

    // Construtor Padrão
    public Mago() {
        this.nome = "Desconhecido";
        this.idade = 0;
        this.escola = "Nenhuma";
        System.out.println("Mago padrão criado!");
    }

    // Construtor com Parâmetros (Sobrecarga)
    public Mago(String nome, int idade, String escola) {
        this.nome = nome;
        this.idade = idade;
        this.escola = escola;
        System.out.println("Mago " + nome + " criado com sucesso!");
    }

    // Métodos (Comportamentos)
    public void andar() {
        System.out.println(nome + " está caminhando...");
    }

    public void falar() {
        System.out.println(nome + " diz: 'Pelas barbas de Merlin!'");
    }

    public void invocarMagia() {
        System.out.println(nome + " está invocando uma magia da escola " + escola + "!");
    }
}