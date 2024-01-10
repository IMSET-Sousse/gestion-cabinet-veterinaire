package veterinaire;

import java.util.ArrayList;

public class Consultation {
	private int numCon;
	private int dateCon;
	private String observation;
	
	private ArrayList<Consultation> items;
	
	public Consultation() {
		super();
		
	}

	public ArrayList<Consultation> getItems() {
		return items;
	}
	
	public void ajoutItem(Consultation a) {
		this.ajoutItem(a);
	}

}