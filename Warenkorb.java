import java.util.List;

public class Warenkorb {
	
	private final AbrechnungsStrategie strategie; 
	
	public Warenkorb (AbrechnungsStrategie s) {
		this.strategie = s;
	}

	
	public double berechneGesamtkosten (List<Double> einzelkosten) {
		return this.strategie.berechne(einzelkosten);
	}
	
	

}
