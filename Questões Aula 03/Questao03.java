import java.util.Scanner;

//Faça um programa em Java que leia da entrada padrão a idade de 4096 pessoas e exiba quantas pessoas são maiores de idade.

public class Questao03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        int contagempessoas = 0;

        for (int i = 0; i < 4096; i++) {
            System.out.println("\n digite as idades das pessoas: ");
            idade = input.nextInt();

            if (idade >= 18) {
                contagempessoas = contagempessoas + 1;
            }
        }

        System.out.println("\n a quantidade de pessoas maiores de idade é de: " + contagempessoas + "\n");

        input.close();

    }
}