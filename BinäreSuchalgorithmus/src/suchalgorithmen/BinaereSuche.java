package suchalgorithmen;
public class BinaereSuche {
    public static final int nichtGefunden = -1;

    public static int suche(long[] zahlen, long gesuchteZahl) {
        int i = 0;
        int r = zahlen.length - 1;
        while (i <= r) {
            int mitte = (i + r) / 2;
            if (zahlen[mitte] == gesuchteZahl) {
                return mitte;
            } else if (zahlen[mitte] > gesuchteZahl) {
                r = mitte - 1;
            } else {
                i = mitte + 1;
            }
        }
        return nichtGefunden;
    }
}