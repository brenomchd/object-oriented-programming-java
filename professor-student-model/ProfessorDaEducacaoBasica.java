// Aluno: Breno Machado Barros
// Matrícula: 202014607

public class ProfessorDaEducacaoBasica extends ProfessorUniversitario {

    public ProfessorDaEducacaoBasica(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    @Override
    public Prova[] elaborarProvas() {
        String[] questoes = {"Qual é a cor do céu?", "Quanto é 2 + 2?", "Qual é o nome do nosso planeta?"};
        Prova prova = new Prova(questoes);
        return new Prova[] { prova };
    }

    @Override
    public double corrigirProva(Prova prova) {
        String[] respostasCorretas = {"Azul", "4", "Terra"};
        String[] respostasAluno = prova.getRespostas();
        int acertos = 0;

        for (int i = 0; i < respostasAluno.length; i++) {
            if (respostasAluno[i].equalsIgnoreCase(respostasCorretas[i])) {
                acertos++;
            }
        }

        double nota = (acertos / (double) respostasCorretas.length) * 10;
        prova.setNota(nota);
        return nota;
    }

    public void receberSalario() {
        setSalario(getnTurmas() * 1500);
    }
}