
public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe");
        pequenoPrincipe.setQtdPaginas(98);

        System.out.println("\nO livro "+ pequenoPrincipe.getTitulo() +" possui "+ pequenoPrincipe.getQtdPaginas()+" páginas");

        pequenoPrincipe.setPaginasLidas(20);
        pequenoPrincipe.verificarProgresso();

        pequenoPrincipe.setPaginasLidas(50);
        pequenoPrincipe.verificarProgresso();

        Livro meuLivro = new Livro("Os 13 Porquês", 250, 240);
        System.out.println("\nO livro "+ meuLivro.getTitulo() +" possui "+ meuLivro.getQtdPaginas()+" páginas");

        meuLivro.setPaginasLidas(240);
        meuLivro.verificarProgresso();
    }
}