import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private String idMembro;
    private List<Livro> livrosEmprestados;

    public Membro(String nome, String idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Este livro não foi emprestado por este membro.");
        }
    }

    public String getNome() { return nome; }
    public List<Livro> getLivrosEmprestados() { return livrosEmprestados; }
}
