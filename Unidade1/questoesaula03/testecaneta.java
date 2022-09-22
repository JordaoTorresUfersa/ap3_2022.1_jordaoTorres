/*
Faça uma classe Caneta, que tem um modelo, uma cor, a numeração da ponta, 
o nível de tinta atual e se ela encontra-se tampada ou não. 
Escreva a classe TestaCaneta, que testa todas as funcionalidade da classe criada.
*/

public class testacaneta{
    public static void main(String[] args){
        Caneta CanetaVermelha = new Caneta();

        CanetaVermelha.setModelo("Hidrocor");
        CanetaVermelha.setCor("Verde");
        CanetaVermelha.setNumero(007);
        CanetaVermelha.setTinta(005);
        CanetaVermelha.setTampa(true);

        System.out.println(CanetaVermelha + "\n");

        CanetaVermelha.Destampar();
        System.out.println(CanetaVermelha + "\n");

        CanetaVermelha.fechar();
        System.out.println(CanetaVermelha + "\n");
    }
}