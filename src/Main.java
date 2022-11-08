import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ürünlerin toplam fiyatını hesaplamak için, aşağıya kilolarını yazınız.");
        /*Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL */

        double armutKg = 2.14, elmaKg = 3.67;
        double domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5.00;
        double armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen armutun kilosunu giriniz : ");
        armut = input.nextDouble();
        System.out.print("Lütfen elmanın kilosunu giriniz :");
        elma = input.nextDouble();
        System.out.print("Lütfen domatesin kilosunu giriniz :");
        domates = input.nextDouble();
        System.out.print("Lütfen muzun kilosunu giriniz :");
        muz = input.nextDouble();
        System.out.print("Lütfen patlıcanın kilosunu giriniz :");
        patlican = input.nextDouble();

        double toplamFiyat = (armut * armutKg) + (elmaKg * elma) + (domatesKg * domates) + (muzKg * muz) + (patlicanKg * patlican);

        System.out.print("Toplam Fiyat : " + toplamFiyat);
    }
}