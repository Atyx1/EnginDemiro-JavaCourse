package com.odev2ders9;

public class Main {
    public static void main(String[] args) {
        //interface ve abstract classlar newlnemez

        //interface operasyonu  ayrı ayrı yazılsın istiyorsak interface kullanılır



        ICustomerDal iCustomerDal = new MySqlCustomerDal();
        iCustomerDal.add();

       CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

       customerManager.add();

    }
}
