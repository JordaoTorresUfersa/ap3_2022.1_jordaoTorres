/*
Considere as informações de um funcionário: nome completo, idade, cargo e salário bruto.
Há um desconto de 15% sobre o salário bruto para formar o salário líquido.
Escreva uma classe Funcionario.java que tenha os métodos necessários para executar um programa 
que exibe na saída padrão o nome, a idade, o cargo, o salário bruto, o salário líquido e o salário líquido anual.
Faça métodos assessores (getters e setters), e o construtor adequado para todos os atributos.
Faça outra classe TestaFuncionario.java com três funcionários distintos. 
O usuário deverá preencher os dados dos três funcionários.
*/

public class Funcionario {
    
    private String nome;
    private int idade;
    private String cargo;
    private double salarioBruto;

    public Funcionario(String nome, int idade, String cargo, double salarioBruto) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCarco() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalario(double salario) {
        this.salarioBruto = salario;
    }

    public double getSalarioLiquido() {
        return this.salarioBruto * 0.85;
    }
    public double getSalarioAnual() {
        return this.salarioBruto * 12;
    }
    @Override
    public String toString() {
        return  "Funcionário = ["      +
        "Nome = "               + nome              + ", " +
        "Idade = "              + idade             + ", " +
        "Cargo = "              + cargo             + ", " +
        "salário Bruto = "      + salarioBruto      + ", " +
        "salário Liquído = "    + getSalarioLiquido()  + ", " +
        "salário Anual = "      + getSalarioAnual()    + "]"; 
    }
}