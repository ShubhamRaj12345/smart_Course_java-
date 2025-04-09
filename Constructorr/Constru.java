package Constructorr;

public class Constru {


    int rollNo;
    String name;

    Constru(int roll, String name1){
        rollNo =  roll;
        name = name1;
    }
    void show()
    {
        System.out.println("Roll Number is"+rollNo+" && Name is "+name);
    }

    public static void main(String[] args) {

        Constru co = new Constru(1,"shubham");

        co.show();
        Constru co1 = new Constru(2,"khilesh");
          co1.show();

    }
}
