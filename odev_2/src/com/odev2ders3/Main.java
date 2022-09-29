package com.odev2ders3;

public  class Main {
    public static void main(String[] args) {

        Product product = new Product("laptop","güçlü",1333,200,"uv400");
        Product product1 = new Product();//hata vermiyor çünkü override ettiğimiz construct parametresiz




        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        // for(String s: Product){
        //   System.out.println(s);


    }

}