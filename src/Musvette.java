import java.util.Scanner;

public class Musvette {
    public static void main(String[] args) {
        int sayi = 4569;
        Scanner in = new Scanner(System.in);
        boolean dogruSayi = false;
        int[] inputBasamak = new int[4];
        while (!dogruSayi) {
            System.out.println("Tahmininizi giriniz: ");
            int tahmin = in.nextInt();
            //System.out.println("Tahmininiz: " + tahmin);
            int cep = tahmin;
            for (int i = 0; i < 4; i++) {
                int x = 0;
                x = tahmin % 10;
                tahmin = tahmin / 10;
                inputBasamak[i] = x;
                // System.out.println((i + 1) + ".basamak = " + inputBasamak[i]);
            }
            if (inputBasamak[0] == inputBasamak[1] || inputBasamak[0] == inputBasamak[2] || inputBasamak[0] == inputBasamak[3]) {
                System.out.println("Hatali Sayi Girdiniz!");
            } else if (inputBasamak[1] == inputBasamak[2] || inputBasamak[1] == inputBasamak[3]) {
                System.out.println("Hatali Sayi Girdiniz!");
            } else if (inputBasamak[2] == inputBasamak[3]) {
                System.out.println("Hatali Sayi Girdiniz!");
            } else if (inputBasamak[0] == 0 || inputBasamak[1] == 0 || inputBasamak[2] == 0 || inputBasamak[3] == 0) {
                System.out.println("Hatali Sayi Girdiniz!");
            } else {
                System.out.println("Dogru sayi girdiniz: ");
               /* for (int k = 0; k < 4; k++) {
                    if (basamak[0] == inputBasamak[0]) {
                        System.out.printf("+");
                    } else if (basamak[1] == inputBasamak[1]) {
                        System.out.printf("+");
                    } else if (basamak[2] == inputBasamak[2]) {
                        System.out.printf("+");
                    } else if (basamak[3] == inputBasamak[3]) {
                        System.out.printf("+");
                    } else if (basamak[0] == inputBasamak[1]) {
                        System.out.printf("-");
                    } else if (basamak[0] == inputBasamak[2]) {
                        System.out.printf("-");
                    } else if (basamak[0] == inputBasamak[3]) {
                        System.out.printf("-");
                    } else if (basamak[1] == inputBasamak[2]) {
                        System.out.printf("-");
                    } else if (basamak[1] == inputBasamak[3]) {
                        System.out.printf("-");
                    } else if (basamak[2] == inputBasamak[3]) {
                        System.out.printf("-");
                    } else {
                        System.out.printf("");
                    }
                }
            }
        }*/
            }
        }
    }
}
