package com.odev2ders11;

public class ProductManager {
public void add(Product product){

  if(ProductValidator.isValid(product)){
        System.out.println("eklendi");
    }else
      System.out.println("eklenmedi (şartlar saglanmadi)");



}

}
