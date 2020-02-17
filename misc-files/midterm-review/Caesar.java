package midtermreview;

public class Caesar extends Cipher {
    public Caesar(int key) {
        this.key = key;
    }
    public String encrypt(String msg) {
        char[] encrypted = msg.toLowerCase().toCharArray();
        for (int i=0; i<msg.length(); i++) {
            encrypted[i] = (char) (encrypted[i] - key);
        }
        return new String(encrypted);
    }

    public String decrypt(String msg) {
        char[] decrypted = msg.toLowerCase().toCharArray();
        for (int i=0; i<msg.length(); i++) {
            decrypted[i] = (char) (decrypted[i] + key);
        }
        return new String(decrypted);
    }

    public static void main(String[] args) {
        Caesar c = new Caesar(4);
        String msg = "money is cool, coding is cooler";
        String sec = c.encrypt(msg);
        System.out.println(sec);
        String rec = c.decrypt(sec);
        System.out.println(rec);
    }
}
