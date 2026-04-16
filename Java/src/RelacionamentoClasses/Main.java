package RelacionamentoClasses;
import java.util.Scanner;

public class Main {  //Classe gerenciadora da aplicação
    // Atributos 
    private static Scanner input;
    private static Magia magia;
    private static Mago mago;
    private static Item cajado, amuleto;

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
        mago = new Mago("Harry Potter");
        magia = new Magia("Bola de fogo");
        // Os itens são instanciados e existem FORA do Mago
        cajado = new Item("Cajado de Fogo", 5);
        amuleto = new Item("Amuleto de Água", 3);
    }

    private static void executar() {
        int opcao = 0;
        while (opcao != 7)
        {
            // Moestrar as opcoes para o usuario
            System.out.println("----- Menu de Opcoes -------");
            System.out.println("0 - Status dos objetos");
            System.out.println("1 - Mago: aprender magia");
            System.out.println("2 - Mago: lançar magia");
            System.out.println("3 - Mago: equipar item");
            System.out.println("4 - Mago: lançar magia forte");
            System.out.println("5 - Mago: desequipar item");
            System.out.println("6 - Mago: morrer");
            System.out.println("7 - Sair do programa");
            System.out.print("Digite a opcao: ");

            //Ler a opcao que o usuario quer
            input = new Scanner(System.in);
            opcao = input.nextInt();
            //Executar a opcao que o usuário escolheu
            if (opcao == 0) {
                imprimirStatusObjetos();
            }
            else if (opcao == 1) {
                if (mago!= null) mago.aprenderMagia(magia);
                else System.out.println("Mago não existe mais!");
            }
            else if (opcao == 2) {
                if (mago!= null) mago.lancarMagia();
                else System.out.println("Mago não existe mais!");
            }
            else if (opcao == 3){
                if (mago!= null) {
                    System.out.print("Qual item vc quer equipar? (c para cajado e a para amuleto)");
                    String opcaoItem = input.next();
                    if (opcaoItem.equals("c")) {
                        mago.equiparItem(cajado);
                    }
                    else if (opcaoItem.equals("a")) {
                        mago.equiparItem(amuleto);
                    }
                    else 
                    {
                        System.out.print("Opção Inválida!");
                    }
                }
                else System.out.println("Mago não existe mais!");
            }
            else if (opcao == 4){
                if (mago!= null) mago.lancarMagiaForte();
                else System.out.println("Mago não existe mais!");
            }
            else if (opcao == 5){
                
                if (mago!= null) mago.desequiparItem();
                else System.out.println("Mago não existe mais!");
            }
            else if (opcao == 6){
                mago = null;
                System.out.print("Oh noooo! Mago deixou de existir!");
            }
            else if (opcao == 7){
                System.out.print("Saindo do programa!");
            }
            else {
                System.out.print("Opção Inválida!");
            }
            System.out.println();
        }

    }

    private static void imprimirStatusObjetos()
    {
        if (mago != null) {
            mago.falar();
        }
        else {
            System.out.println("Mago não existe mais!");
        }

        if (magia != null){
            System.out.println("Magia continua existindo!");
        }
        else {
            System.out.println("Magia não existe mais!");
        }

        if (cajado != null){
            System.out.println("Cajado continua existindo!");
        }
        else {
            System.out.println("Cajado não existe mais!");
        }

        if (amuleto != null){
            System.out.println("Amuleto continua existindo!");
        }
        else {
            System.out.println("Amuleto não existe mais!");
        }

    }

    private static void finalizar() {
        System.out.println("Finalizando o programa....");

    }

    
    
}
