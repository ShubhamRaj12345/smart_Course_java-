package ControlStatement;

public class LabelledData {
    public static void main(String[] args) {
         outer: // labelled break statement
        for (int i = 0; i< 10;i++)
        {
            System.out.println("i= "+i);
            for (int j = 0 ;j<10;j++)
            {

                System.out.println("j = "+j);
                if (j == 3)
                {

                    break outer;

                }
            }
        }

    }
}
