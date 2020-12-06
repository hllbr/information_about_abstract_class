
public class Kare extends Sekil{
//bir adet kenar eklemeliyiz ki alan hesaplayabilelim
    private int kenar ;
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar ;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() +" alanı : "+(kenar*kenar));
    }
    //çevre hesaplamak için extra bir metod yazıyoruz
    public void cevre_hesapla(){
        System.out.println(getIsim()+" Çevresi :" +(4*kenar));
    }
}
