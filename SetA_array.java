import java.util.Scanner;

public class SetA_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String yName=s.nextLine();


        System.out.print("Enter number of Student you want to input: ");
        int numStudent=n.nextInt();
       //var name Array = new var[length/input]
        int grades[]=new int[numStudent];
        String name[]=new String [numStudent];

        int pg=0,fg=0,sum=0,ave=0;
        String aveS="";
      //     start in 0;end i<input 
        for (int i=0;i<numStudent;i++){

            System.out.print("Enter Student name:");
            name[i]=s.nextLine();

            System.out.print("Enter Grades: ");
            grades[i]=n.nextInt();

            if(grades[i]<75 && grades[i]>0){
                System.out.println("GRADE FAILED!");
                fg++;

            }
            else if(grades[i]>=75 && grades[i]<100){
                System.out.println("GRADE PASSED!");
                pg++;
            }
            else{
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            //adding String and int
            if(i==numStudent){
                aveS=aveS+grades[i];

            }
            else{
                aveS=aveS+grades[i]+"+";
            }

            //computation
            sum+=grades[i];
            ave=sum/numStudent;

}


        //stores the array inputs
        for (int i=0;i<numStudent;i++){
            System.out.println((i+1)+"."+name[i]+"-"+grades[i]);
        }
        
        System.out.println("("+aveS+")/"+numStudent+"="+ave);
        //end of arraylist/loop

        System.out.println("Hi Prof! "+yName);
        System.out.println("There are "+pg+" passed and "+fg+" failed among the "+numStudent+" student grades.");

        if(pg>fg){
            System.out.println("CONGRATULATIONS MAJORITY OF THE STUDENTS PASSED!");

        }
        else{
            System.out.println("SADLY MAJORITY OF THE STUDENTS FAILED!");
        }

/*Sample output
Enter your name: karlo
Enter number of Student you want to input: 3
Enter Student name:bien
Enter Grades: 76
GRADE PASSED!
Enter Student name:bion
Enter Grades: 78
GRADE PASSED!
Enter Student name:haze
Enter Grades: 74
GRADE FAILED!
1.bien-76
2.bion-78
3.haze-74
(76+78+74+)/3=76
Hi Prof! karlo
There are 2 passed and 1 failed among the 3 student grades.
CONGRATULATIONS MAJORITY OF THE STUDENTS PASSED!
 */





        



    


    }
}
