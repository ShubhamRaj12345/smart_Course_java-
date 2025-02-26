package Array.com;

public class PrintUs_While {
    public static void main(String[] args) {


        int arr[] = {2, 2, 34, 4};
        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j] + " ");
            j++;
        }
        System.out.println();


    //way 2
    for(int a :arr)

    {   // print using for loop
        System.out.print(a+" ");
    }



}
}
