package ExemploHeranca;

public class Mago extends Personagem {
    // Atributos (privados para garantir o encapsulamento)
    protected String escola;
    
    // Construtor Padrão
    public Mago() {
        this.nome = "Desconhecido";
        this.idade = 0;
        this.escola = "Nenhuma";
        System.out.println("Mago padrão criado!");
        this.inicializarAtributosPadrao();
    }

    // Construtor com Parâmetros (Sobrecarga)
    public Mago(String nome, int idade, String escola) {
        this.nome = nome;
        this.idade = idade;
        this.escola = escola;
        System.out.println("Mago " + nome + " criado com sucesso!");
        this.inicializarAtributosPadrao();
    }

    // Método privado: só pode ser chamado por outros métodos da classe
    private void inicializarAtributosPadrao()
    {
        this.pontosSaude = 100;
        this.vivo = true;
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

    // Método(s) de set (alterar valores dos atributos privados)
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    // Métodos(s) de get (retornam o valor/ref dos atributos)
    public int getPontosSaude()
    {
        return pontosSaude;
    }

    public void checarStatus() {
        super.checarStatus();
        System.out.println("Escola de magia: " + escola);
    }
}