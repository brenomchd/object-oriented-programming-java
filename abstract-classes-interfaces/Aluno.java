/**
 * A classe Aluno representa um aluno com nome e número de matrícula. Ela contém
 * métodos para o aluno realizar ações como fazer uma prova e estudar.
 * 
 * @author [Breno Machado BarrosS]
 */
public class Aluno {
    private String nome;
    private int nMatricula;

    /**
     * Construtor da classe Aluno.
     * 
     * @param nome       O nome do aluno.
     * @param nMatricula O número de matrícula do aluno.
     */
    public Aluno(String nome, int nMatricula) {
        this.nome = nome;
        this.nMatricula = nMatricula;
    }

    /**
     * Obtém o nome do aluno.
     * 
     * @return O nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno.
     * 
     * @param nome O novo nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de matrícula do aluno.
     * 
     * @return O número de matrícula.
     */
    public int getnMatricula() {
        return nMatricula;
    }

    /**
     * Define o número de matrícula do aluno.
     * 
     * @param nMatricula O novo número de matrícula.
     */
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    /**
     * O aluno realiza uma prova específica.
     * 
     * @param prova A prova que o aluno está fazendo.
     */
    public void fazerProva(Prova prova) {
        System.out.println("O aluno " + nome + " está fazendo a prova.");
    }

    /**
     * O aluno estuda para suas disciplinas.
     */
    public void estudar() {
        System.out.println("O aluno " + nome + " está estudando.");
    }
}
