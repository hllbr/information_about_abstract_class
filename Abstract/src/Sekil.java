
public abstract class Sekil {//abstract class
    //bu yapının abstract olamsı için bir anahtaqr kelimeye ihtiyacımız var bu kelime abstract
    private String isim ;

    public Sekil(String isim) {
        this.isim = isim;
    }
    //bir metod yazıyoruz ve bu metod abstract olmayacak 
    public void ismini_soyle(){
        System.out.println("bu obje "+isim+" objesidir.");
    }
    //bir classın abstract olması için gerekli bir şart var soyut yani gövdesiz metod eklememiz gerek
    //buradan türetilen alt classlar bu abstract classı kendine göre türetmek zorunda
    abstract void alan_hesapla();//neden abstract olarak tanımladık daire de üçgünde karede alan aynı yöntemle hesaplanmıyor bunların tek ortak noktası alanlarının hesaplanabiliyor olmasıdır.Alan hesaplama yöntemleri ise birbirlerinden farklıdır işte bu yüzden abstract olarak tanımladık
        
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    //abstract classlarda getter setter constructor bulunabiliyor exstra özellikler de bulunabilir sout somut sorunsuz sıkıntı oluşturmuyor.
}
