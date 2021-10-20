
public class Klasik extends Soru {

	public Klasik(String soruMetni, int puan, String zorluk, String cevap,String id) {
		super(soruMetni, puan, zorluk, cevap,id);
		
	}
	
	@Override
	public String soruFormati() {
		return this.soruMetni +"  ("+this.puan + " " +"puan )"+"\n"   ;
	}

}
