package com.odev2ders11;

public class ProductValidator {
static {
    System.out.println("yapici blok calisti");
}   //çalışır
public ProductValidator(){
// çalışmaz
    System.out.println("yapici blok calisti ");
}
public static boolean isValid(Product product){
    if(product.price>0 && !product.name.isEmpty()){
        return true;
    }
    return false;
}


}
