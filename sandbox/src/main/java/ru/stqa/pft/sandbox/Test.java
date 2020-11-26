package ru.stqa.pft.sandbox;

public class Test {

  public static void main(String[] args) {
    hello("World");
    hello("All");
    hello("Maks");

    Square s = new Square(7);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(7,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
