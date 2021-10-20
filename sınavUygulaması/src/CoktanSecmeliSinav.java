import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoktanSecmeliSinav extends Sinav{
	
	public CoktanSecmeliSinav(List<Soru> soru) {
		super(soru);
		
	}

	@Override
	public List<Soru> sinavOlustur(List<Soru> soru) {
		
			 Random rand = new Random();
			 
		        
		     
		        int total=0;
		        List<Soru> sor = new ArrayList<Soru>();
		       while(total<=100) {
		    	   

		    	   int randomIndex = rand.nextInt(soru.size());
		    	   if(soru.get(randomIndex) instanceof CoktanSecmeli ) {
		            total +=soru.get(randomIndex).getPuan();
		            if(total > 110) {
		            	break; 
			        }
		            sor.add(soru.get(randomIndex));
		    	   }
		    	  
		           
		       }
		        
		        
		        return  sor;  
	

		
		
		
	  
}
}
