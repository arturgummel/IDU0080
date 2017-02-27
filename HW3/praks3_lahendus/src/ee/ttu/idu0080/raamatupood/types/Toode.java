package ee.ttu.idu0080.raamatupood.types;

import java.io.Serializable;
import java.math.BigDecimal;

public class Toode implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int kood;
	private String nimetus;
	private BigDecimal hind;
	
	public Toode(int kood, String nimetus, BigDecimal i) {
		this.kood = kood;
		this.nimetus = nimetus;
		this.hind = i;
	}

	public int getKood() {
		return kood;
	}

	public void setKood(int kood) {
		this.kood = kood;
	}

	public String getNimetus() {
		return nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public BigDecimal getHind() {
		return hind;
	}

	public void setHind(BigDecimal hind) {
		this.hind = hind;
	}
	
	
}
