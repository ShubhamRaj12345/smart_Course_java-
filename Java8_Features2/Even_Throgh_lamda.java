package Java8_Features2;
// ye maine even no ko nikalne ke liye Lamda function ka use kiya hai
interface  t1
{
    public boolean test(int no);
}
public class Even_Throgh_lamda {
    public static void main(String[] args) {

         t1 ob = no -> no % 2==0;
        System.out.println(ob.test(10));

    }
}
