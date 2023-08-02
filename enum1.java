package Poo;

// an enum is a class ! with object within it
enum Status{
     Running, Failed,Pending,Success;
}

public class enum1 {
    
    public static void main(String[] args) {
        // Create a status with the object Running.
        Status s= Status.Running;
        System.out.println(s);

        //Create a status with all the values
        Status[] vv = Status.values();

        for (Status v : vv){
             System.out.println(v +" : "+v.ordinal());
        }
    }

}
