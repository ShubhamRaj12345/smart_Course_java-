package Array.com;

public class print_Useing_arr {
    public static void main(String[] args) {
        int a[]= {2,34,56,34,4,7,8,1,3,2,4,4};

        // check no of even and odd
        int evencount=0; int oddcount=0;
        for (int i = 0 ;i<a.length;i++) {

            if (a[i] % 2 == 0) {

                evencount = evencount + 1;

            } else {
                oddcount = oddcount + 1;
            }
        }
        System.out.println("+__________________________________");

        //Create an array for even and odd
        int arr[]= new int[evencount];
        int arr1[] = new int[oddcount];


        // put values in even and odd arrays
        int evenindex_pos= 0; int odd_indx_pos= 0;

        for (int i =0; i<a.length;i++){
           if (a[i]%2==0)
           {
              arr[evenindex_pos]= a[i];
               evenindex_pos = evenindex_pos+1;
           }
           else {
               arr1[odd_indx_pos]= a[i];
                odd_indx_pos = odd_indx_pos+1;
           }

    }
        // print array values
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n+++++++++++++++++++++++++");
        for (int i = 0;i<arr1.length;i++)
        {
            System.out.print (arr1[i]+" ");
        }

    }
}
