
public class ReturnOefening {
	public static void main (String args[]) {
		Klant Jasper = new Klant();
		Jasper.portemonnee = 5;
		Jasper.boodschappen = 3; 
		
		
		if (Jasper.portemonnee>=Jasper.boodschappen) {
			Jasper.portemonnee = Jasper.portemonnee-Jasper.boodschappen;
			Boodschappen JasperBoodschappen = Jasper.winkelen();
			JasperBoodschappen.gelukt();
			System.out.println("Jasper heeft " + Jasper.boodschappen + " euro over!");
			
			
		} else {
			System.out.println("U heeft helaas onvoldoende saldo.");
			int tekort =  Jasper.boodschappen-Jasper.portemonnee;
			System.out.println("U kwam " + tekort + " euro tekort.");
		}
		
	
	}
}

class Boodschappen {
	void gelukt() {
	System.out.println("Boodschappen doen is gelukt!");
	
	}	
}

class Klant {
	int geld;
	int portemonnee;
	int boodschappen;
	Boodschappen winkelen() {
		
			return new Boodschappen(); //Dit moet nog aangepast
		}
		
		
	
}