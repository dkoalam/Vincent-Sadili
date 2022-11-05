import java.util.Scanner;

public class SetA{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter how many student grades you want to input: ");
        int input=s.nextInt();
        int grade=0,sum=0,ave=0,pg=0,fg=0;
        String aveS="";

        for(int i=1;i<=input;i++){
            System.out.print("Enter your grades: ");
            grade=s.nextInt();
            if(i==input){
                aveS=aveS+grade;
            }
            else{
                aveS=aveS+grade+"+";
            }
        if(grade>=75 && grade<=100){
            System.out.println("GRADE PASSED!");
            pg++;
        }
        else if (grade<=74 && grade>=0){
            System.out.println("GRADE FAILED!");
            fg++;
        }
        else{
            System.exit(0);
        }
        

        sum+=grade;

        ave=sum/input;
        
       

}
System.out.println("("+aveS+")"+"/ "+input+"= "+ave);
System.out.println("Hi Prof! "+name);
System.out.println("There are "+pg+" passed and "+fg+" failed among the "+input+" student grades");

if(pg>fg){
    System.out.println("CONGRATULATIONS MAJORITY OF THE STUDENTS PASSED!");
}
else{
    System.out.println("SADLY MAJORITY OF THE STUDENTS FAILED!");

}           


        
        
    }





}