package threadsafe;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	
	// Zadanie: 
	//    Napisz kod korzystaj�cy z classic.Singleton oraz threadsafe.Singleton
	//    demonstruj�cy problemy w korzystaniu przez niezale�ne w�tki z klasycznej
	//    definicji.
}
