import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class testacontato {
    public static void main(String[] args) throws Exception {
        Scanner entradaPadrao = new Scanner(System.in);

        String nome;
        String email;
        String telefone;
        String dataDeNascimento;

        List<contato> osContatos = new ArrayList<>();

        while (osContatos.size() < 5) {
            System.out.println("\nDigite o nome do novo contato: ");
            nome = entradaPadrao.nextLine();

            System.out.println("\nDigite o email do novo contato: ");
            email = entradaPadrao.nextLine();

            System.out.println("\nDigite o telefone do novo contato: ");
            telefone = entradaPadrao.nextLine();

            System.out.println("\nDigite a data de nascimento do novo contato neste formato (22/09/2022): ");
            dataDeNascimento = entradaPadrao.next();

            contato contato = new contato(nome, email, telefone,
                    LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            osContatos.add(contato);
        }

        osContatos.forEach(System.out::println);
        /*
        for (Contato contato : osContatos) {
            System.out.println(contato);
        }
        */
        entradaPadrao.close();
    }
}