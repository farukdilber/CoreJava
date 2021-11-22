package d04_SwitchCase;

import java.util.Scanner;

public class C06_Q5_Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("******** Seyehat Acentemize Ho�geldiniz ********");
        System.out.println("Frankfurt : 60 Km\n" + "K�ln : 80 Km\n" + "20 Km ba��na 5 euro bilet paras� al�nmaktadir.");
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
                System.out.println("Hatal� giri� yapt�n�z...");
                break;

            case "FRANKFURT":
                System.out.println("Rota = Frankfurt ");
                System.out.println("Frankfurt " + FrankfurtKm + " Euro");

                System.out.print("Ka� ki�ilik bilet istiyorsunuz? (Max 2 ki�ilik olabilir): ");
                String islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Ki�ilik");
                        System.out.println("�stikamet: Frankfurt - 1 Ki�ilik");
                        toplamTutar = FrankfurtKm;
                        break;

                    case "2":
                        System.out.println("2 Ki�ilik");
                        toplamTutar = FrankfurtKm * 2;
                        System.out.println("�stikamet: Frankfurt - 2 Ki�ilik");
                        break;

                    default:
                        System.out.println("Hatal� giri� yapt�n�z...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                double paraustu = bakiye - toplamTutar;
                System.out.println("Para �st� = " + paraustu);
                break;


            case "KOLN":
                System.out.println("Rota = Koln ");
                System.out.println("Koln " + KolnKm + " Euro");

                System.out.print("Ka� ki�ilik bilet istiyorsunuz? (Max 2 ki�ilik olabilir): ");
                islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Ki�ilik");
                        System.out.println("�stikamet: Koln - 1 Ki�ilik");
                        toplamTutar = KolnKm;
                        break;

                    case "2":
                        System.out.println("2 Ki�ilik");
                        toplamTutar = KolnKm * 2;
                        System.out.println("�stikamet: Koln - 2 Ki�ilik");
                        break;

                    default:
                        System.out.println("Hatal� giri� yapt�n�z...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                paraustu = bakiye - toplamTutar;
                System.out.println("Para �st� = " + paraustu);


        }
        scanner.close();
	}

}
