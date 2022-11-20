
public class A1_TudoMaiusculo {
  public static void main(String args[]) {
    
    String frase = null;
    String novaFrase = null;

    try {
        novaFrase = frase.toUpperCase();

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);      
    } catch (Exception e) {
        System.out.println("A frase inicial está nula. Foi atribuito o valor FraseVazia.");
    }
  }
}