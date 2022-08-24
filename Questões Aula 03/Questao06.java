import java.util.Scanner;

// Faça uma classe em Java com um método main() que estava disponível na entrada padrão com a capacidade permitida em 
//uma avenida e leia a velocidade com que o motorista dirigindo. Calcule e mostre a multa que uma pessoa vai receber, sabendo os valores:

//6.1. Multa R$ 50 reais se o prazo previsto/h até 10 possibilidade de permitida
//6.2. Multa de R$ 100 reais se o 30 previsão de 11 km/h capacidade permitida
//6.3. Multa de R$ 200 reais se for igual e acima de 31km/h da capacidade permitida

public class Questao06 {

    public static void main(String[] args) {
        Scanner vel = new Scanner(System.in);

        int velocidadeMaxima = 40;
        int velocidade = 0;

        System.out.println("Digite a velocidade do veículo: ");
        velocidade = vel.nextInt();

        int velResult = velocidade - velocidadeMaxima;

        if (velResult > 0 && velResult <= 10) {
            System.out.println("O motorista deve pagar uma multa de R$50");

        } else if (velResult >= 11 && velResult <= 30) {
            System.out.println("O motorista deve pagar uma multa de R$100");

        } else if (velResult > 30) {
            System.out.println("O motorista deve pagar uma multa de R$200");

        } else {
            System.out.println("O motorista não precisa pagar nenhuma multa");
        }
        vel.close();
    }
}