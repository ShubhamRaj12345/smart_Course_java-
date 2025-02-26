package Array.com;
// yaha 3 position par 60 insert karna hai but pahla program me replace ho raha tha isme copy kar rahe hai
public class CopyarrayEle {

        public static void main(String[] args) {
            int arr[]= {23,4,5,67,8,989,9};

            int pos= 3;
            int neWElement= 60;
            int newarray[]= new int[arr.length+1];

            for (int i = 0;i<arr.length;i++)
            {
                newarray[i]= arr[i];
            }

            for (int i = newarray.length-1;i>pos;i--)  // travels from left
            {
                newarray[i]= newarray [i-1];
            }
            newarray[pos-1]= neWElement;
            for (int i = 0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            for (int i = 0 ;i<newarray.length;i++)
            {
                System.out.print(newarray[i]+"  ");
            }
        }
}
