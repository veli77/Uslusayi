import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int taban, us, sonuc=1;

        System.out.println("Ussu alınacak sayıyı giriniz: ");
        taban = giris.nextInt();
        System.out.println("Ussu giriniz: ");
        us = giris.nextInt();

        for(int i=1;i<=us;i++){
            sonuc = sonuc * taban;
        }
        System.out.println(sonuc);

    }
}
