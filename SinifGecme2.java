import java.util.Scanner;

public class SinifGecme2 {
    public static void main(String[] args) {

        double matematik, fizik, türkce, kimya, muzik, ortalama =0, sonuc =0 ;
        int bDers =0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        matematik = inp.nextDouble();

        if (matematik >= 0 && matematik <= 100) {
            ortalama += matematik;
            bDers +=1;

        } else {
            System.out.println("Notunuz 0 ve 100 arasında olmadığından değerlendirmeye alınmamıştır !");

        }
        System.out.print("Fizik notunuz :");
        fizik = inp.nextDouble();

        if (fizik >= 0 && fizik <= 100) {
            ortalama += fizik;
            bDers +=1;

        } else {
            System.out.println("Notunuz 0 ve 100 arasında olmadığından değerlendirmeye alınmamıştır !");
        }
        System.out.print("Türkçe notunuz :");
        türkce = inp.nextDouble();

        if (türkce >= 0 && türkce <= 100) {
            ortalama += türkce;
            bDers +=1;

        } else {
            System.out.println("Notunuz 0 ve 100 arasında olmadığından değerlendirmeye alınmamıştır !");
        }
        System.out.print("Kimya notunuz :");
        kimya = inp.nextDouble();

        if (kimya >= 0 && kimya <= 100) {
            ortalama += kimya;
            bDers +=1;

        } else {
            System.out.println("Notunuz 0 ve 100 arasında olmadığından değerlendirmeye alınmamıştır !");
        }
        System.out.print("Müzik notunuz :");
        muzik = inp.nextDouble();

        if (muzik >= 0 && muzik <= 100) {
            ortalama += muzik;
            bDers +=1;
        } else {

            System.out.println("Notunuz 0 ve 100 arasında olmadığından değerlendirmeye alınmamıştır !");
        }

        sonuc = ortalama / bDers;

        if (sonuc >= 55) {
            System.out.println("Sınıfı geçtiniz :" + sonuc);
        } else {

            System.out.println("Sınıf tekrarı :" + sonuc);
        }
    }


}


