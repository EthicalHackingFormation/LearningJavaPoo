package Poo;

// enum Laptop is a class and all value is object 
enum Laptop{
    //so if this is a class it can have constructor,variable, getters and setters
    Macbook(5000),XPS(2000),Surface,ThinkPad;

    private int price;

    private Laptop(int price) {
        this.price = price;
    }
     //we can create constructors without price
    private Laptop() {
        price =100;
    }

     //Getters and setters
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class enum3 {
    public static void main(String[] args) {
        
       //Laptop s = Laptop.Macbook;
     //System.out.println(s.getClass().getSuperclass()); // enum class extend "java.lang.Enum" class

      for (Laptop lap : Laptop.values()){

            System.out.println(lap +" : " + lap.getPrice());
         }
        

    }
}
