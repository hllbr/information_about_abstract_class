/*
Abstract classlar ve özellikleri ?
*inheratnce ile bir üst sınıfın özelliklerini ile alt sınıflar türetiyorduk(üst sınıfın özellik ve metoflarını kullanabiliyorduk
**isteiğimize göre bu metodları override ediyor yada etmiyorduk
*interfaceler de ise kod bloklarına metodları yazıyorduk bu interfaceleri implemente eden tüm classlar bu metotları kendilerine göre yazıyorduk
***Eğer biz override edilmesi gerekmeyen metodları ve mutlaka ve mutlaka override edilmesi gerekn metodları bir classta biriktirip daha sonra bu classtan alt sınıflar türermek istersek Abstract yani soyut sınıfları kullanmamız gerekiyor.
***Abstractların bu yapısı interface ve inheratance arasında bir yapı gibi düşünülebilir
***Abstaract classların özellikleri = 
abstract classlardan interfacelerde olduğu gibi objeler oluşturamıyoruz
abstract classların referansları alt sınıflara direkt olarak referans olabiliyor
abstract classlarda hem gövdeli hem gövdesiz metodlar bir arada bulunur.
(yani hem soyut hemde somut metotlar birarada bulunuyor)
**Abstract classlara özellik eklenebiliyor.
yani normal bir classa özellik eklemek gibi abstract classlara özellik ekleyebiliyoruz.
ve bir classın abstract olması demek en az bir adet gövdesiz yani soyut metodu bulunması demektir.
Kod tekrarlarından kurtarır bizi 

*/
public class Main {
    public static void main(String[] args) {
       // Sekil sekil = new Sekil("Sekil");Hatalı ikinci ksıımda bize hata veriyor.bize objeyi burda oluşturamassın şeklinde bir hata veriliyor
       
       Sekil sekil ;//Sekil classından sekil referansı oluşturduk
       sekil = new Kare("kare2", 6);//burda referans üzerinden bir obje oluturmuş olduk inhertance'a benzer ama değil.
       System.out.println("----------------------------------------------");
       
       
       Kare kare = new Kare("Kare", 5);
       Daire daire = new Daire("Daire", 3);
       daire.alan_hesapla();
       System.out.println("----------------------------------------------");
       kare.alan_hesapla();
       System.out.println("----------------------------------------------");
       sekil.alan_hesapla();
       System.out.println("----------------------------------------------");
       kare.cevre_hesapla();
       System.out.println("----------------------------------------------");
       //eğer sekil.cevre_hesapla dersek-->bize sıkıntı çıkarılır çünkü şekil aslında bir abstracttır.
       //bu sorun interfacelerde de bulunan bir sorun
       //sekil.cevre_hesapla();

    }
    
}
