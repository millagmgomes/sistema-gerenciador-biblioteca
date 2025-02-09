public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Clean Code", "Robert C. Martin", "123456");
        Livro livro2 = new Livro("Java: Como Programar", "Deitel & Deitel", "654321");

        Membro membro1 = new Membro("Milla Gomes", "001");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarMembro(membro1);

        biblioteca.listarLivrosDisponiveis();

        membro1.emprestarLivro(livro1);
        biblioteca.listarLivrosDisponiveis();

        membro1.devolverLivro(livro1);
        biblioteca.listarLivrosDisponiveis();
    }
}






