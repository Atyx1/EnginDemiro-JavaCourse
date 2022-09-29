package com.odev2ders9;

public class MySqlCustomerDal  implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("mysql eklendi");
    }
    //data acces layer -- > dal



}
