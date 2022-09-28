package com.odev2ders2;

public class DortIslem {
  public int Topla(int sayi1,int sayi2){
      return sayi1+sayi2;
  }
  public int Cıkar(int sayi1,int sayi2){
      if(sayi1<sayi2){
          return sayi2-sayi1;
      }
      return sayi1-sayi2;
    }
    public int Carp(int sayi1,int sayi2){

      return sayi1*sayi2;

    }
    public float Bol(int sayi1,int sayi2){

      return  (float)sayi1/sayi2;
    }

}
