import java.util.Scanner;
//Sabendo que latão é constituído de 70% de cobre e 30% de zinco, faça um programa 
//em Java que indiquea quantidade de cada um desses componentes para se obter uma 
//certa quantidade de latão (a quantidade deve ser requerida do usuário).

public class Questao01 {

    public static void main(String[] args) {
        Scanner valorDesejado = new Scanner(System.in);
        Double QuantidadeDeLatao;

        System.out.println("\n Digite a qt de latão desejada:  ");
        QuantidadeDeLatao = valorDesejado.nextDouble();

        System.out.println("A quantidade de cobre necessária é de  " + QuantidadeDeLatao * 0.7);

        System.out.println("A quantidade de zinco necessária é de  " + QuantidadeDeLatao * 0.3);

        valorDesejado.close();
        
    }
}