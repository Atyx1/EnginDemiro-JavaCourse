package com.odev2ders6;

public class CustomerManager {
  private BaseLogger baselogger;

public CustomerManager(BaseLogger baselogger){
    this.baselogger=baselogger;

}
public void add(){

    System.out.println("Müsteri eklendi");
    this.baselogger.log("log mesaji:");
}


}
