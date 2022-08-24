import java.util.Scanner;

//Escreva um programa em Java que lê um vetor osValores(30) de inteiros. Substitua, a seguir, todos os valores iguais a 7 por -7. Escreva o vetor resultante.

public class Questao04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vet[] = new int[30];

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Insira um valor:");
            vet[i] = input.nextInt();
        }

        for (int i = 0; i < valor.length; i++) {
            if (vet[i] == 7) {
                vet[i] = -7; }
        }

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Resultado: " + vet[i]);
        }

        input.close();

    }
}