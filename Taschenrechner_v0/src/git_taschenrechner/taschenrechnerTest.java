package git_taschenrechner;

import java.util.Scanner;


public class taschenrechnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner myScanner = new Scanner(System.in);
				Taschenrechner ts = new Taschenrechner();
				double zahl1;
				double zahl2;

				int swValue;

				// Display menu graphics
				System.out.println("============================");
				System.out.println("|   MENU SELECTION DEMO    |");
				System.out.println("============================");
				System.out.println("| Options:                 |");
				System.out.println("|        1. Addieren       |");
				System.out.println("|        2. Subtrahieren   |");
				System.out.println("|        3. Multiplizieren |");
				System.out.println("|        4. Dividieren     |");
				System.out.println("|        5. Exit           |");
				System.out.println("============================");
				System.out.print(" Select option: ");
				swValue = myScanner.next().charAt(0);

				// Switch construct
				switch (swValue) {
				case '1':
					System.out.println("Geben sie den ersten Summand");
					zahl1 = myScanner.nextDouble();
					System.out.println("Geben sie den zweiten Summand");
					zahl2 = myScanner.nextDouble();
					
					System.out.println("Die Summe ist: " + zahl1 + " + " +zahl2 +" = " +ts.add(zahl1, zahl2));
					break;
				case '2':
					System.out.println("Geben sie den ersten Minuend");
					zahl1 = myScanner.nextDouble();
					System.out.println("Geben sie den zweiten Subtrahend");
					zahl2 = myScanner.nextDouble();
					
					System.out.println("Die Differenz ist: " + zahl1 + " + " +zahl2 +" = " +ts.sub(zahl1, zahl2));
					break;
				case '3':
					System.out.println("Geben sie den ersten Faktor");
					zahl1 = myScanner.nextDouble();
					System.out.println("Geben sie den zweiten Faktor");
					zahl2 = myScanner.nextDouble();
					
					System.out.println("Die Produkt ist: " + zahl1 + " + " +zahl2 +" = " +ts.mul(zahl1, zahl2));
					break;
				case '4':
					System.out.println("Geben sie den ersten Dividend");
					zahl1 = myScanner.nextDouble();
					System.out.println("Geben sie den zweiten Divisor");
					zahl2 = myScanner.nextDouble();
					
					System.out.println("Die Quotient ist: " + zahl1 + " + " +zahl2 +" = " +ts.div(zahl1, zahl2));
					break;
					
				  //  add your code here
				  
				  
				default:
					System.out.println("Invalid selection");
					break; // This break is not really necessary
				}

			}
}
