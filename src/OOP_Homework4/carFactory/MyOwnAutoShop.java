package OOP_Homework4.carFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOwnAutoShop {

  public static void main(String[] args) {
    Car sedan = new Sedan();
    sedan.setRegularPrice(56111);
    sedan.setSpeed(200);
    sedan.setColor("red");

    Sedan sedan1=(Sedan)sedan;
    sedan1.setLength(4.074);
    System.out.println(sedan.getSalePrice());

    System.out.println();

    Ford ford1 = new Ford(300, 30000,
        "white", 2021, 0.05);

    Ford ford2 = new Ford(200, 38000,
        "black", 2018, 0.07);
    Car truck = new Truck(160, 69500,"grey", 2);
    Car sedan2 = new Sedan(230, 28900,"blue", 4);
    List<Car> mycars=new ArrayList<>(Arrays.asList(sedan1, ford1, ford2, truck, sedan2));
    for (Car car:mycars) {

      System.out.println(car.getClass().getSimpleName() +"- " + car.getSalePrice());
    }

  }
}
/*
double speed, double regularPrice, String color, int year, double manufacturerDiscount
Създайте програма MyOwnAutoShop когато изпълнява следните стъпки в main() метода си.
Създава инстанция на класа Sedan speed, regularPrice, color
getSalePrice( )инициализирайки всичките атрибути с подходящи стойности.
Ползвайте ключовата дума super за да инициализирате атрибутите на супер класа.
Създава две инстанции на Ford и инциализира техните атрибути, задавайки им подходящи стойности.
Отново ползвайте ключовата дума super.
Създава инстанция от класа Car инициализирайки всичките атрибути с подходящи стойности.
Създава инстанции и от класовете Truck, Sedan
Извежда в конзолата цените на всички инстанции.*/