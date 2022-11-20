public class Pessoa{
    String nome;
    int idade;

    String getNome(){
        return nome;
    }
    int getIdade(){
        return idade;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    @Override
    public String toString() {
        return nome +"\n" + idade;
    }
}