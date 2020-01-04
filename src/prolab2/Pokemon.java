package prolab2;

import javax.swing.*;

public class Pokemon {

    private  int pokemonID;
    private  String pokemonAdi;
    private  String pokemonTip;
    private  int hasarPuani;
    
    public Pokemon(int pokemonID, String pokemonAdi, String pokemonTip) {
        this.pokemonID = pokemonID;
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
    }
    Pokemon() {
    }

    public int hasarPuaniGoster() {
        return this.hasarPuani;
    }
    public ImageIcon resimUzantı() {
        return null;
    }
    
    //özellik set 
    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

            
    // özellik get         
    public int getPokemonID() {
        return this.pokemonID;
    }

    public String getPokemonAdi() {
        return this.pokemonAdi;
    }

    public String getPokemonTip() {
        return this.pokemonTip;
    }

    public int getHasarPuani() {
        return this.hasarPuani;
    }    
    //kart kullanım sorgulama
    public boolean kartKullanildiMi(int a){
          if(a==1)
              return true;
          else
              return false;
    }
    
    
    
    
}
