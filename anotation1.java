package Poo;
// We show the intention with the help of annotation

//In framework ,annotation is necessary and very useful

class A{
    public void show(){
        System.out.println("A show");
    }
}

class B extends A{

    @Override
    public void show(){
          System.out.println("B show");
    }
}
public class anotation1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
