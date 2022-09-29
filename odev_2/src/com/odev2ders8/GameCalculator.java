package com.odev2ders8;

public abstract class GameCalculator {

    public abstract void hesapla();//extends edenler override etmeli

        public final void oyunBitti(){
    System.out.println("Oyun bitti"); //final  anahtar kelimesi  override edilmez
}

}
