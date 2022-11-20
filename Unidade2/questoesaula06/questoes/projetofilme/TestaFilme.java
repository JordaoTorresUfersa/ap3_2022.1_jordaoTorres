
public class TestaFilme {
    public static void main(String[] args) throws Exception {
        Filme umFilmeQualquer = new Filme("Os Vingadores", 142);
        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("A Lagoa azul", 100);
        meuFilmeFavorito.setDuracaoEmMinutos(108);
        meuFilmeFavorito.exibirDuracaoEmHoras();

        System.out.println("\nOs filmes no catálogo são " + umFilmeQualquer.getTitulo() + " e " + meuFilmeFavorito.getTitulo());
    }
}