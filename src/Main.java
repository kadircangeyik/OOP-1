import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcının girdiği bilgileri okumak için scanner sınıfından bir nesne türetiyoruz.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcı Bilgileri  Oluşturuyoruz.(Username,Password)
        String kullanici_Adi = "Emre";
        String sifre = "1234";

        //Kullanıcının Kaç Defa Denediğini Kontrol Etmek İçin Bir Değişken Oluşturuyoruz.
        int deneme_Sayisi = 0;

        //Kullanıcı sürekli girdi denemeleri yapabilsin diye while döngüsü kullanıyoruz.
        while (true){
            //Kullanıcı Bilgilerini Okuyoruz.
            System.out.println("Kullanıcı Adınız:");
            String kullaniciadioku = scanner.nextLine();
            System.out.println("Şifreniz:");
            String sifreoku = scanner.nextLine();

            //Kullanıcı bilgileri eşleşiyorsa hoşgeldin mesajı veriyoruz.
            if (kullaniciadioku.equals(kullanici_Adi) && sifreoku.equals(sifre))
            {
                System.out.println("Hoşgeldiniz Emre! \n Kullanıcı Bilgileriniz: \n Kullanıcı Adı: Emre \n Şifre: 1234 \n Oturumu Kapatmak İçin 'E' Tuşuna Basınız.");
                if (scanner.nextLine().equals("E"))
                {
                    System.out.println("Oturum Kapatıldı. Güle Güle Emre!");
                    break;
                }
            }

            //Eşleşmiyorsa kullanıcıya hata mesajı veriyoruz.
            else
            {
                deneme_Sayisi++; //Deneme Sayisini 1 arttırıyoruz...

                //Deneme sayisi 3 olduğunda oturumu mesajla birlikte girişi sonlandırıyoruz.
                if (deneme_Sayisi == 3) {
                    System.out.println("3 defa hatalı giriş yaptınız. Giriş Başarısız.");
                    break;
                }

                else
                {
                    System.out.println("Yanlış kullanıcı adı veya şifre. Tekrar deneyiniz." + "\n Kalan Deneme Hakkınız: " + (3 - deneme_Sayisi));
                }
            }
        }
    }
}