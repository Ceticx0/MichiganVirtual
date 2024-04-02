public class Encryption {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getCipherAlphabet(int key) {
        String cipherAlphabet = "";
        for (int i = 0; i < alphabet.length(); i++) {
            cipherAlphabet += alphabet.charAt((i + key) % alphabet.length());
        }
        return cipherAlphabet;
    }

    public static String decrypt(String text, int key) {
        String decryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') continue;
            decryptedText += alphabet.charAt((alphabet.indexOf(text.charAt(i)) - key) % alphabet.length());
        }
        return decryptedText;
    }

    public static String encrypt(String text, int key) {
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') continue;
            encryptedText += alphabet.charAt((alphabet.indexOf(text.charAt(i)) + key) % alphabet.length());
        }
        return encryptedText;
    }
}
