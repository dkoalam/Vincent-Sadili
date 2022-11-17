import java.util.Scanner;

public class commission_Switch {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Department Code:");
        System.out.println("[1] - Toy Section");
        System.out.println("[2] - Ladies Wear Section");
        System.out.println("[3] - Mens Wear Section");
        System.out.println("[4] - Kiddie Section");
  
        double price=0,quan=0,com=0;
        System.out.print("Enter Sales Representatives' Name: ");
        String name=s.nextLine();
        System.out.print("Enter ID Number: ");
        int idnum=s.nextInt();
  
        System.out.println("Enter Department Code: ");
       int code=s.nextInt();
        while(code!=1 && code!=2 && code!=3 && code!=4){
        System.out.println("Code is incorrect, Try Again!");
        System.out.print("Enter Department Code: ");
         code=s.nextInt();
       }  

       switch (code) {
        case 1:
        System.out.println("You are in Toy Section");
        System.out.println("Toy Section Available Products and Price");
        System.out.println("[A] - Toy Car    |300.00Php");
        System.out.println("[B] - Stuff Toys |500.00Php");
        System.out.print("Enter product: ");
        String prod=s.next();
        while(!prod.equalsIgnoreCase("A") && !prod.equalsIgnoreCase("B")){
          System.out.println("Code is incorrect, Try Again!");
          System.out.print("Enter product: ");
           prod=s.next();
        }
        switch (prod) {
          case "a":
          case "A":
          price=300.00;
            break;

          case "b":
          case "B":
          price=300.00;
            break;
            
        
          default:

            break;
        }

            
            break;
        case 2:
        System.out.println("You are in Ladies Wear Section");
        System.out.println("Ladies Wear Section Available Products and Price");
        System.out.println("[C] - Pants     |799.00Php");
        System.out.println("[D] - Blouse    |599.00Php");
        System.out.println("[E] - Underwear |499.00Php");
        System.out.print("Enter product: ");
        prod=s.next();
        while(!prod.equalsIgnoreCase("C") && !prod.equalsIgnoreCase("D")&& !prod.equalsIgnoreCase("E") )  {
          System.out.println("Code is incorrect, Try Again!");
          System.out.print("Enter product: ");
           prod=s.next();
        } 
        switch (prod) {
          case "c":
          case "C":
          price=799.00;
            break;

          case "d":
          case "D":
          price=599.00;
            break;
          case "e":
          case "E":
          price=499.00;
            break;  
        
          default:

            break;
        }
            
            break;           
        case 3:
        System.out.println("You are in Men Wear Section");
        System.out.println("Men Wear Section Available Products and Price");
        System.out.println("[F] - Necktie    |249.00Php");
        System.out.println("[G] - T-Shirt    |349.00Php");
        System.out.println("[H] - Belt       |199.00Php");

        System.out.print("Enter product: ");
        prod=s.next();
        while(!prod.equalsIgnoreCase("f") && !prod.equalsIgnoreCase("g")&& !prod.equalsIgnoreCase("h") )  {
          System.out.println("Code is incorrect, Try Again!");
          System.out.print("Enter product: ");
           prod=s.next();
        }   
        switch (prod) {
          case "f":
          case "F":
          price=249.00;
            break;

          case "g":
          case "G":
          price=349.00;
            break;
          case "h":
          case "H":
          price=199.00;
            break;  
        
          default:
       
            break;
 
          
      }       
        break;
        case 4:
        System.out.println("You are in Toy Section");
        System.out.println("Toy Section Available Products and Price");
        System.out.println("[I] - Toy Car    |300.00Php");
        System.out.println("[J] - Stuff Toys |500.00Php");
        System.out.print("Enter product: ");
         prod=s.next();
          while(!prod.equalsIgnoreCase("i") && !prod.equalsIgnoreCase("j")){
            System.out.println("Code is incorrect, Try Again!");
            System.out.print("Enter product: ");
             prod=s.next();
          }
        switch (prod) {
          case "i":
          case "I":
          price=99.00;
            break;

          case "j":
          case "J":
          price=899.00;
            break;
            
        
          default:

            break;
        }
        break;        
        default:

            break;
       }
       System.out.print("Enter Quantity: ");
       quan=s.nextInt();
       while(quan<=0){
        System.out.println("Invalid Quantity: ");
        System.out.print("Enter Quantity: ");
        quan=s.nextInt(); 
       }

       double total=price*quan;
       System.out.println("QUANTITY: "+quan);
       System.out.println("Total Amount: "+total);
       
       
       if (total>5000){
       com=total*0.10;
       }
       else if(total>10000){
        com=total*0.20;
       }
       else if(total>15000){
        com=total*0.30;
       }
       else if(total<5000){
        com=total*0;
       }
       System.out.println("Commission: "+com);

    }

}
