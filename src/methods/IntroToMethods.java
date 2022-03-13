package methods;

public class IntroToMethods {


    /*
    Methods
    - there are two type of Methods:
        1. Method that perform an action and don't return anything
     */
    public static void main (Strig [] args){
        doSomething();
         System.out.println(doSomethingElse());
    }



    void doSomething() {
        System.out.println("this method is doing something")
    }
    int doSomethingElse(){
        int x = 5;
        int y = 10;

        return x + y;

    }
}
