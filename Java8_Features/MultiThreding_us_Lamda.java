package Java8_Features;

// ye maine multithreding me  lamda expression use kiya hai

public class MultiThreding_us_Lamda {

    public static void main(String[] args) {

       Runnable ml =()->{
           for (int i = 0; i <= 5; i++) {
               System.out.println("Hi ia am  a  child  thread ");
           }
        };
        Thread th = new Thread(ml);
        th.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("hi i am main thread ");
        }

    }
}




/*
public class MultiThreding_us_Lamda implements  Runnable{

    public  void  run(){
        for (int i = 0 ; i<=5 ;i++)
        {
            System.out.println("Hi ia am  a  child  thread ");
        }
    }

    public static void main(String[] args) {

        MultiThreding_us_Lamda  ml = new MultiThreding_us_Lamda();
        Thread th =  new Thread(ml);
        th.start();

        for (int i = 0 ;i<=5;i++)
        {
            System.out.println("hi i am main thread ");
        }

    }*/
//}
