package Array.com;
// this is a bubble sort
public class BubbleSort {

    public  static void BubbleSort(int arrr[])
    {
        for (int pass = 0;pass<arrr.length;pass++) {
            int temp;
            int flag= 0;
            for (int i = 0; i < arrr.length - 1; i++) {
                if (arrr[i] > arrr[i + 1]) {
                    // swappiing these element
                    temp = arrr[i];
                    arrr[i] = arrr[i + 1];
                    arrr[i + 1] = temp;

                     flag = 1;
                }

                }
              if (flag==0){
                break;
            }
        }
        System.out.println("final list is ");

        for (int i = 0;i<arrr.length;i++)
        {

            System.out.print(arrr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arrr[]= {23,45,56,78,9,41,3,5,7};

        BubbleSort(arrr);
    }
}
