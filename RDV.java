package veterinaire;

public class RDV  {
    private int num;
    private int date;
    private String nom;
    private String race;
    private int age;
    private int poids;
    private boolean vaccination;
    

    public RDV() {
        super();
        this.num = 0;
        this.date = 0;
        this.nom = "";
        this.race = "";
        this.age = 0;
        this.poids = 0;
        this.vaccination = false;
    }

    public RDV(int num, int date, String nom, String race, int age, int poids, boolean vaccination) {
        super();
        this.num = num;
        this.date = date;
        this.nom = nom;
        this.race = race;
        this.age = age;
        this.poids = poids;
        this.vaccination = vaccination;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "RDV [num=" + num + ", date=" + date + ", nom=" + nom + ", race=" + race + ", age=" + age + ", poids=" + poids + ", vaccination=" + vaccination + "]";
    }
}

