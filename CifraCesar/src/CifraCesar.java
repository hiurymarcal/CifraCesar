public class CifraCesar {
    private final int chave;

    public CifraCesar(int chave) {
        this.chave = chave;
    }

    public String criptografar(String texto) {
        StringBuilder cifrado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + chave) % 26 + base);
            }
            cifrado.append(c);
        }
        return cifrado.toString();
    }

    public String descriptografar(String texto) {
        StringBuilder decifrado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base - chave + 26) % 26 + base);
            }
            decifrado.append(c);
        }
        return decifrado.toString();
    }
}
