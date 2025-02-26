package Array.com;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[]= {3,4,53,61,23,43,532,533,6,7,3};

        for (int p = 0;p<arr.length;p++) {
            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is ");
        for (int i = 0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int flag = 1;
        System.out.println("Duplicate array is ");
        for (int i= 0;i<arr.length-1;i++)
        {
            if (arr[i]==arr[i+1]){ // jaha bhi i+1 aata hai waha array indexout of bound aa jata hai
                 flag= 0;
                System.out.print(arr[i]+ " ");
            }
        }
        if (flag==1){
            System.out.println("Duplicate element not present in the array");
        }
    }
}
