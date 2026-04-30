import java.util.Scanner;

public class Main {  //Classe gerenciadora da aplicação
    // Atributos 
    private static Scanner input;
    private static MagoBranco mb;
    private static Mago2 m, m2;

    // Métodos
    // Entry Point- método main -- APENAS 1 por programa
    public static void main(String[] args) {
        // inicializar a aplicação (inicializar os objetos que ela contém)
        inicializar();
        // Loop principal (execução do programa)
        // O programa roda dentro do loop até o usuário querer sair
        executar();

        // finalização da aplicação (salvamento de dados etc...)
        finalizar();


    }

    private static void inicializar() {
        System.out.println("Iniciando o programa....");
        mb = new MagoBranco("Gandalf",300,"A");
        m = new Mago2("Harry Potter",17,"Hogwarts");
        //Polimorfismo: conceito de upcasting
        m2 = new MagoBranco("Saruman",400,"A");
    }

    private static void executar() {
        mb.falar();
        m.falar();
        mb.curar();
        //m.curar();
        m2.falar();
        m2.andar();
        m2.invocarMagia();
        //m2.curar();
        //Resolve-se com  um downcasting
        MagoBranco tmp = (MagoBranco) m2;
        tmp.curar();

        m.checarStatus();
        mb.checarStatus();
        m2.checarStatus();
        

    }

    private static void finalizar() {
        System.out.println("Finalizando o programa....");

    }

    
    
}
