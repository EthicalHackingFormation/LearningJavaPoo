package Poo;

// an enum is a class ! with object within it
enum Status{
     Running, Failed,Pending,Success;
}

public class enum2 {
     public static void main(String[] args) {
        

        // Create a status with the object Running.
        Status s= Status.Running;
        
        //Create a switch case who return sentence compared with the Status s
        switch(s){
             case Running:
              System.out.println("All Good");
              break;
             
             case Failed:
              System.out.println("Try Again");
              break;

             case Pending:
               System.out.println("Please wait");
               break;
             default:
               System.out.println("Done");
               break;
        }

     }
}
