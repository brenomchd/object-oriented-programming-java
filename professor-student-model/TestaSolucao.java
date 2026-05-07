// Aluno: Breno Machado Barros
// Matrícula: 202014607

public class TestaSolucao {
    public static void main(String[] args) {
        // Criação de um professor
        ProfessorUniversitario professor = new ProfessorUniversitario("Dr. Silva", 3, 5000) {
            @Override
            public Prova[] elaborarProvas() {
                String[] questoes = {"Questão 1", "Questão 2", "Questão 3"};
                Prova[] provas = { new Prova(questoes) };
                return provas;
            }

            @Override
            public double corrigirProva(Prova prova) {
                String[] respostasCorretas = {"Resposta 1", "Resposta 2", "Resposta 3"};
                String[] respostasAluno = prova.getRespostas();
                int acertos = 0;

                // Contar acertos
                for (int i = 0; i < respostasAluno.length; i++) {
                    if (respostasAluno[i].equals(respostasCorretas[i])) {
                        acertos++;
                    }
                }

                // Calcular a nota baseada nos acertos
                double nota = (acertos / (double) respostasCorretas.length) * 10;
                prova.setNota(nota);
                return nota;
            }
        };

        // Criação de um aluno
        Aluno aluno = new Aluno("Carlos", 12345);
        System.out.println(aluno.getNome() + " está matriculado com a matrícula: " + aluno.getnMatricula());

        // Elaborando a prova
        Prova[] provas = professor.elaborarProvas();
        Prova prova = provas[0];
        
        // Aluno fazendo a prova
        String[] respostasAluno = {"Resposta 1", "Resposta Errada", "Resposta 3"};
        aluno.fazerProva(prova);
        prova.setRespostas(respostasAluno);

        // Corrigindo a prova
        double notaFinal = professor.corrigirProva(prova);
        System.out.println("Nota final do aluno " + aluno.getNome() + ": " + notaFinal);

        // Exibindo nota da prova
        System.out.println("A nota registrada da prova é: " + prova.getNota());

        // Professor recebendo salário
        professor.receberSalario();
        System.out.println("Salário do professor: " + professor.getSalario());
    }
}
