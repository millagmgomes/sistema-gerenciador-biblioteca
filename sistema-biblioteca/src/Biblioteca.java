import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro cadastrado: " + membro.getNome());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("\n📚 Livros disponíveis:");
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(" - " + livro.getTitulo());
            }
        }
    }

    public List<Livro> getLivros() { return livros; }
    public List<Membro> getMembros() { return membros; }
}
