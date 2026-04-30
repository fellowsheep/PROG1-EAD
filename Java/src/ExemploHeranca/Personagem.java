package ExemploHeranca;

// Esta classe foi criada apenas para exemplificar herança multinível
// Personagem --> Mago --> MagoBranco

public class Personagem {
    protected String nome;
    protected int idade;
    protected int pontosSaude;
    protected boolean vivo;

    public void checarStatus() {
       System.out.println( "Nome: " + nome); 
       System.out.println( "Idade: " + idade);
       System.out.println( "Pontos de Saúde: " + pontosSaude);
       System.out.println( "Esta vivo?: " + vivo);
    }
    
}
