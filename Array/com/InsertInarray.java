package Array.com;
// yaha 3 position par 60 insert karna hai
public class InsertInarray {
    public static void main(String[] args) {
        int arr[]= {23,4,5,67,8,989,9};

        int pos= 3;
        int neWElement= 60;
        for (int i = arr.length-1;i>pos;i--)  // travels from left
        {
            arr[i]= arr[i-1];
        }
        arr[pos-1]= neWElement;
        for (int i = 0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
