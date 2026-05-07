// Aluno: Breno Machado Barros
// Matrícula: 202014607

public abstract class ProfessorUniversitario {
    private String nome;
    private int nTurmas;
    private double salario;

    public ProfessorUniversitario(String nome, int nTurmas, double salario) {
        this.nome = nome;
        this.nTurmas = nTurmas;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnTurmas() {
        return nTurmas;
    }

    public void setnTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract Prova[] elaborarProvas();

    public abstract double corrigirProva(Prova prova);

    public void receberSalario() {
        this.salario = nTurmas * 2000;
    }

    public void estudar() {
        System.out.println("O professor está estudando para aprimorar seus conhecimentos.");
    }
}