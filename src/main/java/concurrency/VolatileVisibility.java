package concurrency;

public class VolatileVisibility {
    private int v = 0; // should be volatile

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
