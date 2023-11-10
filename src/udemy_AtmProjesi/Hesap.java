package udemy_AtmProjesi;

public class Hesap {
	private String kullan�c�Ad�;
	private String parola;
	private double bakiye;
	
	public Hesap(String kullan�c�Ad�, String parola, double bakiye) {
		this.kullan�c�Ad� = kullan�c�Ad�;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullan�c�Ad�() {
		return kullan�c�Ad�;
	}

	public void setKullan�c�Ad�(String kullan�c�Ad�) {
		this.kullan�c�Ad� = kullan�c�Ad�;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public void paraYat�rma(double miktar) {
    	bakiye += miktar;
    	
    }
	 public void paraCekme(double miktar) {
	    	if(miktar>1500) {
	    		System.out.println("Bir g�nde 1500'den fazla para �ekemezsiniz.");
	    	}else if(miktar>bakiye) {
	    		System.out.println("Yeterli bakiyeniz yoktur...");
	    	}else {
	    	bakiye -= miktar;
	    	}
	    }
	

}
