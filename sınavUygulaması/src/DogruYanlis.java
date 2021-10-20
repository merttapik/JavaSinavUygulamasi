
public class DogruYanlis extends Soru {

	

	
	public DogruYanlis(String soruMetni, int puan, String zorluk,String cevap,String id) {
		super(soruMetni, puan, zorluk,cevap,id);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String soruFormati() {
		return this.soruMetni +"( )"+" Dogru ise D Yanlis ise Y giriniz"+"  ("+this.puan + " " +"puan )"+"\n"   ;
	}

}
