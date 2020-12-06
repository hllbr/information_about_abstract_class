
public class Daire extends Sekil{
    private int yarı_cap;

    public Daire(String isim,int yarı_cap) {
       // bize kendi constructorumuzu yazmamız gerektiğini java kendisi söyledi
       super(isim);
       this.yarı_cap = yarı_cap ;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() +" alanı : "+(double)(Math.PI*yarı_cap*yarı_cap));
    }
    
    
}
