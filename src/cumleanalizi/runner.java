package cumleanalizi;

public class runner {


	public static void main(String[] args) {
		String[] islemdizisi= {"topla","��kart","�arp","b�l","fark","kere"};
		String[] metinsayi= {"bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		String[] rakamsayi= {"1","2","3","4","5","6","7","8","9"};
		
		String ifade ="5 ile 9 u topla";
		
	    String[] ifadedizisi = ifade.split(" ");
	    int sayi1=0,sayi2=0;
	    String islem="";
	    int sayac=0;
	    for (String kelime : ifadedizisi) {
			
	    	for (String item : islemdizisi) {
				if(item.equals(kelime)==true)islem=kelime;
			}// i�lem dizisi d�ng�s�
	    	
	    	for (String item : rakamsayi) {
				if(item.equals(kelime)==true)
				{
					if(sayac==0)
					sayi1=Integer.parseInt(item);
					else if(sayac==1)
					sayi2=Integer.parseInt(item);
					
					sayac++;
				}
	    		
			}//rakamsayi dizisi d�ng�s�
		
	    	
	    
	    }// ifadedizisi d�ng�s�
	    
	    System.out.println(islem);
		
		System.out.println(sayi1);
		System.out.println(sayi2);

	}// Main Method sonu

	
}
