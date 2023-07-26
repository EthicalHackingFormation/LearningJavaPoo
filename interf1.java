package Poo;

interface A{
    //all variable in interface is final (constant) and static (no need to instanciate)
    //final because the class dont have access to variable, only methods
    int age= 44 ;
    String area= "Mumbai";

    void show(); //all methods in interface are by default Public and Abstract
}

//if you dont want to override the method show() of A, you can change B to Abstract, else you need to implements show() in B
 class B implements A {
    
    public void show() {
        System.out.println("Showing....");
    }

}

public class interf1 {
     public static void main(String[] args) {
            A obj;
            obj = new B();
            obj.show();

            //you can call static variable
            System.out.println(A.area);
            System.out.println(A.age);
     }
}
