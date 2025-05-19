package Revision12;

public class MaxNuInArr {
    public static void main(String[] args) {
        int arr[]= {12,3,134,444,89};
        int max =arr[0];
        for (int i = 0 ; i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max= arr[i];

            }

        }
        System.out.println("maximum number is "+max);
    }
}
