//Program to handle mobile details
import java.util.*;
class MobilePhone{
    //create the three varible title, author and price
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price){//make default constructor and initialize to this keyword
    
        this.brand =brand;
        this.model=model;
        this.price=price;
    }
    void mobileDetail() { //create method book detail and print the all detail
    
        System.out.println("Mobile phone brand is  : "+ brand);
        System.out.println("Mobile model is  : "+model);
        System.out.println("Mobile  price  is : "+price);
    }
    public static void main(String[]args){
    
        Scanner sc =new Scanner(System.in);
        MobilePhone mobile1=new MobilePhone("Apple", "IPhone-16ProMax", 1,34,000);
        mobile1.mobileDetail();
    }
}