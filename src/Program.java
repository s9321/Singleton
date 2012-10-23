public class Program {
	
	public static void main(String[] args) {
		
		//KsiazkaTelefoniczna ksiazkaNew = new KsiazkaTelefoniczna(); b³¹d!
		KsiazkaTelefoniczna ksiazka = KsiazkaTelefoniczna.getInstance();
		
		ksiazka.dodajKontakt(123456789, "Adam");
		ksiazka.dodajKontakt(653123145, "Tomek");
		ksiazka.dodajKontakt(987654321, "Wojtek");
		ksiazka.zobaczKontakty();
		
		boolean result =
	            ksiazka.edytujKontakt(123456789, 122256789, "Adam");
	        if(result)
	            System.out.println("Kontakt zostal zmieniony");
	        else
	            System.out.println("Kontakt nie zostal zmieniony");
	        
	     ksiazka.zobaczKontakty();  
	     System.out.println("");
	     
	     //W kazdym miejscu programu mozemy pobrac referencje do obiektu klasy
	     //KsiazkaTelefoniczna, ktora zawsze bedzie odnosic sie do tego samego obiektu
	     KsiazkaTelefoniczna taSamaKsiazka = KsiazkaTelefoniczna.getInstance();
	     taSamaKsiazka.zobaczKontakty();
		 
		  System.out.println("");
	     
	     //Mozemy rowniez bezposrednio odwolac sie do naszego obiektu
	     KsiazkaTelefoniczna.getInstance().zobaczKontakty();
	     

	}

}
