package Array.com;

public class FirstDuplicate {
    public static void main(String[] args) {
        System.out.println("first duplicate array is  ");

        int a[]= {2,34,56,34,4,7,8,1,3,2,4,4};
        boolean b= false;
        for (int i = 0 ;i<a.length-1;i++){
            for (int j =i+1;j<a.length;j++) {
                if (a[i] == a[j]) {
                    System.out.println("First duplicate is "+a[i]);
                    b = true;
                }
            }
                if (b==true)
                {
                    break;
                }
            }

        }
    }

