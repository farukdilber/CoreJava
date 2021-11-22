package d04_SwitchCase;

import java.util.Scanner;

public class C06_Q5_Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("******** Seyehat Acentemize Hoþgeldiniz ********");
        System.out.println("Frankfurt : 60 Km\n" + "Köln : 80 Km\n" + "20 Km baþýna 5 euro bilet parasý alýnmaktadir.");
        System.out.println("************************************************");

        System.out.print("Nereye yolculuk etmek istiyorsunuz:  ");
        String islem = scanner.nextLine();
        String islem2 = islem.toUpperCase();

        double toplamTutar = 0;
        double bakiye = 100;

        double FrankfurtKm = (60 / 20) * 5;
        double KolnKm = (80 / 20) * 5;

        switch (islem2) {
            default:
                System.out.println("Hatalý giriþ yaptýnýz...");
                break;

            case "FRANKFURT":
                System.out.println("Rota = Frankfurt ");
                System.out.println("Frankfurt " + FrankfurtKm + " Euro");

                System.out.print("Kaç kiþilik bilet istiyorsunuz? (Max 2 kiþilik olabilir): ");
                String islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Kiþilik");
                        System.out.println("Ýstikamet: Frankfurt - 1 Kiþilik");
                        toplamTutar = FrankfurtKm;
                        break;

                    case "2":
                        System.out.println("2 Kiþilik");
                        toplamTutar = FrankfurtKm * 2;
                        System.out.println("Ýstikamet: Frankfurt - 2 Kiþilik");
                        break;

                    default:
                        System.out.println("Hatalý giriþ yaptýnýz...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                double paraustu = bakiye - toplamTutar;
                System.out.println("Para üstü = " + paraustu);
                break;


            case "KOLN":
                System.out.println("Rota = Koln ");
                System.out.println("Koln " + KolnKm + " Euro");

                System.out.print("Kaç kiþilik bilet istiyorsunuz? (Max 2 kiþilik olabilir): ");
                islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Kiþilik");
                        System.out.println("Ýstikamet: Koln - 1 Kiþilik");
                        toplamTutar = KolnKm;
                        break;

                    case "2":
                        System.out.println("2 Kiþilik");
                        toplamTutar = KolnKm * 2;
                        System.out.println("Ýstikamet: Koln - 2 Kiþilik");
                        break;

                    default:
                        System.out.println("Hatalý giriþ yaptýnýz...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                paraustu = bakiye - toplamTutar;
                System.out.println("Para üstü = " + paraustu);


        }
        scanner.close();
	}

}
