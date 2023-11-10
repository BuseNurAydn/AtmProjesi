package udemy_AtmProjesi;

public class Hesap {
	private String kullanıcıAdı;
	private String parola;
	private double bakiye;
	
	public Hesap(String kullanıcıAdı, String parola, double bakiye) {
		this.kullanıcıAdı = kullanıcıAdı;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullanıcıAdı() {
		return kullanıcıAdı;
	}

	public void setKullanıcıAdı(String kullanıcıAdı) {
		this.kullanıcıAdı = kullanıcıAdı;
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
	
	public void paraYatırma(double miktar) {
    	bakiye += miktar;
    	
    }
	 public void paraCekme(double miktar) {
	    	if(miktar>1500) {
	    		System.out.println("Bir günde 1500'den fazla para çekemezsiniz.");
	    	}else if(miktar>bakiye) {
	    		System.out.println("Yeterli bakiyeniz yoktur...");
	    	}else {
	    	bakiye -= miktar;
	    	}
	    }
	

}
