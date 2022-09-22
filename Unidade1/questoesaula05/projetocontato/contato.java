
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class contato {
    
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;

    public contato(String nome, String email, String telefone, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setIEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDadaDeNascimento(LocalDate datadeNascimento) {
        this.dataDeNascimento = datadeNascimento;
    }
    
    @Override
    public String toString() {
        return  "Contatos"             +
        "\nNome = "                    + nome                 +
        "\nEmail = "                   + email                +
        "\nTelefone = "                + telefone             +
        "\nData de Nascimento = "      + dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"; 
    }
}