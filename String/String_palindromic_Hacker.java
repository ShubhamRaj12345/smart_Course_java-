package String;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// this is a palindromic number
public class String_palindromic_Hacker {



        public static void main(String args[] ) throws Exception {
            //BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();                // Reading input from STDIN
          //  System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


             int n =  name.length();

             boolean isPalindrone= true;
            for(int i = 0; i<=n/2;i++)
            {

                if(name.charAt(i)!= name.charAt(n-i-1))
                {
                    isPalindrone = false;
                      break;
                }

            }

            if (isPalindrone)
            {
                System.out.println("Yes");
            }else {
                System.out.println("no");
            }
        }
    }


