package WhileLoopp;
 // calculate the length of integer
public class Question1 {
    public static void main(String[] args) {
        int no = 12344;
        int length=0;
   int temp = no;
    //    while (no != 0)
        while (temp !=0)
        {
            length = length+1;
          //  no = no/10;
            temp = temp/10;
        }
      //  System.out.println("Length of integer "+no+" is "+length);
        System.out.println("Length if integer "+no+ " is "+length);
    }
}
