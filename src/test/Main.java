package test;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 0; // random üretilecek sayi
        Scanner in = new Scanner(System.in);
        int[] basamak = new int[4]; // hedef sayının basamak değerlerinin tutalacağı dizi
        int[] inputBasamak = new int[4]; // kullanıcının girdiği sayının basamak değerlerini tutacak dizi
        boolean kontrol = false;
        int cep=0;
        while (!kontrol) {
            a = 1234 + (int) (Math.random() * 8642);
            //System.out.println("a sayisi: " + a);
            cep = a;
            for (int i = 0; i < 4; i++) {
                int b = 0;
                b = a % 10;
                a = a / 10;
                basamak[i] = b;
                // System.out.println((i + 1) + ".basamak = " + basamak[i]);
            }
            if (basamak[0] == basamak[1] || basamak[0] == basamak[2] || basamak[0] == basamak[3]) {
                kontrol = false;
            } else if (basamak[1] == basamak[2] || basamak[1] == basamak[3]) {
                kontrol = false;
            } else if (basamak[2] == basamak[3]) {
                kontrol = false;
            } else if (basamak[0] == 0 || basamak[1] == 0 || basamak[2] == 0 || basamak[3] == 0) {
                kontrol = false;
            } else {
                kontrol = true;
            }
        }
        //System.out.println("cep sayisi: " + cep);
        int tahmin=0;
        int temp=0;
        System.out.println("-----4 BASAMAKLI SAYI TAHMIN ETME OYUNUNA HOSGELDINIZ-----");
        System.out.println("-Tahminleriniz sonucunda size ipucu verilecek ve bu ipucuyla sayiyi tahmin etmeye calisacaksiniz.");
        System.out.println("-Basamagini ve degerini dogru bildiginiz her sayi icin +\n-Basamagini yanlis, degerini dogru bildiginiz her tahmin icin - ipucu gelecektir.");
        System.out.println("-Bilemediginiz sayilar icin bir sey yazilmayacaktir");
        System.out.println("-4 Basamakli sayiniz 0 ve tekrar iceren sayi bulunduramaz!!!");
        System.out.println("-HADI BASLAYALIM!");
        while (temp!=cep) {
            System.out.println("\nTahmininizi giriniz: ");
            tahmin = in.nextInt();
            temp=tahmin;
            //System.out.println("Tahmininiz: "+tahmin);

            for (int j = 0; j < 4; j++) {
                int x = 0;
                x = tahmin % 10;
                tahmin = tahmin / 10;
                inputBasamak[j] = x;
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
                for (int k = 0; k < 4; k++) {
                    for(int z=0; z<4;z++){
                        if(basamak[k]==inputBasamak[z] && k==z){
                            System.out.print("+");
                        } else if (basamak[k]==inputBasamak[z] && k!=z) {
                            System.out.print("-");
                        }
                    }
                }
            }
        }
        System.out.println("\nTEBRIKLER KAZANDINIZ!!!");
    }
}