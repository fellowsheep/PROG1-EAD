package EsqueletoAplicacao;
import java.util.Scanner;

public class Main {  //Classe gerenciadora da aplicação
    // Atributos 
    private static Scanner input;

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
    }

    private static void executar() {
        int opcao = 0;
        while (opcao != 3)
        {
            // Moestrar as opcoes para o usuario
            System.out.println("----- Menu de Opcoes -------");
            System.out.println("1 - Fazer tarefa 1");
            System.out.println("2 - Fazer tarefa 2");
            System.out.println("3 - Sair do programa");
            System.out.print("Digite a opcao: ");

            //Ler a opcao que o usuario quer
            input = new Scanner(System.in);
            opcao = input.nextInt();
            //Executar a opcao que o usuário escolheu
            if (opcao == 1){
                System.out.print("Realizando a tarefa 1");
            }
            else if (opcao == 2){
                System.out.print("Realizando a tarefa 2");
            }
            else if (opcao == 3){
                System.out.print("Saindo do programa!");
            }
            else {
                System.out.print("Opção Inválida!");
            }

        }

    }

    private static void finalizar() {
        System.out.println("Finalizando o programa....");

    }

    
    
}
