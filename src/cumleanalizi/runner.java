package cumleanalizi;

public class runner {


	public static void main(String[] args) {
		String[] islemdizisi= {"topla","çýkart","çarp","böl","fark","kere"};
		String[] metinsayi= {"bir","iki","üç","dört","beþ","altý","yedi","sekiz","dokuz"};
		String[] rakamsayi= {"1","2","3","4","5","6","7","8","9"};
		
		String ifade ="5 ile 9 u topla";
		
	    String[] ifadedizisi = ifade.split(" ");
	    int sayi1=0,sayi2=0;
	    String islem="";
	    int sayac=0;
	    for (String kelime : ifadedizisi) {
			
	    	for (String item : islemdizisi) {
				if(item.equals(kelime)==true)islem=kelime;
			}// iþlem dizisi döngüsü
	    	
	    	for (String item : rakamsayi) {
				if(item.equals(kelime)==true)
				{
					if(sayac==0)
					sayi1=Integer.parseInt(item);
					else if(sayac==1)
					sayi2=Integer.parseInt(item);
					
					sayac++;
				}
	    		
			}//rakamsayi dizisi döngüsü
		
	    	
	    
	    }// ifadedizisi döngüsü
	    
	    System.out.println(islem);
		
		System.out.println(sayi1);
		System.out.println(sayi2);

	}// Main Method sonu

	
}
