

public abstract class Soru implements Comparable<Soru> {

		protected String soruMetni;
		protected int puan;
		protected String zorluk;
		protected String cevap;
		protected String id;
		
		
   public Soru(String soruMetni, int puan, String zorluk,String cevap , String id) {
			
			this.soruMetni = soruMetni;
			this.puan = puan;
			this.zorluk = zorluk;
			this.cevap=cevap;
			this.id=id;
		}


	public String getSoruMetni() {
			return soruMetni;
		}


	public void setSoruMetni(String soruMetni) {
			this.soruMetni = soruMetni;
		}


	public int getPuan() {
			return puan;
		}


	public void setPuan(int puan) {
			this.puan = puan;
		}


	public String getZorluk() {
			return zorluk;
		}


	public void setZorluk(String zorluk) {
			this.zorluk = zorluk;
		}
	
		
	public String getCevap() {
		return cevap;
	}


	public void setCevap(String cevap) {
		this.cevap = cevap;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(Soru o) {
		if(o instanceof Soru) {
			Soru other=(Soru) o;
			if(this.getPuan() > other.getPuan()) {
				return 1;
			}
			else if (this.getPuan() < other.getPuan()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		return 0;
	}

	
	public abstract String soruFormati();
	
	


	
}

