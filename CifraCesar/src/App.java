public class App {
    public static void main(String[] args) {
        Mecanismo gerenciador = new Mecanismo(3); // chave da cifra

        String caminhoEntrada = "src/texto/entradaTexto.txt";
        String caminhoCriptografado = "src/texto/saidaCripto.txt";
        String caminhoDescriptografado = "src/texto/saidaDecripto.txt";

        gerenciador.criptografarArquivo(caminhoEntrada, caminhoCriptografado);
        gerenciador.descriptografarArquivo(caminhoCriptografado, caminhoDescriptografado);
    }
}
