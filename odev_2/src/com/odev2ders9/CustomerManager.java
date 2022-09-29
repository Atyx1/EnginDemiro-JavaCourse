package com.odev2ders9;

public class CustomerManager  {
    private  ICustomerDal customerDal;
   public CustomerManager(ICustomerDal iCustomerDal){

       this.customerDal=iCustomerDal;
   }
    public void add(){

        //iş kodları yazılır veri doğrulama
        customerDal.add();
    }

}
