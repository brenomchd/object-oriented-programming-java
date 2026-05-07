/**
 * A classe abstrata ProfessorUniversitario representa um professor que leciona
 * em uma universidade. Ela contém informações como nome, número de turmas e
 * salário, além de métodos relacionados a essas informações e à atividade de
 * ensino.
 * 
 * @author [Breno Machado Barros]
 */
public abstract class ProfessorUniversitario {
    private String nome;
    private int nTurmas;
    private double salario;

    /**
     * Construtor da classe ProfessorUniversitario.
     * 
     * @param nome    O nome do professor universitário.
     * @param nTurmas O número de turmas que o professor leciona.
     * @param salario O salário do professor.
     */
    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        this.nome = nome;
        this.nTurmas = nTurmas;
        this.salario = salario;
    }

    /**
     * Obtém o nome do professor universitário.
     * 
     * @return O nome do professor.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do professor universitário.
     * 
     * @param nome O novo nome do professor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de turmas que o professor leciona.
     * 
     * @return O número de turmas.
     */
    public int getnTurmas() {
        return nTurmas;
    }

    /**
     * Define o número de turmas que o professor leciona.
     * 
     * @param nTurmas O novo número de turmas.
     */
    public void setnTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }

    /**
     * Obtém o salário do professor universitário.
     * 
     * @return O salário do professor.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do professor universitário. Esse método é protegido, pois o
     * salário só deve ser modificado internamente na classe ou em suas subclasses.
     * 
     * @param salario O novo salário do professor.
     */
    protected void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método abstrato para elaboração de provas. Deve ser implementado pelas
     * subclasses.
     * 
     * @return Um array de provas elaboradas.
     */
    public abstract Prova[] elaborarProvas();

    /**
     * Método abstrato para correção de uma prova. Deve ser implementado pelas
     * subclasses.
     * 
     * @param prova A prova a ser corrigida.
     * @return A nota obtida na correção da prova.
     */
    public abstract double corrigirProva(Prova prova);

    /**
     * Calcula e atribui o salário do professor com base no número de turmas que ele
     * leciona. O salário é calculado como R$2000,00 por turma.
     */
    public void receberSalario() {
        this.salario = nTurmas * 2000;
    }

    /**
     * Exibe uma mensagem indicando que o professor está estudando para aprimorar
     * seus conhecimentos.
     */
    public void estudar() {
        System.out.println("O professor está estudando para aprimorar seus conhecimentos.");
    }
}
