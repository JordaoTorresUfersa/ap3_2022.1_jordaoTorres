
import java.util.Scanner;

// Escreva um programa em Java para ler o nome e a idade de uma pessoa. Exiba quantos dias de vida ela possui. 
//Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de
//  vida Um exemplo de saída: "MARIA, VOCÊ JÁ VIVEU 6935 DIAS!"

public class Questao02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        int ano = 365;

        System.out.println("\n digite o seu nome: ");
        nome = input.nextLine();

        System.out.println("\n digite sua idade:");
        idade = input.nextInt();

        System.out.println( nome + ", VOCÊ JÁ VIVEU " + idade * ano + " DIAS!");

        input.close();
    }
}