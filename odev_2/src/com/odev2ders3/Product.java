package com.odev2ders3;

public class Product {
    //attribute || field
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private  int id;
    private String  kod;
public Product(String name,String description,double price,int stockAmount,String kod){
    this.name=name;
    this.description=description;
    this.price=price;
    this.stockAmount=stockAmount;
    this.kod=kod;



}
public Product(){

    System.out.println("Override");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
    public String toString(){

       return "name:"+name
               +"/description:" +description
               +"/price" +price
               +"/stockAmoun:"+stockAmount
               +"/id:"+id
               +"code"+kod;
    }
}
