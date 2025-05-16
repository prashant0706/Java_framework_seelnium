package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


interface Shape
{
    int Lenght = 10;
    int widht = 20;

    void circle(); // abstract method

    default void square(){
        System.out.println("this is square - default method");
    }

    static void rectange(){
        System.out.println("this is rectangel -  static method");
    }

}
public class Test implements Shape {

    WebDriver driver = new ChromeDriver();
    public void circle(){
        System.out.println("this is abstract method.....");
    }

    public static void main(String[] args) {
        Test iobj = new Test();
        iobj.circle();
        iobj.square();
        Shape.rectange();
    }
}
