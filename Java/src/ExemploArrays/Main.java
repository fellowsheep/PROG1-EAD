package ExemploArrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 4, 3, 2, 1};
        double[] valores = new double[5];
        System.out.println(numeros[0]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        //numeros[1] = -12;
        System.out.println(numeros[1]);
        System.out.println("------------");
        for (int i=0; i<5;i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int i=4; i >=0; i--){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        Random rand = new Random();
    
    for (int i=0; i<5;i++) {
        valores[i] = rand.nextDouble();
        System.out.print(valores[i] + " ");
    }

    int i =0;
    Boolean achou = false;

    while (i < 5 && achou == false)
    {
        if (numeros[i] == 3)
        {
            achou = true;
            System.out.println("Achou o valor 3");

        }
        i++;
    }
    System.out.println();
    }

    
    
}
