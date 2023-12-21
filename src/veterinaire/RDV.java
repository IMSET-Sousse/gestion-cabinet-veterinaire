package veterinaire;



public class RDV {
	private int num;
	private int date;
	public RDV () {
		super();
		this.num = 0;
		this.date = 0;
	}
	public RDV(int num, int date) {
		super();
		this.num = num;
		this.date = date;
		
	}
	public int getnum() {
		return num;
	}
	public void setnum(int num) {
		this.num = num;
	}
	public int getdate() {
		return date;
	}
	public void setdate(int date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RDV [num=" + num + ", date=" + date + "]";
	}

}
