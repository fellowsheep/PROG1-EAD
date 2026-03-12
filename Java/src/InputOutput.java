import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo em Java!");
        
        //Declaração de Variáveis
        int a;
        float b = -1.8f;
        double c = 3.14159;

        a = 5; //atribuição do valor 5 para variável a
        System.out.println("Valor de a: " + a);
        //Criação de nosso objeto Scanner para leitura de informações
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Valor de a: " + a);
    
    }
    
}
