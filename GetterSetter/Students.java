package GetterSetter;

import java.awt.*;

public class Students {

    private String name;
    private String email;
    private String address;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public  String getName(){
        return name;
    }
    public  void setName(String name)
    {
        this.name= name;
    }
    public String getEmail(){
        return  email;
    }
    public void setEmail(String email)
    {
        this.email= email;
    }
    public String getAddress(){
        return  address;
    }

    public  void setAddress(String address){
        this.address = address;
    }

    public void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Email is "+email);
        System.out.println("address is "+address);
    }
}
