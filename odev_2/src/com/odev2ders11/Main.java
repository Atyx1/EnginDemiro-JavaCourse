package com.odev2ders11;

public class Main {
    public static void main(String[] args) {

        Product product_1 = new Product();
        product_1.price=123;
        product_1.id=2;
        product_1.model="düz";
        product_1.name="laptop";


        ProductManager productManager = new ProductManager();
        productManager.add(product_1);

        DataBaseHelper.connection.deleteConnection(); //İNNER CLASS
        DataBaseHelper.crud.create();

    }

}
