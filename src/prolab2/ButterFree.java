package prolab2;
import javax.swing.*;
public class ButterFree extends Pokemon {
    //resim eklenecek
    private String resimUzantı = "C:/Users/x/Documents/NetBeansProjects/PROLAB2/src/prolab2/fotolar/ButterFree.jpg";
    private ImageIcon resim = new ImageIcon(resimUzantı);
    private int hasarPuani = 10;
    public int kullanma1=0;
    //yapıcılar oluşturulacak
    public ButterFree(int hasarpuani, int pokemonID, String pokemonAdi, String pokemonTip) {
        super(pokemonID, pokemonAdi, pokemonTip);
        this.hasarPuani = hasarpuani;
    }
    public ButterFree() {
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
