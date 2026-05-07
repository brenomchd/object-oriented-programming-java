/**
 * Classe demonstrativa para manipulação de arquivos.
 * Contém exemplos de leitura, escrita e manipulação de streams.
 *
 * @author Breno Machado Barros - 202014607
 * @author Gustavo Rodrigues Ribeiro - 202003570
 */

package arquivo1;

import java.io.*;

public class Arquivos1 {

    public static void main(String args[]) {
        //exemplo1();
        //exemplo2();
        //exemplo3();
        //exemplo4();
        //exemplo5();
        exemplo6();
    }

    /**
     * Exemplo 1: Criação de diretórios e arquivos.
     * Verifica a existência de pastas/arquivos e os cria se necessário.
     */
    public static void exemplo1() {
        File pasta = new File("nova_pasta");
        if (!pasta.exists() || !pasta.isDirectory()) {
            pasta.mkdir();
            System.out.println("Não encontrei esta pasta, então criei em " + pasta.getAbsolutePath());
        }

        File outraPasta = new File(pasta, "outra_pasta");
        outraPasta.mkdir();

        File umArquivo = new File(pasta, "meu_arquivo.txt");
        try {
            // Tenta criar o arquivo
            umArquivo.createNewFile();
        } catch (IOException e) {
            // Caso ocorra um erro ao criar o arquivo, imprime a mensagem de erro e a pilha de execução
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Exemplo 2: Leitura de caracteres de um arquivo.
     * Lê o primeiro caractere de um arquivo chamado "arquivo.txt".
     */
    public static void exemplo2() {
        InputStream fluxo = null;
        InputStreamReader leitor = null;

        try {
            // Abre o arquivo para leitura
            fluxo = new FileInputStream("arquivo.txt");
            leitor = new InputStreamReader(fluxo);

            // Lê o primeiro caractere do arquivo
            char c = (char) leitor.read();
            System.out.println("Caractere lido: " + c);
        } catch (FileNotFoundException e) {
            // Captura o erro caso o arquivo não seja encontrado
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            // Captura erros de entrada/saída
            System.err.println("Erro de I/O: " + e.getMessage());
        } finally {
            try {
                // Tenta fechar os streams abertos
                if (leitor != null) leitor.close();
                if (fluxo != null) fluxo.close();
            } catch (IOException e) {
                // Trata possíveis erros ao fechar os streams
                System.err.println("Erro ao fechar streams: " + e.getMessage());
            }
        }
    }

    /**
     * Exemplo 3: Leitura com buffer utilizando o padrão Decorator.
     * Mostra o uso de InputStreamReader e BufferedReader.
     */
    public static void exemplo3() {
        InputStream fluxo = null;
        InputStreamReader leitor = null;
        BufferedReader leitorComBuffer = null;

        try {
            // Abre o arquivo para leitura
            fluxo = new FileInputStream("arquivo.txt");
            leitor = new InputStreamReader(fluxo);
            leitorComBuffer = new BufferedReader(leitor);

            // Lê o arquivo linha por linha
            String linha;
            while ((linha = leitorComBuffer.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            // Captura o erro caso o arquivo não seja encontrado
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            // Captura erros de entrada/saída
            System.err.println("Erro de I/O: " + e.getMessage());
        } finally {
            try {
                // Tenta fechar o BufferedReader
                if (leitorComBuffer != null) leitorComBuffer.close();
            } catch (IOException e) {
                // Trata possíveis erros ao fechar o BufferedReader
                System.err.println("Erro ao fechar BufferedReader: " + e.getMessage());
            }
        }
    
    }

     public static void exemplo4() {
        InputStreamReader leitor = null;
        BufferedReader leitorComBuffer = null;

        try {
            // Usa o System.in como fluxo de entrada
            leitor = new InputStreamReader(System.in);
            leitorComBuffer = new BufferedReader(leitor);

            System.out.println("Digite texto (pressione Enter para finalizar):");

            // Lê e imprime cada linha digitada pelo usuário
            String linha = leitorComBuffer.readLine();
            while (linha != null && !linha.isEmpty()) {
                System.out.println("Você digitou: " + linha);
                linha = leitorComBuffer.readLine();
            }
        } catch (IOException e) {
            // Trata erros de I/O
            System.err.println("Erro de I/O: " + e.getMessage());
        } finally {
            try {
                // Fecha os leitores
                if (leitorComBuffer != null) leitorComBuffer.close();
                if (leitor != null) leitor.close();
            } catch (IOException e) {
                System.err.println("Erro ao fechar os leitores: " + e.getMessage());
            }
        }
    }

    /**
     * Exemplo 5: Escrita em um arquivo utilizando buffer.
     * Cria ou substitui o arquivo "arquivo.txt" com o texto "Olá, tudo bem?".
     */
    public static void exemplo5() {
        OutputStream fluxo = null;
        OutputStreamWriter escritor = null;
        BufferedWriter escritorComBuffer = null;

        try {
            // Abre o arquivo para escrita
            fluxo = new FileOutputStream("arquivo.txt");
            escritor = new OutputStreamWriter(fluxo);
            escritorComBuffer = new BufferedWriter(escritor);

            // Escreve no arquivo
            escritorComBuffer.write("Olá, tudo bem?");
            escritorComBuffer.flush();
            System.out.println("Texto gravado no arquivo com sucesso.");
        } catch (IOException e) {
            // Trata erros de I/O
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            try {
                // Fecha os fluxos
                if (escritorComBuffer != null) escritorComBuffer.close();
                if (escritor != null) escritor.close();
                if (fluxo != null) fluxo.close();
            } catch (IOException e) {
                System.err.println("Erro ao fechar os fluxos: " + e.getMessage());
            }
        }
    }

    /**
     * Exemplo 6: Cópia de arquivos.
     * Copia o conteúdo de "entrada.doc" para "saida.doc".
     */
    public static void exemplo6() {
        File arquivoDeEntrada = new File("entrada.doc");
        File arquivoDeSaida = new File("saida.doc");
        FileInputStream fluxoDeEntrada = null;
        FileOutputStream fluxoDeSaida = null;

        try {
            // Abre o arquivo de entrada para leitura
            fluxoDeEntrada = new FileInputStream(arquivoDeEntrada);

            // Cria o arquivo de saída se não existir
            if (!arquivoDeSaida.exists()) {
                arquivoDeSaida.createNewFile();
            }

            // Abre o arquivo de saída para escrita
            fluxoDeSaida = new FileOutputStream(arquivoDeSaida);

            // Lê o conteúdo do arquivo de entrada e grava no arquivo de saída
            int c;
            while ((c = fluxoDeEntrada.read()) != -1) {
                fluxoDeSaida.write(c);
            }
            System.out.println("Arquivo copiado com sucesso.");
        } catch (FileNotFoundException e) {
            // Trata o erro caso o arquivo de entrada não exista
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            // Trata erros de I/O
            System.err.println("Erro de I/O: " + e.getMessage());
        } finally {
            try {
                // Fecha os fluxos
                if (fluxoDeEntrada != null) fluxoDeEntrada.close();
                if (fluxoDeSaida != null) fluxoDeSaida.close();
            } catch (IOException e) {
                System.err.println("Erro ao fechar os fluxos: " + e.getMessage());
            }
        }
    }
}