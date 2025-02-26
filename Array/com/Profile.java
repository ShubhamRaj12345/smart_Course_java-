package Array.com;

import java.lang.reflect.Array;

public class Profile {

    // name ko yaha  print karana hai
     String name ;
     int age;
     String address;
     String dob;

     Profile(String name ,int age , String address,String dob){
          this.name= name;
          this.age= age;
          this.address= address;
          this.dob= dob;
     }
      void display( )
    {
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
        System.out.println("address is "+address);
        System.out.println("dob is "+dob);
    }

}
