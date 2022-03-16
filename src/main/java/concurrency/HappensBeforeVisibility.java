package concurrency;

public class HappensBeforeVisibility {
    private volatile int a = 0, b = 0, c = 0;
    private int x = 0;

    public void prepareVariables() {
        a = 1;
        b = 2;
        c = 3;

        synchronized (this) {
            x = 1;
        }
    }

    public void printVariables() {
        int r = 0;
        synchronized (this) {
            r = x;
        }
        var a1 = a;
        var b1 = b;
        var c1 = c;
        var sb = new StringBuilder(" State ");
        sb.append("a = ").append(a)
                .append(" | ")
                .append("b = ").append(b)
                .append(" | ")
                .append("c = ").append(c)
                .append(" | ")
                .append(" r = ").append(r);
        System.out.println(sb);
    }
}
