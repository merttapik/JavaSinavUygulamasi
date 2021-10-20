import java.util.List;

public abstract  class Sinav {
protected List <Soru> soru;


 
 public Sinav(List<Soru> soru) {
	
	this.soru = soru;
}


public List<Soru> getSoru() {
	return soru;
}

public void setSoru(List<Soru> soru) {
	this.soru = soru;
}


public abstract List < Soru> sinavOlustur(List<Soru> soru ) ;
	// TODO Auto-generated method stub
 
}
