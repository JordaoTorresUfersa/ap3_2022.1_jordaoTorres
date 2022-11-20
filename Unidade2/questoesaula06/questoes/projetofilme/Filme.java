

public class Filme {
    
    private String titulo;
    private int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras(){
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("\nO filme " + this.titulo + " possui " + horas + " horas" + " e " + minutos + " minutos");
    }
}