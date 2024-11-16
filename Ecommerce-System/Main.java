/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author mar3y
 */
import java.util.*;

public class EcommerceSystem {
 public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
 
ElectronicProduct smartphone = new ElectronicProduct( 1,"smartphone", 599.9,"samsung",1);
ClothingProduct tshirt = new ClothingProduct(2, "T-shirt", 19.99, "medium","cotton");
BookProduct OOP = new BookProduct(3, "OPP", 39.99,"O'Reilly","X Publications");
boolean flag;
    System.out.println("please enter your id:");
        int id= Math.abs(input.nextInt());
    System.out.println("please enter your name:");
        String name= input.next();
    System.out.println("please enter your address:");
        String address= input.next();
  Customer cust = new Customer(id, name, address);
    System.out.print("how many products you want to add to your cart?:");
       int Nproducts =Math.abs(input.nextInt());
  cart cart = new cart(cust.getCustomerid(), Nproducts);
  for(int i=0;i<Nproducts;i++){
    
      do{ flag=true;
         System.out.println("which product would you like to add? 1)"+smartphone.getName()+" 2)"+tshirt.getName()+" 3)"+OOP.getName());
       int choice = Math.abs(input.nextInt());
        switch (choice) {
            case 1: cart.addproduct(smartphone, i);
                break;
            case 2: cart.addproduct(tshirt, i);
                break;
            case 3: cart.addproduct(OOP, i);
                break;
            default:System.out.println("wrong choice please choose again");
            flag=false;
                break; }
       }while(flag==false);
  }
   do{flag=true;
    System.out.println("your total is "+cart.calculatePrice()+". would you like to place order? 1)yes 2)no");
        int choice = Math.abs(input.nextInt());
        switch (choice) {
            case 1: cart.placeorder();
                break;
            case 2: System.out.println("order cancelled");
                break;
            default:System.out.println("wrong choice please choose again");
            flag=false;
                break; }
       }while(flag==false);
    }
  
}
    

