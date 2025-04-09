package Java8_Features2;

import java.util.function.Supplier;

public class Suppier_Random_No {
    public static void main(String[] args) {

        // ye koi 1 to 100 tak koi bhi random no oprint kara raha hu
       // System.out.println(Math.random()*100);
     //   System.out.println((int)(Math.random()* 100));


             // yaha mujhe integer me value cahahiye tha is liye interger likha aur () me kuch bhi isme pass nahi hoga
        Supplier<Integer> s = () ->(int )( Math.random()* 100);

        System.out.println(s.get());

        // yaha mai lottery wala no banaya hai
        Supplier<String> s2 = ()->
                        {
                                     String[] name = {"khilesh","shubham","sonu","ujwal"};
                                     int i = (int) (Math.random()*4);
                                     return name[i];

                           };
        System.out.println(s2.get());
    }
}
