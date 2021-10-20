import java.util.Scanner;


import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	static Scanner input = new Scanner(System.in);
	

	static List<Soru> sorular = new ArrayList<Soru>();
	public static void main(String[] args) {

		kayitliSorular();
		
		int secim = -1;
		do {
			secim = printMenu();

			switch (secim) {
			case 1:
				soruEklemeIslemi();
				break;
			case 2:
				soruCikarmaIslemi();
				break;
			case 3:
				sorulariListele();
				break;
			case 4:
				sinavOlusturmaIslemi();
				break;
			}
		} while (secim != 5);
		
		

	}

	
	private static void kayitliSorular() {
		Soru m= new CoktanSecmeli( "Beyin ve omurili�i saran zarlara ne ad verilir? ",  10,"zor","Meninks", "Meningosel", "Myelit", "Ensefalit", "A","30");
		Soru c= new CoktanSecmeli( "�r�n ve hizmetlerin pazarlanmas� ve\r\n"
				+ "sat���n�n yap�lmas� ile ilgili faaliyetler\r\n"
				+ "i�letmelerin a�a��daki faaliyet alanlar�ndan\r\n"
				+ "hangisiyle ilgilidir?",  15,"kolay","Ticaret", "End�stri", "�malat", "Hizmet", "B","4");
		Soru d= new CoktanSecmeli( "Bir �lkenin farkl� b�lgelerinin, o �lkede elde\r\n"
				+ "edilen toplam gelirden ald��� pay� g�steren\r\n"
				+ "gelir da��l�m� a�a��dakilerden hangisidir?",  10,"normal","Fonksiyonel", "B�lgesel", "Ki�isel", "Sekt�rel", "B","41");
		Soru f= new CoktanSecmeli( "Bir �lkenin farkl� b�lgelerinin, o �lkede elde\r\n"
				+ "edilen toplam gelirden ald��� pay� g�steren\r\n"
				+ "gelir da��l�m� a�a��dakilerden hangisidir?",  15,"normal","Fonksiyonel gelir da��l�m�", "B�lgesel gelir da��l�m�", "Ki�isel gelir da��l�m�", "Sekt�rel gelir da��l�m�", "A","77");
		Soru g= new CoktanSecmeli( "A�a��dakilerden hangisi kendini ger�ekle�tirmekte\r\n"
				+ "olan bireyin �zelliklerinden biri de�ildir? ",  10,"zor","Zaman� iyi kullanmas�", "Kendine sayg� duymas�", "Kim oldu�u konusunda ger�ek�i bir g�r���n�n\r\n"
						+ "olmas�", "Yeterli bir ki�ili�e sahip oldu�unu d���nmesi", "D","32");
		Soru j= new CoktanSecmeli( "�kinci D�nya Sava�� hangi y�llar\r\n"
				+ "aras�nda ger�ekle�mi�tir?",  10,"kolay","1920-1925", "1926-1930", "1935-1938", "1939-1945", "D","61");
		Soru l= new CoktanSecmeli( "2x � 3 = 5 denkleminde x ka�t�r?",  5,"kolay","� 4", "� 1", "4", "3", "C","87");
		Soru fm= new CoktanSecmeli( "A�a��dakilerden hangisi bisikletle ilgili\r\n"
				+ "kazalar�n �nlenmesinde al�nabilecek\r\n"
				+ "tedbirlerden biri de�ildir?",  15,"zor","Ba�a g�venli bir kask tak�lmamas�", "Ya���l� g�nlerde bisiklet kullan�lmamas�", "Uzun ve bol pantolonla bisiklet\r\n"
						+ "kullan�lmamas�", "Bisikletin oturma y�ksekli�inin �ocu�un\r\n"
								+ "boyuna uygun olmas�", "A","7");
		Soru m1= new CoktanSecmeli( "A�a��dakilerden hangisi bisikletle ilgili kazalar�n\r\n"
				+ "�nlenmesinde al�nabilecek �nlemlerden biri\r\n"
				+ "de�ildir? ",  10,"zor","Bandana tak�larak bisiklet kullan�lmas�", "Trafi�in sakin oldu�u yerlerde bisiklete binilmesi", "Kuru havalarda bisiklet kullan�lmas�", "Bisikletin oturma y�ksekli�inin kullanan ki�inin\r\n"
						+ "boyuna uygun olmas�", "D","23");
		Soru c3= new CoktanSecmeli( "A�a��dakilerden hangisi kurumlar vergisi\r\n"
				+ "m�kelleflerinden biridir? ",  10,"kolay","Anonim �irket", "Limited �irket", "Eshaml� komandit �irket", "�� ortakl���", "B","71");
		Soru de= new CoktanSecmeli( "A�a��dakilerden hangisi T�rk hukukundaki asl�\r\n"
				+ "yaz�l� hukuk kaynaklar�ndan biri de�ildir?",  15,"normal","Yarg� kararlar�", "Yasa", " Kanun H�km�nde Kararname", "Kanun", "C","65");
		Soru fs= new CoktanSecmeli( "A�a��dakilerden hangisi bilimsel yaz� t�rlerinden biri de�ildir?",  15,"normal","Hik�ye", "Makale", "Rapor", "Tez", "A","12");
		

		Soru m2= new Klasik("Geli�me  �leti�imi  yakla��m�n�n  temel  sorular�  nelerdir?  Bu  sorular�  yan�tlarken  hangi varsay�mlar temel al�nmaktad�r?",20,"zor","cevap","11");
		Soru m3= new Klasik("1980�lerde  ba�layan  yeniden  yap�lanma  s�recinde  ileti�imin  g�sterdi�i  yeni  �zellikler nelerdir?",10,"normal","cevap","15");
		Soru m4= new Klasik("Hiyerar�ik  kavramsalla�t�rmada,  enformasyonun  ba�ka  hangi  kavramlarla,  nas�l ili�kilendirildi�ini a��klay�n�z?",15,"normal","cevap","16");
		Soru m5= new Klasik("Sanayi Sonras� Toplum kavram�n�n ortaya ��k�� nedenlerini tart���n�z?",30,"zor","cevap","1777");
		Soru m6= new Klasik("Teknolojik  determinizm�  ve  bu  yakla��m�n  ele�tiren  yakla��mlar�  a��klay�n�z?  Bu yakla��mlar� temel alarak internete ili�kin birerc�mle kurunuz?",15,"normal","cevap","1771");
		Soru m7= new Klasik("Yeni  ileti�im  teknolojileri�ni  tan�mlay�n�z?  Yeni  ileti�im  teknolojilerini  kitle  ileti�im teknolojilerinden ay�ran �zellikler nelerdir? Bir �rnek �zerinde a��klay�n�z?",20,"zor","cevap","8911");
		Soru m8= new Klasik("Bilgi, veri ve enformasyon aras�ndaki ili�kileri tan�mlay�n�z?",15,"normal","cevap","9611");
		Soru m9= new Klasik("Ricordo�nun kar��la�t�rmal� �st�nl�kler teorisini anlat�n�z. Bu teoriye y�neltilen ele�tirileri tart���n�z",10,"normal","cevap","8511");
		Soru m10= new Klasik("Tam rekabet piyasas�nda faaliyet g�steren bir firman�n k�sa d�nem arz e�risini �ekil yard�m�yla a��klay�n�z",5,"kolay","cevap","6311");
		Soru m11= new Klasik("Vergiden ka��nma ile vergi ka�ak��l���n� tarif ederek, aralar�ndaki fark� belirtiniz.",20,"zor","cevap","12581");
		Soru m12= new Klasik("Ceza hukuku kurallar�n�n yer itibariyle uygulanmas�ndaki esaslar� anlat�n�z.",25,"zor","cevap","1961");
		Soru m13= new Klasik("�a�da� b�t�e teorilerini s�ralayarak k�saca a��klay�n�z.",25,"zor","cevap","119654");
		Soru m14= new Klasik("Para arz�n� kontrol etmek i�in para politikas�ndan sorumlu otoritenin kullanabilece�i ara�lar� sayarak k�saca a��klay�n�z",10,"normal","cevap","1581");
		Soru m15= new Klasik("Ticaret hukukuna g�re hisse senetleri ve tahvilleri tan�mlayarak bunlar�n sahiplerine sa�lad��� hak ve y�k�ml�l�kleri a��klay�n�z",10,"normal","cevap","13571");
		Soru m16= new Klasik("Hak ve fiil ehliyeti kavramlar�n� a��klay�n�z. Fiil ehliyetinin �artlar�n� sayarak k�saca a��klay�n�z",10,"normal","cevap","11591");
		
		Soru m17=new DogruYanlis("G�ky�z� kapkara oldu�unda kar ya�ar", 2, "kolay", "D", "123");
		Soru m18=new DogruYanlis("Yery�z�ndeki sular b�y�k k�tleler h�linde havaya kar���r.", 2, "kolay", "D", "1234");
		Soru m19=new DogruYanlis("Hava yery�z�nden y�kse�e ��kt�k�a �s�n�r.", 2, "kolay", "Y", "1238");
		Soru m20=new DogruYanlis("S�cak maddeler, �s� verdi�i i�in so�ur; so�uk maddeler de �s� ald��� i�in �s�n�r.", 2, "kolay", "D", "1235");
		Soru m21=new DogruYanlis(" Is� ve s�cakl�k ayn� kavramlard�r.", 2, "kolay", "Y", "1236");
		Soru m22=new DogruYanlis(" Is�, kalorimetre kab� ile �l��l�r.", 2, "kolay", "D", "1237");
		
		Soru m23=new BoslukDoldurma("�nsanlar tuhaft�r, ---- bir �ey yapmakta olduklar�n� hissedecek olurlarsa mutlaka en evvel vicdanlar�n� ----\r\n"
				+ "bir sebep bulurlar", 5, "kolay", "cevap", "8541");
		Soru m24=new BoslukDoldurma("�Vatan �airi� ve �H�rriyet �airi� olarak ---- Nam�k Kemal, �iirin yan� s�ra tenkit, biyografi, tiyatro, roman,\r\n"
				+ "tarih ve makale t�rlerinde ---- verdi", 5, "kolay", "cevap", "8542");
		Soru m25=new BoslukDoldurma("Yeteneklerini, hayattan beklentilerini biyolojik saati\r\n"
				+ "---- ba�lad���nda duyumsamaya ba�layan insan, o\r\n"
				+ "g�nden itibaren de kendini ---- yolculu�una ��kar.", 5, "kolay", "cevap", "8543");
		Soru m26=new BoslukDoldurma("Ocak 2018�de �in�deki ----, kopya koyun Dolly�nin\r\n"
				+ "�sko�ya�da d�nyaya gelmesini sa�layan karma��k\r\n"
				+ "DNA transfer y�ntemini kullanarak Zhong Zhong ve\r\n"
				+ "Hua Hua adl� yenge� yiyen iki makak maymununu ----\r\n"
				+ "duyurdular", 5, "kolay", "cevap", "8544");
		Soru m27=new BoslukDoldurma("5. Metin resim dengesinin g�zetildi�i bu grup �yk� kitaplar�, okul �ncesindeki �ocuklara ---- gibi, ilk��retimle birlikte okuma yazma ---- �ocuklar�n kendi okuyabilecekleri ilk kitaplar olma �zelli�ini de ta��yor.", 5, "kolay", "cevap", "8545");
		Soru m28=new BoslukDoldurma("Pirin� Han, Sultan II. Bayezid taraf�ndan �stanbul�daki vak�flar�na ---- amac�yla 1508 y�l�nda yapt�r�lan\r\n"
				+ "hand�r ve alt katta 38, �st katta 48 oda bulunur; ----\r\n"
				+ "avlusunda on alt�gen �ad�rvan�n bug�n h�l� izleri\r\n"
				+ "g�r�lmektedir", 5, "kolay", "cevap", "8546");

		List<Soru> hazirSorular= Arrays.asList(m,c,d,f,g,f,j,l,fm,m1,c3,de,fs,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28);
		sorular.addAll(hazirSorular);
		System.out.println("Hazir sorular eklensin mi silinsin mi (eklemek i�in Y ' ye basiniz)");
		String karar=input.nextLine().trim();
		if(karar.equals("Y")|| karar.equals("y")) {
			sorular.retainAll(hazirSorular);
		  System.out.println("Sorular eklendi");}
		 else {
			sorular.removeAll(hazirSorular);
		   System.out.println("Sorular silindi");}	
	}
	      

	private static void sinavOlusturmaIslemi() {

		int secim = -1;
		do {
			System.out.println("--------------SinavOlusturmaIslemleri-----------");
			System.out.println("Hangi tipte sinav olusturulucak");
			System.out.println("1.Coktan secmeli sinav ");
			System.out.println("2. Klasik sinav");
			System.out.println("3.Karma sinav");
			System.out.println("4. Ana menuye d�n");
			System.out.print("Seciminiz :  ");

			 secim = input.nextInt();

			switch (secim) {
			case 1:
				coktanSecmeliSinavIslemi(); break;
			case 2:
				klasikSinavIslemi(); break;
			
			case 3:
				karmaSinavIslemi(); break;
			
		 
			}

	}while(secim!=4);
		
		
	}

	private static void karmaSinavIslemi() {
		
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter("sinav.txt"));
			Sinav karma=new KarmaSinav(sorular);
			System.out.println("Sikli sorulari A / B /C /D  olarak giriniz"+input.nextLine()+"\n"); 
			for (Soru soru : karma.sinavOlustur(sorular)) {
				System.out.println(soru.soruFormati());
				System.out.println("         ");
				bw.write(soru.soruFormati() +"\n");
				
				System.out.println("Cevabinizi giriniz ");
				
				String kullaniciCevabi=input.nextLine().trim();
				
				bw.write("Verilen Cevap: "+kullaniciCevabi+"  ");
			}
				
			bw.close();
		} catch (IOException e) {
			System.out.println("Hata ile karsilasildi");
			e.printStackTrace();
		}
		
	}

	private static void klasikSinavIslemi() {
		
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter("sinav.txt"));
			Sinav k=new KlasikSinav(sorular);
			System.out.println("  Basarilar..."+input.nextLine()+"\n"); 
			for (Soru soru : k.sinavOlustur(sorular)) {
				System.out.println(soru.soruFormati());
				System.out.println("         ");
				bw.write(soru.soruFormati() +"\n");
				System.out.println("Cevabinizi giriniz ");
				
				String kullaniciCevabi=input.nextLine().trim();
				
				bw.write("Verilen Cevap: "+kullaniciCevabi+" \n ");
			}
		
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Hata ile karsilasildi");
			e.printStackTrace();
		}
		 	
	}

	private static void coktanSecmeliSinavIslemi() {
		
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter("sinav.txt"));
			Sinav cs=new CoktanSecmeliSinav(sorular);
			int not=0;
			System.out.println("A / B / C / D  olarak giriniz"+input.nextLine()+"\n"); 
			for (Soru soru : cs.sinavOlustur(sorular)) {                                 
				
				System.out.println(soru.soruFormati());
				System.out.println("         ");
				bw.write(soru.soruFormati() +"\n");
				
				System.out.println("Cevabinizi giriniz ");
				
				String kullaniciCevabi=input.nextLine().trim();
				
				 if(kullaniciCevabi.equals(soru.getCevap())) {
					 
					 not +=soru.getPuan();
				 }
				
				bw.write("Verilen Cevap: "+kullaniciCevabi+" \n ");
				
			}
			bw.write("\n Aldiginiz not : "+not);
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Hata ile karsilasildi");
			e.printStackTrace();
		}
		
	 
	}

	private static void sorulariListele() {
		int secim = -1;
		do {
			System.out.println("--------------SoruListelemeIslemleri-----------");
			System.out.println("Neye g�re filtrelensin ");
			System.out.println("1.Soru metni icinde arama");
			System.out.println("2.Soru siklarinin metinleri icinde arama");
			System.out.println("3.Dogru sik uzerinden arama");
			System.out.println("4.Puan uzerinden arama");
			System.out.println("5. Zorluk derecesine uzerinden arama");
			System.out.println("6. Ana menuye don");
			System.out.print("Seciminiz :  ");

			 secim = input.nextInt();

			switch (secim) {
			case 1:
				soruMetniyleListeleme(); break;
			case 2:
				soruSiklariylaListeleme(); break;
			
			case 3:
				dogruSiklaListeleme(); break;
			
		    case 4:
				puanIleListeleme(); break;
		    case 5:
				zorlukDerecesiyleListeleme(); break;
			}

	}while(secim!=6);

	}

	private static void zorlukDerecesiyleListeleme() {
		System.out.println("Zorluk derecesini giriniz ( zor / kolay / normal)  ");
		String filtre = input.next().trim();
		
;		
		
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> sorular.getZorluk().contains(filtre)) 
				.collect(Collectors.toList());
		Collections.sort(filtreliSoru);
		filtreliSoru.forEach(soru->System.out.println("Soru metni : "+soru.soruFormati() )); 
		
		
	}


	private static void puanIleListeleme() {
		System.out.println("filtrelenecek sayiyi giriniz  ");
		int filtre = input.nextInt();
		
;		
		
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> sorular.getPuan()==filtre)
				.collect(Collectors.toList());
		
		filtreliSoru.forEach(soru->System.out.println("Soru metni : "+soru.soruFormati() )); 
		
		
	}


	private static void dogruSiklaListeleme() {
		System.out.println("Dogru sik ya da cevap ile filtrele  ");
		String filtre = input.next().trim();
		
;		
		
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> sorular.getCevap().contains(filtre)) 
				.collect(Collectors.toList());
		Collections.sort(filtreliSoru);
		filtreliSoru.forEach(soru->System.out.println("Soru metni : "+soru.soruFormati() )); 
		
	}

	private static void soruSiklariylaListeleme() {
		System.out.println("Soru metni uzerinden aranacak kelimeyi giriniz  ");
		String filtre = input.next().trim();
		
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> ((CoktanSecmeli) sorular).getA() .contains(filtre) || ((CoktanSecmeli) sorular).getB() .contains(filtre) || ((CoktanSecmeli) sorular).getC() .contains(filtre) || ((CoktanSecmeli) sorular).getD() .contains(filtre) ) 
				.collect(Collectors.toList());
		Collections.sort(filtreliSoru);
		filtreliSoru.forEach(soru->System.out.println("Soru metni : "+soru.soruFormati() )); 
		
	}


	private static void soruMetniyleListeleme() {
		System.out.println("Soru metni uzerinden aranacak kelimeyi giriniz  ");
		String filtre = input.next().trim();
				
		
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> sorular.getSoruMetni().contains(filtre)) 
				.collect(Collectors.toList());
		Collections.sort(filtreliSoru);
		filtreliSoru.forEach(soru->System.out.println("Soru metni :"+ soru.soruFormati() )); 
		
		
	}

	private static void soruCikarmaIslemi() {
		System.out.println("filtre kelime gir");
		String filtre = input.next().trim();
			
		List<Soru> filtreliSoru=  sorular.stream()
				.filter(sorular -> sorular.getSoruMetni().contains(filtre)) 
				.collect(Collectors.toList());
		filtreliSoru.forEach(soru->System.out.println("Soru metni : "+soru.soruFormati()+"------- " +"Soru ID : " + soru.getId()+"\n")); 
		System.out.println("Cikarmak istediginiz sorunun ID numarasini giriniz");
		String sil =input.next().trim();
		
		sorular.removeIf(soru-> soru.getId().equals(sil));
		
	}

	private static void soruEklemeIslemi() {
		
		int secim = -1;
		do {
			System.out.println("--------------SoruEklemeIslemleri-----------");
			System.out.println("Hangi tipte soru eklenecek");
			System.out.println("1.Coktan secmeli soru ekle");
			System.out.println("2.Bosluk doldurmali soru ekle");
			System.out.println("3.Klasik soru ekle");
			System.out.println("4.Dogru yanlis sorusu ekle");
			System.out.println("5. Ana menuye d�n");
			System.out.print("Seciminiz :  ");

			 secim = input.nextInt();

			switch (secim) {
			case 1:
				coktanSecmelisoruEklemeIslemi(); break;
			case 2:
				boslukDoldurmasoruEklemeIslemi(); break;
			
			case 3:
				klasiksoruEklemeIslemi(); break;
			
		    case 4:
				dogruYanlissoruEklemeIslemi(); break;
			}

	}while(secim!=5);

	}

	private static void coktanSecmelisoruEklemeIslemi() {
		System.out.println("Sorunun puanini giriniz " );
		int puan = input.nextInt();
		input.nextLine();
		System.out.println("Soru metinini  giriniz");
		String soruMetni = input.nextLine().trim();
		System.out.println("soru siklarini giriniz ");
		System.out.println("A b c d sikki girin: " );
		String a = input.nextLine().trim();
		//System.out.println("B : " );
		String b = input.nextLine().trim();
		//System.out.println("C : " );
		String c = input.nextLine().trim();
		//System.out.println("D : " );
		String d = input.nextLine().trim();
		
		System.out.println("Sorunun zorlugunu giriniz (kolay normal zor) " );
		String zorluk = input.nextLine().trim();
		System.out.println("Sorunun cevabini giriniz (A / B / C / D olarak) " );
		String cevap = input.nextLine().trim();
		System.out.println("Sorunun ID sini giriniz " );
		String id = input.nextLine().trim();
		Soru soru= new CoktanSecmeli( soruMetni,  puan, zorluk,a, b, c, d, cevap,id);
		sorular.add(soru);
		
	}

	private static void boslukDoldurmasoruEklemeIslemi() {
		
		System.out.println("Sorunun puanini giriniz " );
		int puan = input.nextInt();
		input.nextLine();
		System.out.println("Soru metinini  giriniz");
		String soruMetni = input.nextLine();
		
		
		System.out.println("Sorunun zorlugunu giriniz (kolay normal zor) " );
		String zorluk = input.nextLine().trim();
		System.out.println("Sorunun cevabini giriniz " );
		String cevap = input.nextLine().trim();
		System.out.println("Sorunun ID sini giriniz " );
		String id = input.nextLine().trim();
		
		Soru soru= new BoslukDoldurma( soruMetni,  puan, zorluk, cevap,id);
		sorular.add(soru);
		
	}

	private static void klasiksoruEklemeIslemi() {
		System.out.println("Sorunun puanini giriniz " );
		int puan = input.nextInt();
		input.nextLine();
		System.out.println("Soru metinini  giriniz");
		String soruMetni = input.nextLine();
		
		
		System.out.println("Sorunun zorlugunu giriniz (kolay normal zor) " );
		String zorluk = input.nextLine().trim();
		System.out.println("Sorunun cevabini giriniz " );
		String cevap = input.nextLine().trim();
		System.out.println("Sorunun ID sini giriniz " );
		String id = input.nextLine().trim();
		Soru soru= new Klasik( soruMetni,  puan, zorluk, cevap,id);
		sorular.add(soru);
		
	}

	private static void dogruYanlissoruEklemeIslemi() {
		System.out.println("Sorunun puanini giriniz " );
		int puan = input.nextInt();
		input.nextLine();
		System.out.println("Soru metinini  giriniz");
		String soruMetni = input.nextLine();
		
		
		System.out.println("Sorunun zorlugunu giriniz (kolay normal zor) " );
		String zorluk = input.nextLine().trim();
		System.out.println("Sorunun cevabini giriniz " );
		String cevap = input.nextLine().trim();
		System.out.println("Sorunun ID sini giriniz " );
		String id = input.nextLine().trim();
		Soru soru= new DogruYanlis( soruMetni,  puan, zorluk, cevap,id);
		sorular.add(soru);
		
	}

	private static int printMenu() {


		System.out.println("--------------SoruBankasiIslemleri-----------");
		System.out.println("1.Soru Ekle");
		System.out.println("2.Soru Cikar");
		System.out.println("3.Sorulari listele");
		System.out.println("4.Sinav Olustur");
		System.out.println("5.Cikis ");
		System.out.print("Seciminiz :  ");

		int secim = input.nextInt();
		return secim;
	}
	

}
