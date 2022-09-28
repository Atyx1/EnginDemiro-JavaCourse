package com.odev2ders1;

public class Main {
    public static void main(String[] args) {
    CustomerManager customermanager1=new CustomerManager();
    CustomerManager customermanager2=new CustomerManager();
    customermanager1=customermanager2;//GC customermanager1 bellekten silinir
    customermanager1.Add("ahmet");
    customermanager1.Remove();
    customermanager1.Update();

//value tipler sadece stack de oluşur o yüzden değişim sadece ilk baştaki değere eşitlenir
//referans tipler direk heap de ki yeri gösterdiği için uygulanan bütün değişikler önce veya sonra olsun değişir  (diziler referans tiptir)



    }
}

