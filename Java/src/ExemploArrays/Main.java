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
    

    int[] vnumeros = {10, 20, 30};
    int soma = 0;
    
    for(i = 0; i<3; i++)
    {
        soma = soma + vnumeros[i];
        System.out.println("i = " + i + " vnumeros[" + i + "] = " + vnumeros[i] + " soma = " + soma);
    }

    int[] array = new int[15];
    int[] arrayPares = new int[15];
    int[] arrayImpares = new int[15];
    int nPares = 0, nImpares = 0;
    for (i = 0; i < array.length; i++)
    {
        array[i] = rand.nextInt(100);
        System.out.print(array[i] + " ");
        
        if (array[i] % 2 == 0) //se o resto da divisão for zero é par
        {
            arrayPares[nPares] = array[i];
            nPares = nPares + 1; //nPares++
        }
        else //se for impar
        {
            arrayImpares[nImpares] = array[i];
            nImpares = nImpares + 1; 
        }
    }
    System.out.println();

    System.out.println("Nro de pares: " + nPares);
    for(i = 0; i < nPares; i++)
    {
        System.out.print(arrayPares[i] + " ");
    }
    System.out.println();
    System.out.println("Nro de impares: " + nImpares);
    for(i = 0; i < nImpares; i++)
    {
        System.out.print(arrayImpares[i] + " ");
    }
     System.out.println();

    }
   
}
