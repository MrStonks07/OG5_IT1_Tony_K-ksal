package suchalgorithmen;
public class LineareSuche {
    public static final int nichtGefunden = -1;

    public static int suche(long[] zahlen, long gesuchteZahl) {
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == gesuchteZahl) {
                return i;
            }
        }
        return nichtGefunden;
    }
}