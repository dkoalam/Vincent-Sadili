import java.util.Scanner;


public class loopSetB {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Scanner i = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name=s.nextLine();
      String respo="y",choice="";
      int price=0,hmany=0,total=0,ntotal=0;



     
System.out.println("Press [A] for Apple - 50");
System.out.println("Press [B] for Banana - 15");
System.out.println("Press [C] for Coco - 10");




while(respo.equalsIgnoreCase("y")){
  System.out.print("Enter your choice:");
  choice=s.next();



  if(choice.equalsIgnoreCase("a")){
    price=50;
}
else if(choice.equalsIgnoreCase("b")){
price=15;

}
else if(choice.equalsIgnoreCase("c")){
  price=10;

  }
  System.out.println("How many:? ");
  hmany=s.nextInt();
  total=price*hmany;

System.out.println("Total: "+total);
ntotal=total+ntotal;
System.out.println("New Total: "+ntotal);

 
  System.out.print("Would you like to add more items to the cart? [y/n]: ");
respo=s.next();


  
};

System.out.println("Thank you "+name+", your total to pay is "+ntotal);
   




/*
Enter customer name: Karlo Emil Flores (input)

Press [A] for Apple - 50
Press [B] for Banana - 15
Press [C] for Coco - 10

Enter your choice: A (input)
How many:? 2 (input)
Total: 100 
New Total is: 100
Would you like to add more items to the cart? [y/n]: y (input)
Enter your choice: B (input)
How many:? 1
Total:15
New Total:115
Would you like to add more items to the cart? [y/n]: n (input)
*/

      }




      
      





      



     








      



      }


 

    

