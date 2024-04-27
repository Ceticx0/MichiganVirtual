// Gavin Perry, 2024-4-2, The purpose of this program is to encrypt something with the ceaser cipher.
public class Encryption {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getCipherAlphabet(int key) {
        String cipherAlphabet = "";
        for (int i = 0; i < alphabet.length(); i++) {
            int index = (i + key) % alphabet.length();
            cipherAlphabet += alphabet.charAt(index);
        }
        return cipherAlphabet;
    }

    public static String encrypt(String text, int key) {
        String encryptedText = "";
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {encryptedText += ' '; continue;}
            int index = alphabet.indexOf(text.charAt(i));
            encryptedText += getCipherAlphabet(key).charAt(index);
        }
        return encryptedText;
    }
}
