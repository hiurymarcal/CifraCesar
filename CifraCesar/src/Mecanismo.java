import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mecanismo {
    private final CifraCesar cifra;

    public Mecanismo(int chave) {
        this.cifra = new CifraCesar(chave);
    }

    public void criptografarArquivo(String origem, String destino) {
        processarArquivo(origem, destino, true);
    }

    public void descriptografarArquivo(String origem, String destino) {
        processarArquivo(origem, destino, false);
    }

    private void processarArquivo(String origem, String destino, boolean criptografar) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(origem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(destino))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String resultado = criptografar ? cifra.criptografar(linha) : cifra.descriptografar(linha);
                escritor.write(resultado);
                escritor.newLine();
            }

        } catch (IOException e) {
            System.err.println("Erro ao acessar os arquivos: " + e.getMessage());
        }
    }
}
