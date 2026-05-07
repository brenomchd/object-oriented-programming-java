// Aluno: Breno Machado Barros
// Matrícula: 202014607

public class Aluno {
    private String nome;
    private int nMatricula;

    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public void fazerProva(Prova prova) {
        System.out.println("O aluno " + nome + " está fazendo a prova.");
    }

    public void estudar() {
        System.out.println("O aluno " + nome + " está estudando.");
    }
}