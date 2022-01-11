package sorular2;

public class C12_Q12arrays {

	public static void main(String[] args) {
		/*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
        (Ignore case sensitivity)
        Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
      input : Learning java is easy
      output: maximumCounts occurring character is : a
       */
        String str = "Leerning java is easy";
        int[] yeni = new int[str.length()];
        char minChar=str.charAt(0),maxChar=str.charAt(0);
        int i,j,max,min;
        char string[]=str.toCharArray();
        for ( i = 0; i < string.length; i++) {
			yeni[i]=1;
			for ( j = i+1; j < string.length; j++) {
				if (string[i]==string[j]&&string[i]!= ' '&&string[i]!='0') {
					yeni[i]++;
					string[j]='0';
					
				}
			}
		}
                    min = max=yeni[0];
					for ( i = 0; i < yeni.length; i++) {
//						if (min>yeni[i] && yeni[i]!='0') {
//							min=yeni[i];
//							minChar=string[i];
//						}
						if (max<yeni[i]) {
							max=yeni[i];
							maxChar=string[i];
						}
					}
//					System.out.println("En az bulunun karakter :" + minChar);
					System.out.println("En fazla bulunun karakter : " + maxChar);
}
}