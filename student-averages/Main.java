import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] medias = new float[5];
        float totalMedia = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite as três notas do aluno " + (i + 1) + ": ");
            float n1 = scanner.nextFloat();
            float n2 = scanner.nextFloat();
            float n3 = scanner.nextFloat();

            medias[i] = (n1 + n2 + n3) / 3;
            totalMedia += medias[i];

            System.out.println("A média do aluno " + (i + 1) + " é " + medias[i]);
        }

        System.out.println("A média total da turma é: " + (totalMedia / 5));
        scanner.close();
    }
}