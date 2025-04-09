package Java8_Features2;

import java.util.function.Consumer;
// this is  a Consumer ye kuch bhi return karega
public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<String > c =str-> System.out.println("hii"+str);

        c.accept("shubham ");
    }
}
