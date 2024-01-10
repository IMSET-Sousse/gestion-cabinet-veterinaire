package veterinaire;



public class RDV {
	private int num;
	private String nom;
	private String race;
	private int age;
	private int poids;
	private boolean vaccination;
	private int date;
	
	
	public RDV () {
		super();
		this.num = 0;
		this.nom="";
		this.race="";
		this.age=0;
		this.poids=0;
		this.vaccination =false ;
		this.date=0;
	}
	public RDV(int num,String nom,String race,int age,int poids ,boolean vaccination,int date) {
		super();
		this.num = num;
		this.nom=nom;
		this.race=race;
		this.age=age;
		this.poids=poids;
		this.vaccination=vaccination;
		this.date = date;
		
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public boolean isVaccination() {
		return vaccination;
	}
	public void setVaccination(boolean vaccination) {
		this.vaccination = vaccination;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RDV [num=" + num + ", nom=" + nom + ", race=" + race + ", age=" + age + ", poids=" + poids
				+ ", vaccination=" + vaccination + ", date=" + date + "]";
	}}
	
	
	
	    
