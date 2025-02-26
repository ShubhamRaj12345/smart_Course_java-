package Array.com;

public class Dupliaccatearra2 {
    public static void main(String[] args) {
        int arar[]= {2,4,65,67,8,9,6,8,9,9,};
      int count= 0;
        System.out.println("Duplicate array is ");
        int flag= 0;
        for (int i = 0 ;i <arar.length-1;i++) {
            for (int j = i + 1; j < arar.length; j++) {
                if (arar[i] == arar[j]) {
                    flag = 1;
                    count= count+1;
                    System.out.println(count+"."+ arar[i]+ " ");
                }

            }
        }
            if (flag==0)
            {
                System.out.println("duplicate array is not present in the array ");
            }
        }
    }

