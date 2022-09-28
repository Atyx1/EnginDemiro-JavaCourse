package com.odev2ders2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

      DortIslem islem=new DortIslem();
        Random rastgele=new Random();
        int sayi1=rastgele.nextInt(100);
        int sayi2=rastgele.nextInt(100);
        System.out.println("sayi_1:"+sayi1+" sayi_2:"+sayi2);
        int rastgeleSecim=rastgele.nextInt(4);
        switch (rastgeleSecim){
            case 1:
                System.out.println(islem.Bol(sayi1,sayi2));
            break;
            case 2:
                System.out.println(islem.Carp(sayi1,sayi2));
            break;
            case 3:
                System.out.println(islem.Cıkar(sayi1,sayi2));
            break;
            case 4:
                System.out.println(islem.Topla(sayi1,sayi2));

        }

    }
}
