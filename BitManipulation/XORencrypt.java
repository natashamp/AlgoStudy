public class XORencrypt {
    public static String encryptDecrypt(String input, char key) {
        char[] output  = new char[ input.length()];

        for ( int i = 0; i < input.length(); i++ ) {
            output[i] = (char) (input.charAt(i) ^ key);

        }
        return new String(output);
    }

    public static void main(String[] args) {
        String text = "The only thing we have to fear is fear itself";

        char key = 'T';

        String encrypted = encryptDecrypt(text, key);
        System.out.println("Encrypted: " + encrypted);

        String dencrypted = encryptDecrypt(encrypted, key);
        System.out.println("Decrypted: " + dencrypted);
    }

}

