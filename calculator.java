import java.util.*;
public class calculator{
public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
System.out.println("num1");
int a=s.nextInt();
System.out.println("num2");
int b=s.nextInt();
System.out.println("operation");
String p=s.next();

name();


opera(a,b,p);

//System.out.println(getnum());


}

public static void name() {
    System.out.println("hi again");
}
public static void opera(int a,int b,String op) {
    if(op.equalsIgnoreCase("ADD")){
           System.out.println(a+b);
    }else if(op.equalsIgnoreCase("sub")){
        System.out.println(a-b);
    }else if(op.equalsIgnoreCase("multi")){
        System.out.println(a*b);
    }else if(op.equalsIgnoreCase("div")){
        System.out.println(a/b);
    }else System.out.println("error");
 
}

public static int getnum(){
    return 10;
}


}
