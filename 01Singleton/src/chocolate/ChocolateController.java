package chocolate;
 
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		System.out.println(boiler == boiler2);
		
		// Zadanie:
		//   Czy istnieje mo�liwo�� by dwa w�tki wykonuj�ce  
		//        ChocolateBoiler.getInstance()
		//   otrzyma�y dwie r�ne instancje klasy ChocolateBoiler ?
		//   Je�eli tak zaproponuj przeplot instrukcji metody getInstance, kt�ra 
		//   do tego doprowadzi.
	}
}
