
/*
Faça um programa em Java que gere um número aleatório inteiro entre 0 e 100 e solicite um número ao usuário. 
O objetivo é que o usuário acerte o número gerado. Se o número digitado for menor que o gerado, diga “MAIOR”, 
se for maior diga “MENOR”, e solicite um número ao usuário novamente. 
Repita este processo até que o usuário acerte o número gerado. Após isso, 
informe quantas tentativas o usuário fez até acertar.
*/

import java.util.Random;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {

        int ContadorTentativas = 0;

        Scanner scanner = new Scanner(System.in);
        int Valor;
        boolean Fim = true;
        Random Aleatario = new Random();
    
            int numero = aleatorio.nextInt(100);
    
            System.out.println(numero);
    
            while (fim) {
    
                System.out.println("\nTente acertar o número que eu escolhi de 0 à 100: ");
                valor = scanner.nextInt();
    
                contadorTentativas++;
    
                if (valor < numero) {
                    System.out.println("\nO valor que você digitou é menor que o valor que eu escolhi");
    
                } else if (valor > numero) {
                    System.out.println("\nO valor que você digitou é maior que o valor que eu escolhi");
    
                } else {
                    fim = false;
                    System.out.println(contadorTentativas);
                    System.out.println("\nParabéns! Você acertou o número");
                    scanner.close();
                }
    
                System.out.println("\nO número escolhido de 0 à 100 é " + numero + ", você tentou "
                        + contadorTentativas + " vezes\n");
        }
    }
}