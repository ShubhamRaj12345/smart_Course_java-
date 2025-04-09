package Java8_Features;
// LamdaExpression

interface  Demo{
    void fn();
}
public class LamdaEx {


    public static void main(String[] args) {
       Demo b = new Demo() { // interface ka object nahi bna sakte hai
           @Override          // agr mai bina implements kiye print karna chahta hu tab ye karenge
           public void fn() {
               System.out.println("This is a interface instance ");
           }
       };

       b.fn();

    }
}
