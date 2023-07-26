package Poo;
//creating interface computer
interface Computer{
    void code();
}

//creating class who implements our interface computer
class Laptop implements Computer{

    
    public void code() {
          System.out.println("code, run, compile");
    }
       
}

//Class Developper who need computer to code
class Developper{

    public void devApp(Computer cmp){
        cmp.code();
    }
}


public class interf {
       public static void main(String[] args) {
                Computer lap = new Laptop();

                Developper navix = new Developper();

                navix.devApp(lap);
       }
}
