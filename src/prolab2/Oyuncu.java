
package prolab2;

import java.util.ArrayList;

public abstract class Oyuncu {
    private   int oyuncuID;
    private   String oyuncuAdi;
    private   int skor;
    
    //yapıcllar olusturulacak
    public Oyuncu(int OyuncuID,String OyuncuAdi,int Skor)
    {
        this.oyuncuAdi=OyuncuAdi;
        this.oyuncuID=OyuncuID;
        this.skor=Skor;
    }
    Oyuncu(){}
    
    //get yazılacak
    public void SkorGoster(int Skor){
         System.out.println(Skor);
    }
    public int getOyuncuID(){
        return oyuncuID;
    }
    public String getOyuncuAdi(){
        return oyuncuAdi;
    }
    public int getSkor(){
        return skor;
    }
    // set yazılacak
    public void setOyuncuID(int OyuncuID){
        this.oyuncuID=OyuncuID;
    }
    public void setOyuncuAdi(String OyuncuAdi){
        this.oyuncuAdi=OyuncuAdi;
    }
    public void setSkor(int Skor){
        this.skor=Skor;
    }
    //kart listesi olusturma metodu
    public void kartList(ArrayList deste){
       
    }
    
    //kart secme metodu yazılacak
    public abstract void kartSec();
    
}