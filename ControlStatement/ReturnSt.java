package ControlStatement;

public class ReturnSt {


    public static void main(String[] args) {
        ReturnSt st = new ReturnSt();
      int s=   st.m2();
        System.out.println(s);

       int u =   st.m4();
        System.out.println(u);

     //   System.out.println(st.m3()); // return type void rahta hai to sout me nahi pass kar sakte hai

    }


    int  m2()
    {
        System.out.println("hii");
        return 10;
    }

    int m4 ()
    {
        int no1=20,  no2=30;
        return no1 + no2;
    }

    void  m3()
    {
        System.out.println("Hello");
    }
}
