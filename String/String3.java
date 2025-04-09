package String;

public class String3 {
    public static void main(String[] args) {

        String str = "Shubham";
        String str2= "Shubham";

        System.out.println(str== str2);
        System.out.println(str.equals(str2));

        if(str.equals("shubham") && str2.equals("shubham"))
        {
            System.out.println("login sucess ");
        }else
        {
            System.out.println("false");
        }

        if(str.equalsIgnoreCase("shubham") && str2.equalsIgnoreCase("shubham"))// ye uper and lower ko ignore karaga
        {
            System.out.println("login sucess ");
        }else
        {
            System.out.println("failsa");
        }
    }
}
