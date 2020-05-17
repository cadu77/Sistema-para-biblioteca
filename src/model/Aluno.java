package model;

public class Aluno {

    private int rm;
    private String data_cadastro;
    private String nome;
    private String dataNasc;
    private String sexo;
    private String email;
    private String endereco;
    private String fone;
    private String curso;
    private String modulo;

    public Aluno(int rm, String data_cadastro, String nome, String dataNasc, String sexo, String email, String endereco, String fone, String curso, String modulo) {
        this.rm = rm;
        this.data_cadastro = data_cadastro;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.fone = fone;
        this.curso = curso;
        this.modulo = modulo;
    }

    public Aluno() {
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
