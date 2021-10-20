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
		Soru m= new CoktanSecmeli( "Beyin ve omuriliði saran zarlara ne ad verilir? ",  10,"zor","Meninks", "Meningosel", "Myelit", "Ensefalit", "A","30");
		Soru c= new CoktanSecmeli( "Ürün ve hizmetlerin pazarlanmasý ve\r\n"
				+ "satýþýnýn yapýlmasý ile ilgili faaliyetler\r\n"
				+ "iþletmelerin aþaðýdaki faaliyet alanlarýndan\r\n"
				+ "hangisiyle ilgilidir?",  15,"kolay","Ticaret", "Endüstri", "Ýmalat", "Hizmet", "B","4");
		Soru d= new CoktanSecmeli( "Bir ülkenin farklý bölgelerinin, o ülkede elde\r\n"
				+ "edilen toplam gelirden aldýðý payý gösteren\r\n"
				+ "gelir daðýlýmý aþaðýdakilerden hangisidir?",  10,"normal","Fonksiyonel", "Bölgesel", "Kiþisel", "Sektörel", "B","41");
		Soru f= new CoktanSecmeli( "Bir ülkenin farklý bölgelerinin, o ülkede elde\r\n"
				+ "edilen toplam gelirden aldýðý payý gösteren\r\n"
				+ "gelir daðýlýmý aþaðýdakilerden hangisidir?",  15,"normal","Fonksiyonel gelir daðýlýmý", "Bölgesel gelir daðýlýmý", "Kiþisel gelir daðýlýmý", "Sektörel gelir daðýlýmý", "A","77");
		Soru g= new CoktanSecmeli( "Aþaðýdakilerden hangisi kendini gerçekleþtirmekte\r\n"
				+ "olan bireyin özelliklerinden biri deðildir? ",  10,"zor","Zamaný iyi kullanmasý", "Kendine saygý duymasý", "Kim olduðu konusunda gerçekçi bir görüþünün\r\n"
						+ "olmasý", "Yeterli bir kiþiliðe sahip olduðunu düþünmesi", "D","32");
		Soru j= new CoktanSecmeli( "Ýkinci Dünya Savaþý hangi yýllar\r\n"
				+ "arasýnda gerçekleþmiþtir?",  10,"kolay","1920-1925", "1926-1930", "1935-1938", "1939-1945", "D","61");
		Soru l= new CoktanSecmeli( "2x – 3 = 5 denkleminde x kaçtýr?",  5,"kolay","– 4", "– 1", "4", "3", "C","87");
		Soru fm= new CoktanSecmeli( "Aþaðýdakilerden hangisi bisikletle ilgili\r\n"
				+ "kazalarýn önlenmesinde alýnabilecek\r\n"
				+ "tedbirlerden biri deðildir?",  15,"zor","Baþa güvenli bir kask takýlmamasý", "Yaðýþlý günlerde bisiklet kullanýlmamasý", "Uzun ve bol pantolonla bisiklet\r\n"
						+ "kullanýlmamasý", "Bisikletin oturma yüksekliðinin çocuðun\r\n"
								+ "boyuna uygun olmasý", "A","7");
		Soru m1= new CoktanSecmeli( "Aþaðýdakilerden hangisi bisikletle ilgili kazalarýn\r\n"
				+ "önlenmesinde alýnabilecek önlemlerden biri\r\n"
				+ "deðildir? ",  10,"zor","Bandana takýlarak bisiklet kullanýlmasý", "Trafiðin sakin olduðu yerlerde bisiklete binilmesi", "Kuru havalarda bisiklet kullanýlmasý", "Bisikletin oturma yüksekliðinin kullanan kiþinin\r\n"
						+ "boyuna uygun olmasý", "D","23");
		Soru c3= new CoktanSecmeli( "Aþaðýdakilerden hangisi kurumlar vergisi\r\n"
				+ "mükelleflerinden biridir? ",  10,"kolay","Anonim þirket", "Limited þirket", "Eshamlý komandit þirket", "Ýþ ortaklýðý", "B","71");
		Soru de= new CoktanSecmeli( "Aþaðýdakilerden hangisi Türk hukukundaki aslî\r\n"
				+ "yazýlý hukuk kaynaklarýndan biri deðildir?",  15,"normal","Yargý kararlarý", "Yasa", " Kanun Hükmünde Kararname", "Kanun", "C","65");
		Soru fs= new CoktanSecmeli( "Aþaðýdakilerden hangisi bilimsel yazý türlerinden biri deðildir?",  15,"normal","Hikâye", "Makale", "Rapor", "Tez", "A","12");
		

		Soru m2= new Klasik("Geliþme  Ýletiþimi  yaklaþýmýnýn  temel  sorularý  nelerdir?  Bu  sorularý  yanýtlarken  hangi varsayýmlar temel alýnmaktadýr?",20,"zor","cevap","11");
		Soru m3= new Klasik("1980’lerde  baþlayan  yeniden  yapýlanma  sürecinde  iletiþimin  gösterdiði  yeni  özellikler nelerdir?",10,"normal","cevap","15");
		Soru m4= new Klasik("Hiyerarþik  kavramsallaþtýrmada,  enformasyonun  baþka  hangi  kavramlarla,  nasýl iliþkilendirildiðini açýklayýnýz?",15,"normal","cevap","16");
		Soru m5= new Klasik("Sanayi Sonrasý Toplum kavramýnýn ortaya çýkýþ nedenlerini tartýþýnýz?",30,"zor","cevap","1777");
		Soru m6= new Klasik("Teknolojik  determinizm”  ve  bu  yaklaþýmýn  eleþtiren  yaklaþýmlarý  açýklayýnýz?  Bu yaklaþýmlarý temel alarak internete iliþkin birercümle kurunuz?",15,"normal","cevap","1771");
		Soru m7= new Klasik("Yeni  iletiþim  teknolojileri’ni  tanýmlayýnýz?  Yeni  iletiþim  teknolojilerini  kitle  iletiþim teknolojilerinden ayýran özellikler nelerdir? Bir örnek üzerinde açýklayýnýz?",20,"zor","cevap","8911");
		Soru m8= new Klasik("Bilgi, veri ve enformasyon arasýndaki iliþkileri tanýmlayýnýz?",15,"normal","cevap","9611");
		Soru m9= new Klasik("Ricordo’nun karþýlaþtýrmalý üstünlükler teorisini anlatýnýz. Bu teoriye yöneltilen eleþtirileri tartýþýnýz",10,"normal","cevap","8511");
		Soru m10= new Klasik("Tam rekabet piyasasýnda faaliyet gösteren bir firmanýn kýsa dönem arz eðrisini þekil yardýmýyla açýklayýnýz",5,"kolay","cevap","6311");
		Soru m11= new Klasik("Vergiden kaçýnma ile vergi kaçakçýlýðýný tarif ederek, aralarýndaki farký belirtiniz.",20,"zor","cevap","12581");
		Soru m12= new Klasik("Ceza hukuku kurallarýnýn yer itibariyle uygulanmasýndaki esaslarý anlatýnýz.",25,"zor","cevap","1961");
		Soru m13= new Klasik("Çaðdaþ bütçe teorilerini sýralayarak kýsaca açýklayýnýz.",25,"zor","cevap","119654");
		Soru m14= new Klasik("Para arzýný kontrol etmek için para politikasýndan sorumlu otoritenin kullanabileceði araçlarý sayarak kýsaca açýklayýnýz",10,"normal","cevap","1581");
		Soru m15= new Klasik("Ticaret hukukuna göre hisse senetleri ve tahvilleri tanýmlayarak bunlarýn sahiplerine saðladýðý hak ve yükümlülükleri açýklayýnýz",10,"normal","cevap","13571");
		Soru m16= new Klasik("Hak ve fiil ehliyeti kavramlarýný açýklayýnýz. Fiil ehliyetinin þartlarýný sayarak kýsaca açýklayýnýz",10,"normal","cevap","11591");
		
		Soru m17=new DogruYanlis("Gökyüzü kapkara olduðunda kar yaðar", 2, "kolay", "D", "123");
		Soru m18=new DogruYanlis("Yeryüzündeki sular büyük kütleler hâlinde havaya karýþýr.", 2, "kolay", "D", "1234");
		Soru m19=new DogruYanlis("Hava yeryüzünden yükseðe çýktýkça ýsýnýr.", 2, "kolay", "Y", "1238");
		Soru m20=new DogruYanlis("Sýcak maddeler, ýsý verdiði için soður; soðuk maddeler de ýsý aldýðý için ýsýnýr.", 2, "kolay", "D", "1235");
		Soru m21=new DogruYanlis(" Isý ve sýcaklýk ayný kavramlardýr.", 2, "kolay", "Y", "1236");
		Soru m22=new DogruYanlis(" Isý, kalorimetre kabý ile ölçülür.", 2, "kolay", "D", "1237");
		
		Soru m23=new BoslukDoldurma("Ýnsanlar tuhaftýr, ---- bir þey yapmakta olduklarýný hissedecek olurlarsa mutlaka en evvel vicdanlarýný ----\r\n"
				+ "bir sebep bulurlar", 5, "kolay", "cevap", "8541");
		Soru m24=new BoslukDoldurma("“Vatan Þairi” ve “Hürriyet Þairi” olarak ---- Namýk Kemal, þiirin yaný sýra tenkit, biyografi, tiyatro, roman,\r\n"
				+ "tarih ve makale türlerinde ---- verdi", 5, "kolay", "cevap", "8542");
		Soru m25=new BoslukDoldurma("Yeteneklerini, hayattan beklentilerini biyolojik saati\r\n"
				+ "---- baþladýðýnda duyumsamaya baþlayan insan, o\r\n"
				+ "günden itibaren de kendini ---- yolculuðuna çýkar.", 5, "kolay", "cevap", "8543");
		Soru m26=new BoslukDoldurma("Ocak 2018’de Çin’deki ----, kopya koyun Dolly’nin\r\n"
				+ "Ýskoçya’da dünyaya gelmesini saðlayan karmaþýk\r\n"
				+ "DNA transfer yöntemini kullanarak Zhong Zhong ve\r\n"
				+ "Hua Hua adlý yengeç yiyen iki makak maymununu ----\r\n"
				+ "duyurdular", 5, "kolay", "cevap", "8544");
		Soru m27=new BoslukDoldurma("5. Metin resim dengesinin gözetildiði bu grup öykü kitaplarý, okul öncesindeki çocuklara ---- gibi, ilköðretimle birlikte okuma yazma ---- çocuklarýn kendi okuyabilecekleri ilk kitaplar olma özelliðini de taþýyor.", 5, "kolay", "cevap", "8545");
		Soru m28=new BoslukDoldurma("Pirinç Han, Sultan II. Bayezid tarafýndan Ýstanbul’daki vakýflarýna ---- amacýyla 1508 yýlýnda yaptýrýlan\r\n"
				+ "handýr ve alt katta 38, üst katta 48 oda bulunur; ----\r\n"
				+ "avlusunda on altýgen þadýrvanýn bugün hâlâ izleri\r\n"
				+ "görülmektedir", 5, "kolay", "cevap", "8546");

		List<Soru> hazirSorular= Arrays.asList(m,c,d,f,g,f,j,l,fm,m1,c3,de,fs,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28);
		sorular.addAll(hazirSorular);
		System.out.println("Hazir sorular eklensin mi silinsin mi (eklemek için Y ' ye basiniz)");
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
			System.out.println("4. Ana menuye dön");
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
			System.out.println("Neye göre filtrelensin ");
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
			System.out.println("5. Ana menuye dön");
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
