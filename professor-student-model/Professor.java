// Aluno: Breno Machado Barros
// Matrícula: 202014607

public class Professor extends ProfessorUniversitario {

    // Construtor
    public Professor(String nome, int nTurmas, double salario) {
        super(nome, nTurmas, salario);
    }

    // Implementação do método elaborarProvas
    @Override
    public Prova[] elaborarProvas() {
        // Exemplo de implementação: criando uma prova com 3 questões
        String[] questoes = {"Qual é a capital do Brasil?", "Quem descobriu a América?", "Qual é a fórmula da água?"};
        Prova prova = new Prova(questoes);
        return new Prova[] { prova };
    }

    // Implementação do método corrigirProva
    @Override
    public double corrigirProva(Prova prova) {
        // Lógica simples de correção
        String[] respostasCorretas = {"Brasília", "Cristóvão Colombo", "H2O"};
        String[] respostasAluno = prova.getRespostas();
        int acertos = 0;

        // Comparar respostas do aluno com as respostas corretas
        for (int i = 0; i < respostasAluno.length; i++) {
            if (respostasAluno[i].equals(respostasCorretas[i])) {
                acertos++;
            }
        }

        // Calcular nota: cada acerto vale uma fração da nota máxima (10)
        double nota = (acertos / (double) respostasCorretas.length) * 10;
        prova.setNota(nota);
        return nota;
    }

    // Métodos herdados de ProfessorUniversitario podem ser utilizados diretamente, como getNome(), getSalario(), etc.
}
