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
public class insanOyuncu extends Oyuncu {
    
    ArrayList<Pokemon> deste = new ArrayList<>();
    public insanOyuncu(int OyuncuID,String OyuncuAdi,int Skor,ArrayList<Pokemon> deste) {
        super(OyuncuID,OyuncuAdi,Skor);
        this.deste=deste;
    }
    public insanOyuncu() {
        super();
    }
    public ArrayList<Pokemon> getDeste(){
        return deste;
    }
    public void setDeste(ArrayList<Pokemon> deste){
      this.deste=deste;
    }
    
    Random rast = new Random();
    @Override
    public void kartSec() {
        
    }

   
    
}
