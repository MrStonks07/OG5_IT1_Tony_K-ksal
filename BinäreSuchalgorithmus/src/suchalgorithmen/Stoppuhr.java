package suchalgorithmen;
public class Stoppuhr {
    private long anfang;
    private long ende;

    public void start() {
        this.anfang = System.currentTimeMillis();
    }

    public void stopp() {
        this.ende = System.currentTimeMillis();
    }

    public void reset() {
        this.anfang = 0;
        this.ende = 0;
    }

    public long getMillis() {
        return this.ende - this.anfang;
    }
}