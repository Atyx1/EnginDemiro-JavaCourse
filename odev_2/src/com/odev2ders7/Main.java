package com.odev2ders7;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager kredi: baseKrediManagers){
            System.out.println(kredi.hesapla(20000));
        }
    }

}
