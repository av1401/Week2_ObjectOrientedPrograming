//Program to Track inventory of items
import java.util.*;
public class Item{
    //create the three varible title, author and price
    String itemName;
    String itemCode;
    double itemPrice;

    Item(String itemName, String itemCode, double itemPrice){//make default constructor and initialize to this keyword
    
        this.itemName =itemName;
        this.itemCode=itemCode;
        this.itemPrice=itemPrice;
    }
    void bookDetail(){//create method book detail and print the all detail
    
        System.out.println("Item name : "+ itemName);
        System.out.println("Item code is  : "+itemCode);
        System.out.println("item  price is  : "+itemPrice);
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Item no_1=new Item("Pen","Dom-001",25);
        no_1.bookDetail();
    }
}