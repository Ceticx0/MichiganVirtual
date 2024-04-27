// Gavin Perry, 2024-4-2, The purpose of this program is to decrypt something with the ceaser cipher.
public class Decryption {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getCipherAlphabet(int key) {
        String cipherAlphabet = "";
        for (int i = 0; i < alphabet.length(); i++) {
            int index = (i + key) % alphabet.length();
            cipherAlphabet += alphabet.charAt(index);
        }
        return cipherAlphabet;
    }

    public static String decrypt(String cipherText, int key) {
        String originalText = "";
        cipherText = cipherText.toUpperCase();
        for (int i = 0; i < cipherText.length(); i++) {
            if (cipherText.charAt(i) == ' ') {originalText += ' '; continue;}
            int index = getCipherAlphabet(key).indexOf(cipherText.charAt(i));
            originalText += alphabet.charAt(index);
        }
        return originalText;
    }
}
