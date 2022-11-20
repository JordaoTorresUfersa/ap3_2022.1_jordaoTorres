
import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) {
        
        Scanner inputNumero = new Scanner(System.in);
        Scanner inputTexto = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean sair = false;

        do {
            sair = menu(agenda, inputNumero, inputTexto);
        } while (!sair);

        inputNumero.close();
        inputTexto.close();
    }

    public static boolean menu(Agenda agenda, Scanner numero, Scanner texto) {
        
        int opcao = 0;

        try {
            System.out.println("1 - consulte um contato");
            System.out.println("2 - adicionar um contato");
            
            opcao = numero.nextInt();
        } catch (Exception e) {
            System.out.println("\nDado Inválido");
        }

        switch (opcao) {
            case 1:
                try {
                    System.out.println("\nImforme o indentificador do contato:");
                    int identificador = numero.nextInt();
                    agenda.consulta(identificador);
                } catch (Exception e) {
                    System.out.println("\nDado Inválido");
                }

                break;

            case 2:
                try {
                    System.out.println("\nImforme o nome do contato:");
                    String nome = texto.nextLine();
                    System.out.println("\nImforme o telefone do contato:");
                    String telefone = texto.nextLine();

                    agenda.adicionar(new Contato(nome, telefone));
                } catch (Exception e) {
                    System.out.println("\nDado Inválido");
                }
                break;
            default:
                return true;
        }
        return false;
    }
}