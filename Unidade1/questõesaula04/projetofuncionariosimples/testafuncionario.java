import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        String cargo;
        double salarioBruto;

        List<Funcionario> funcionarios = new ArrayList<>();

        while(funcionarios.size() <3){
        System.out.println("\nDigite o nome do novo funcionário: ");
        nome = entrada.next();

        System.out.println("\nDigite a idade do novo funcioário ");
        idade = entrada.nextInt();

        System.out.println("\nDigite o cargo do novo funcioário: ");
        cargo = entrada.next();

        System.out.println("\nDigite o sálario bruto do novo funcioário ");
        salarioBruto = entrada.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, cargo, salarioBruto);

        funcionarios.add(funcionario);
        }

        funcionarios.forEach(System.out::println);
        entrada.close();
    }
}