//Declare a class name ‘A’ with some methods and one parameterised constructor.
// Derive another class ‘B’ from ‘class A’. In class B have some methods and parameterized constructor.
// Derive Class C from class B Demonstrate how base class parameterised constructor gets
// call from child class constructor in multilevel inheritance

import java.util.Scanner;
class A{
    public A(int x)
    {
        System.out.println("We are creating a number " + x);
    }
}
class B extends A{
    public B(int x){
        super(x);
        System.out.println("Your number " + x);
    }
}
class C extends B{
    public C(int x){
        super(x);
        System.out.println("done " + x);
    }
}

class Q38_Multilevel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        new C(x);
    }
}