
public class BoslukDoldurma extends Soru {

	

	public BoslukDoldurma(String soruMetni, int puan, String zorluk, String cevap,String id) {
		super(soruMetni, puan, zorluk, cevap,id);
		
	}

	@Override
	public String soruFormati() {
		
		return this.soruMetni +"Boslugu doldurunuz."+"  ("+this.puan + " " +"puan )"+"\n"   ;
	}

	
	
	

	

}
