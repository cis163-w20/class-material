package midtermreview;

public abstract class Cipher implements Encryptable {
    protected int key;

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }
}
