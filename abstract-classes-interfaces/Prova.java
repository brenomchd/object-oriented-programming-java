/**
 * A classe Prova representa uma prova aplicada em uma disciplina. Ela contém
 * as questões, as respostas fornecidas e a nota atribuída à prova.
 * 
 * @author [Breno Machado Barros]
 */
public class Prova {
    private String[] questoes;
    private String[] respostas;
    private double nota;

    /**
     * Construtor da classe Prova.
     * 
     * @param questoes Um array de questões que compõem a prova.
     */
    public Prova(String[] questoes) {
        this.questoes = questoes;
        this.respostas = new String[questoes.length];
        this.nota = 0.0;
    }

    /**
     * Obtém as questões da prova.
     * 
     * @return Um array de questões.
     */
    public String[] getQuestoes() {
        return questoes;
    }

    /**
     * Define as questões da prova.
     * 
     * @param questoes Um array de questões.
     */
    public void setQuestoes(String[] questoes) {
        this.questoes = questoes;
    }

    /**
     * Obtém as respostas fornecidas para as questões da prova.
     * 
     * @return Um array de respostas.
     */
    public String[] getRespostas() {
        return respostas;
    }

    /**
     * Define as respostas fornecidas para as questões da prova.
     * 
     * @param respostas Um array de respostas.
     */
    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    /**
     * Obtém a nota atribuída à prova.
     * 
     * @return A nota da prova.
     */
    public double getNota() {
        return nota;
    }

    /**
     * Define a nota atribuída à prova.
     * 
     * @param nota A nota da prova.
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
}
