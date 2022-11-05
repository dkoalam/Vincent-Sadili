import java.util.Scanner;




public class askPattern {
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
/*what shape you like to print

 S-Square
 T-Triangle
 D-diamond

 how many (shape) you like to print:
how many rows ang column
 Would you like to print again:
 */
System.out.println("S-Square");
System.out.println("T-Triangle");
System.out.println("D-diamond");
int hshape=0,r=0;
String ask="y",shape="";
while(ask.equalsIgnoreCase("y")){
   System.out.print("What shape Do you like to print: ");
   shape=s.next();

   System.out.println("how many (shape) you like to print:");
   hshape=s.nextInt();
      System.out.print("how many rows and column: ");
      r=s.nextInt();
   //PRINT SQUARE
   if(shape.equalsIgnoreCase("s")){



      for(int hs=1;hs<=hshape;hs++){
//shape
         for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
               System.out.print("* ");
            }
            System.out.println();

         }
System.out.println();
      }

   }
   //TRIANGLE
   else if(shape.equalsIgnoreCase("t")){
      for(int hs=1;hs<=hshape;hs++){

         //shape
         for(int i=1;i<=r;i++){
            //space
            for(int j=i;j<=r;j++){
               System.out.print("  ");

            }
            for(int k=1;k<=i;k++){
               System.out.print("* ");
            }
            for(int k=1;k<i;k++){
               System.out.print("* ");
            }
            System.out.println();
         }

         System.out.println();
      }

   }
   //DIAMOND
   else if(shape.equalsIgnoreCase("d")){
      for(int hs=1;hs<=hshape;hs++){

         //shape
         for(int i=1;i<=r;i++){
            //space
            for(int j=i;j<=r;j++){
               System.out.print("  ");

            }
            for(int k=1;k<=i;k++){
               System.out.print("* ");
            }
            for(int k=1;k<i;k++){
               System.out.print("* ");
            }
            System.out.println();
         }
         for(int i=2;i<=r;i++){
            //space
            for(int j=1;j<=i;j++){
               System.out.print("  ");

            }
            for(int k=i;k<=r;k++){
               System.out.print("* ");
            }
            for(int k=i;k<r;k++){
               System.out.print("* ");
            }
            System.out.println();
         }        

         System.out.println();
      }

   }
   else{
      System.exit(0);
   }
System.out.print("Would you like to print again?(y/n): ");
ask=s.next();
}
}
    
}
