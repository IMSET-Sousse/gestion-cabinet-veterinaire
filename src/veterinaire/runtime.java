package veterinaire;

public class runtime {
	public static void main (String[] args) {
		
		RDV rdv1=new RDV(2,02252023,"loulou", "chat",4,5,false);
		RDV rdv2 =new RDV(3,03012023, "lili" ,"chien", 2 , 4, true);
		
		
		System.out.println(rdv1);
		System.out.println(rdv2);
	}

}

