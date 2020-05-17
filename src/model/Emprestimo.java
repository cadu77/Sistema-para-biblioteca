package model;

public class Emprestimo {

    private int id_emprestimo;
    private int rm_aluno;
    private int id_livro;
    private String exemplar;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo() {
    }

    public Emprestimo(int id_emprestimo, int rm_aluno, int id_livro, String exemplar, String data_emprestimo, String data_devolucao) {
        this.id_emprestimo = id_emprestimo;
        this.rm_aluno = rm_aluno;
        this.id_livro = id_livro;
        this.exemplar = exemplar;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public int getRm_aluno() {
        return rm_aluno;
    }

    public void setRm_aluno(int rm_aluno) {
        this.rm_aluno = rm_aluno;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

}
