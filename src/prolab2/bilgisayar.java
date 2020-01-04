/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author x
 */
public class bilgisayar extends Oyuncu {
    
    public bilgisayar() {
        super();
    }
    ArrayList<Pokemon> deste = new ArrayList<>();
    public bilgisayar(int OyuncuID,String OyuncuAdi,int Skor,ArrayList<Pokemon> deste) {
        super(OyuncuID,OyuncuAdi,Skor);
        this.deste=deste;
    }
    public ArrayList<Pokemon> getDeste(){
         return deste;
    }
    public void setDeste(ArrayList<Pokemon> deste)
    {
      this.deste=deste;
    }
    Random rast = new Random();
    @Override
    public void kartSec() {
       
    }

}
