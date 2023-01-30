package day21accessmodifiersinheritance;

public class Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }
}
/*
    1)We use "inheritance";
        i)to prevent "repetition"
        ii)to make "maintenance" easy
        iii)to make our classes "atomic"

    2)To make a class child of another class we use "extends" keyword

    3)Child classes can use class members from the parent classes.
      However, parent classes cannot use anything from the child classes.

    4)Every class except "Object Class" in Java has at least one parent class which is "Object Class".

    5)Inheritance Types in Java
        1)Multilevel Inheritance
        2)Hierarchical Inheritance
        3)Multiple Inheritance (Java does not support it)
        4)Opposite of "Multiple Inheritance" is "Single Inheritance"
          Java supports "Single Inheritance"
 */