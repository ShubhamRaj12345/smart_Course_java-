package Array.com;
//WAP TO FIND COMMON ELEMENT IN TWO ARRAYS
public class FindEle {
    public static void main(String[] args) {

        int arra1[]= {10,30,40,5,6};
        int arra2[]= {508,50,56,5,7,10,};
        for (int i= 0 ;i<arra1.length;i++)
        {
            for (int j = 0 ;j<arra2.length;j++)
            {
                if(arra1[i]==arra2[j])
                {
                    System.out.println(arra1[i]);
                }
            }
        }
    }
}
