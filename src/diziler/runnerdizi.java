package diziler;

public class runnerdizi {

	
	public static void main(String[] args) {
		String[][] ogrencimatrisi = new String[100][4];
		
		for (int i = 0; i < 100; i++) {
			ogrencimatrisi[i][0]=i+". Öðrenci";
			ogrencimatrisi[i][1]="15";
			ogrencimatrisi[i][2]="45";
			ogrencimatrisi[i][3]="90";
						
		}
		
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ogrencimatrisi[i][j]+" - ");
			}
			System.out.println();
		}
		
	}
}
