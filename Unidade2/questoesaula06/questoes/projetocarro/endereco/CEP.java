package endereco;

public class CEP {

    public int primeiraParte;
    public int segundaParte;

    public CEP(int primeiraParte, int segundaParte) {
        this.primeiraParte = primeiraParte;
        this.segundaParte = segundaParte;
    }

    public boolean isValido(){
        return false;
    }

    public int getPrimeiraParte() {
        return primeiraParte;
    }

    public void setPrimeiraParte(int primeiraParte) {
        this.primeiraParte = primeiraParte;
    }

    public int getSegundaParte() {
        return segundaParte;
    }

    public void setSegundaParte(int segundaParte) {
        this.segundaParte = segundaParte;
    }

    @Override
    public String toString() {
        return "CEP: " + primeiraParte + " - " + segundaParte;
    }
}