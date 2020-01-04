package prolab2;
import javax.swing.*;
public class Psyduck extends Pokemon {
    //resim eklenecek
private String resimUzantı = "C:/Users/x/Documents/NetBeansProjects/PROLAB2/src/prolab2/fotolar/Psyduck.jpg";
    private ImageIcon resim = new ImageIcon(resimUzantı);
    private int hasarPuani = 20;
    public int kullanma1=0;
    //yapıcılar oluşturulacak
    public Psyduck(int hasarpuani, int pokemonID, String pokemonAdi, String pokemonTip) {
        super(pokemonID, pokemonAdi, pokemonTip);
        this.hasarPuani = hasarpuani;
    }
    public Psyduck() {
        super();
    }
    //hasar puanı gösterme

    @Override
    public int hasarPuaniGoster() {
                return this.hasarPuani;
    }
    
   public ImageIcon resimUzantı() {
        return resim;
    }

    @Override
    public int getHasarPuani() {
        return this.hasarPuani;
    }

    @Override
    public void setHasarPuani(int HasarPuani) {
        this.hasarPuani = HasarPuani;
    }
    @Override
    public boolean kartKullanildiMi(int a){
          if(a==1)
              return true;
          else
              return false;
    }
    
}
