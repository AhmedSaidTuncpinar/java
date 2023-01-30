package day21accessmodifiersinheritance;

public class Runner {

    public static void main(String[] args) {

        Student std1= new Student();

        System.out.println(std1.stdName);

        Student std2 = new Student();
        System.out.println(std2.stdGpa);
        //if you want to access data inside the class without using any object, the data must be static.
        System.out.println(Student.address);
    }
}
