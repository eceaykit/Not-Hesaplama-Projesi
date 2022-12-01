import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //Değişkenleri göster
       int mat,fizik,tarih,kimya,turkce,muzik;

       //Scanner sınıfı belirt
               Scanner inp = new Scanner(System.in);

       //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce =inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

//Not ortalaması hesaplaması için toplama formülünü yaz.
        int toplam = (mat + fizik + tarih + kimya + turkce + muzik);
        double sonuc = (toplam / 6.0);
        System.out.println("Ortalamanız: " +sonuc);

//Sınıfı geçme koşullarını belirle.
         boolean kosul = (sonuc >= 60);
         String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
     System.out.print("Durum: " +str);

    }
}
