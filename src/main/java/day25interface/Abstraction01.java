package day25interface;

public abstract class Abstraction01 {

    /*
    interview question
    "final" keyword is very important in java.
   1) final keyword can be used for variables.
    public final int age =12;
    if you make a variable final you can not change it value.
     final variables must be initialized.

    2) final keyword can be used for methods
    final method body can not be updated.

    3) final keyword can be used for classes
    final classes can not have child classes.

   Note: "abstract classes" have something to do for child classes, if there is no child class, having "to do list" is not sensible.
      "final classes" cannot have child classes, therefore Java does not allow to make an abstract class final.

     Note:  "final method" body will be under protection by Java, because it should not be updated.
       But abstract methods don't have body, Java will look for the body to protect when it could not find it will complain
     */

    public int age;
    public static final double pi = 3.14;

    public abstract int add();

}
