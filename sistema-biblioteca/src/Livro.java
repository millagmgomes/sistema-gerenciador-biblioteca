public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Este livro já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Este livro não foi emprestado.");
        }
    }

    public String getTitulo() { return titulo; }
    public boolean isEmprestado() { return emprestado; }
}
