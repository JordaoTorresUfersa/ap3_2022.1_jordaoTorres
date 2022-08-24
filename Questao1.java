import java.util.Scanner;
/*Sabendo que latão é constituído de 70% de cobre e 30% de zinco, faça um programa em Java que indique
a quantidade de cada um desses componentes para se obter uma certa quantidade de latão (a quantidade deve ser requerida do usuário).
        cobre = 0.7;
        zinco = 0.3;
*/

public class Questao1 {

    public static void main(String[] args) {
        Scanner valorDesejado = new Scanner(System.in);
        Double Latao;

        System.out.println(x); (" Digite a quantidade de latão desejada: ");
        Latao = valorDesejado.nextDouble();

        System.out.println("Quantidade de zinco necessaria é de " + Latao * 0.3);

        System.out.println("Quantidade de cobre necessaria é de " + Latao * 0.7);

        valorDesejado.close();
    }
}