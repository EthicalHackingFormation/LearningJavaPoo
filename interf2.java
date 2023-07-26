package Poo;

//class - class == extends
//class - interface == implements
//interface - interface == extends
interface A{
   
    void show(); //all methods in interface are by default Public and Abstract
}

interface X{
    void run();
}

interface Y extends X{

}
//if you dont want to override the method show() of A, you can change B to Abstract, else you need to implements show() in B
//a class can implements many interface
 class B implements A,Y {

    public void show() {
        System.out.println("Showing....");
    }

    @Override
    public void run() {
        System.out.println("ruuunnn..");
    }

}

public class interf2 {
     public static void main(String[] args) {
            A obj;
            obj = new B();
            obj.show();

            X obj1= new B();
            obj1.run();
     }
}
