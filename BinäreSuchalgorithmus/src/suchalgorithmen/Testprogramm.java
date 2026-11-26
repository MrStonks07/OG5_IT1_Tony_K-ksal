package suchalgorithmen;

public class Testprogramm {

    public static void main(String[] args) {
        Stoppuhr uhr = new Stoppuhr();
        int wiederholungen = 3;   //3 mal damit ich nicht mehrmals das programm runnen muss   

        for (int n = 15000000; n <= 20000000; n = n + 1000000) { //sollte richtig sein
            System.out.println("-----------------------------------------");
            System.out.println("Listenlaenge n = " + n);

            long[] zahlen = SortedListGenerator.getSortedList(n);
            long bestLinear = zahlen[0];
            long avgLinear = zahlen[n / 2];
            long worstLinear = zahlen[n - 1];
            long bestBinaer = zahlen[(n - 1) / 2];
            long avgBinaer = zahlen[n / 3];
            long worstBinaer = zahlen[0];
            long nichtDa = -1;

            System.out.println("==== Lineare Suche ====");			//Lineare suchender block
            for (int w = 1; w <= wiederholungen; w++) {
                uhr.reset();
                uhr.start();
                LineareSuche.suche(zahlen, bestLinear);
                uhr.stopp();
                System.out.println("Best-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                LineareSuche.suche(zahlen, avgLinear);
                uhr.stopp();
                System.out.println("Average-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                LineareSuche.suche(zahlen, worstLinear);
                uhr.stopp();
                System.out.println("Worst-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                LineareSuche.suche(zahlen, nichtDa);
                uhr.stopp();
                System.out.println("Nicht enthalten " + w + ": " + uhr.getMillis() + " ms");
                
                System.out.println("-----------------------------------------");
            }

            System.out.println("===== Binaere Suche =====");		//Binär Suchende block
            for (int w = 1; w <= wiederholungen; w++) {
                uhr.reset();
                uhr.start();
                BinaereSuche.suche(zahlen, bestBinaer);
                uhr.stopp();
                System.out.println("Best-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                BinaereSuche.suche(zahlen, avgBinaer);
                uhr.stopp();
                System.out.println("Average-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                BinaereSuche.suche(zahlen, worstBinaer);
                uhr.stopp();
                System.out.println("Worst-Case " + w + ": " + uhr.getMillis() + " ms");

                uhr.reset();
                uhr.start();
                BinaereSuche.suche(zahlen, nichtDa);
                uhr.stopp();
                System.out.println("Nicht enthalten " + w + ": " + uhr.getMillis() + " ms");
                
                System.out.println("-----------------------------------------"); //line hier weil ich probleme hatte sachen zu erkennen
            }
        }
    }
}